package ua.lviv.iot.DAO;

import org.hibernate.Session;

import java.sql.SQLException;
import java.util.List;

public interface DAOTemplate<T, ID> {

    List<T> getAll(Session session) throws SQLException;

    T get(ID id, Session session) throws SQLException;

    void delete(ID id, Session session) throws SQLException;

    void update(T entity, Session session) throws SQLException;

    void create(T entity, Session session) throws SQLException;
}
