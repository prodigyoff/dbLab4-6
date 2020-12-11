package ua.lviv.iot.service;

import org.hibernate.Session;

import java.sql.SQLException;
import java.util.List;

public interface ServiceTemplate<T, ID> {

    List<T> getAll(Session session) throws SQLException;

    T get(ID id, Session session) throws SQLException;

    void delete(ID id, Session session) throws SQLException;

    void update(T entity, Session session) throws SQLException;

    void create(T entity, Session session) throws SQLException;
}
