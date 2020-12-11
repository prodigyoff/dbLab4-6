package ua.lviv.iot.service;

import ua.lviv.iot.DAO.DAOTemplate;

import java.sql.SQLException;
import java.util.List;

public abstract class AbstractService<T, ID, DAO> implements ServiceTemplate<T, ID> {

    private DAOTemplate<T,ID> dataAccess;

    @SuppressWarnings({ "unchecked", "deprecation" })
    public AbstractService(Class<DAO> currentClass) {
        try {
            dataAccess = (DAOTemplate<T, ID>) currentClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<T> getAll() throws SQLException {
        return dataAccess.getAll();
    }

    @Override
    public T getBy(ID id) throws SQLException {
        return dataAccess.getBy(id);
    }

    @Override
    public int delete(ID id) throws SQLException {
        return dataAccess.delete(id);
    }

    @Override
    public int update(T entity) throws SQLException {
        return dataAccess.update(entity);
    }

    @Override
    public int create(T entity) throws SQLException {
        return dataAccess.create(entity);
    }
}
