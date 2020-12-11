package ua.lviv.iot.service;

import org.hibernate.Session;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.SQLException;
import java.util.List;

public abstract class GeneralService<T, ID> implements ServiceInterface<T, ID> {

    @Override
    public abstract JpaRepository<T, ID> getRepository();

    @Override
    public List<T> getAll() throws SQLException {
        return getRepository().findAll();
    }

    @Override
    public T get(ID id) throws SQLException {
        return (T) getRepository().findById(id).orElse(null);
    }

    @Override
    public void delete(ID id) throws SQLException {
        getRepository().deleteById(id);
    }

    @Override
    public void update(T entity) throws SQLException {
        getRepository().save(entity);
    }

    @Override
    public void create(T entity) throws SQLException {
        getRepository().save(entity);
    }

}

