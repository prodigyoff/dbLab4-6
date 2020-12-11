package ua.lviv.iot.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ua.lviv.iot.service.AbstractService;

import java.sql.SQLException;
import java.util.List;

@SuppressWarnings({ "deprecation", "rawtypes", "unchecked" })
public abstract class AbstractController<T, ID, SERVICE> implements ControllerTemplate<T, ID> {

    AbstractService service;
    private static final SessionFactory sessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();
            sessionFactory = configuration.buildSessionFactory();
        } catch (Throwable throwable) {
            throw new ExceptionInInitializerError(throwable);
        }
    }

    public AbstractController(Class<SERVICE> currentClass) {
        try {
            service = (AbstractService) currentClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<T> getAll() throws SQLException {
        Session session = null;
        List<T> entities = null;
        try {
            session = sessionFactory.openSession();
            entities = service.getAll(session);
        } catch (Exception e){
            System.out.println(e);
        }
        finally {
            session.close();
        }
        return entities;
    }

    @Override
    public T get(ID id) throws SQLException {
        Session session = null;
        T entity = null;
        try {
            session = sessionFactory.openSession();
            entity = (T) service.get(id, session);
        } catch (Exception e){
            System.out.println(e);
        }
        finally {
            session.close();
        }
        return entity;
    }

    @Override
    public void delete(ID id) throws SQLException {
        try (Session session = sessionFactory.openSession()) {
            service.delete(id, session);
        }
    }

    @Override
    public void update(T entity) throws SQLException {
        try (Session session = sessionFactory.openSession()) {
            service.update(entity, session);
        }
    }

    @Override
    public void create(T entity) throws SQLException {
        try (Session session = sessionFactory.openSession()) {
            service.create(entity, session);
        }
    }
}
