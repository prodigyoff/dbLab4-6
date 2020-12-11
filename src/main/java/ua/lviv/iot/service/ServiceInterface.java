package ua.lviv.iot.service;

import org.hibernate.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public interface ServiceInterface<T, ID> {

    List<T> getAll() throws SQLException;

    T get(ID id) throws SQLException;

    void delete(ID id) throws SQLException;

    void update(T entity) throws SQLException;

    void create(T entity) throws SQLException;

    JpaRepository<T, ID> getRepository();

}
