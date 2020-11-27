package ua.lviv.iot.service;

import org.hibernate.Session;
import ua.lviv.iot.DAO.BaseDAO;
import ua.lviv.iot.DAO.DAOTemplate;

import java.sql.SQLException;
import java.util.List;

public abstract class AbstractService<T, ID, DAO> implements ServiceTemplate<T, ID> {

    private DAOTemplate<T,ID> dataAccess;

    @SuppressWarnings({ "unchecked", "deprecation" })
    public AbstractService(Class<DAO> currentClass) {
        try {
            dataAccess = (BaseDAO<T, ID>) currentClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<T> getAll(Session session) throws SQLException {
        return dataAccess.getAll(session);
    }

    @Override
    public T get(ID id, Session session) throws SQLException {
        return dataAccess.get(id, session);
    }

    @Override
    public void delete(ID id, Session session) throws SQLException {
        dataAccess.delete(id, session);
    }

    @Override
    public void update(T entity, Session session) throws SQLException {
        dataAccess.update(entity, session);
    }

    @Override
    public void create(T entity, Session session) throws SQLException {
        dataAccess.create(entity, session);
    }

}
