package ua.lviv.iot.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import ua.lviv.iot.service.ServiceInterface;

import java.sql.SQLException;
import java.util.List;

@SuppressWarnings({ "deprecation", "rawtypes", "unchecked" })
public abstract class AbstractController<T, ID> implements ControllerTemplate<T, ID> {

    @Override
    public abstract ServiceInterface<T, ID> getService();

    @Override
    @GetMapping("")
    public List<T> getAll() throws SQLException {
        return getService().getAll();
    }

    @Override
    @GetMapping("/{id}")
    public T get(ID id) throws SQLException {
        return (T) getService().get(id);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(ID id) throws SQLException {
        getService().delete(id);
    }

    @Override
    @PutMapping("/{id}")
    public void update(T entity) throws SQLException {
        getService().update(entity);
    }

    @Override
    @PostMapping("")
    public void create(T entity) throws SQLException {
        getService().create(entity);
    }
}
