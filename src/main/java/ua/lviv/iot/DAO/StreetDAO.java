package ua.lviv.iot.DAO;

import ua.lviv.iot.model.entity.Street;

public class StreetDAO extends BaseDAO<Street, Integer> {
    public StreetDAO(){
        super(Street.class);
    }
}
