package ua.lviv.iot.DAO;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public abstract class BaseDAO<T, ID> implements DAOTemplate<T,ID> {
    private final Class<T> currentClass;

    public BaseDAO(Class<T> currentClass) {
        this.currentClass = currentClass;
    }

    @Override
    public List<T> getAll(Session session) throws SQLException {
        List<T> entities = new LinkedList<>();
        Query query = session.createQuery("FROM " + currentClass.getSimpleName());
        for (Object entity : query.getResultList()) {
            entities.add((T) entity);
        }
        return entities;
    }

    @Override
    public T get(ID id, Session session) throws SQLException {
        return (T) session.get(currentClass, (Integer) id);
    }

    @Override
    public void delete(ID id, Session session) throws SQLException {
        session.beginTransaction();
        T deletedEntity = get(id, session);
        session.delete(deletedEntity);
        session.getTransaction().commit();
    }

    @Override
    public void update(T entity, Session session) throws SQLException {
        session.beginTransaction();
        session.update(entity);
        session.getTransaction().commit();
    }

    @Override
    public void create(T entity, Session session) throws SQLException {
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
    }
}
