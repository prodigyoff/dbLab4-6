package ua.lviv.iot.DAO;

import ua.lviv.iot.model.entity.House;

public class HouseDAO extends BaseDAO<House, Integer> {
    public HouseDAO(){
        super(House.class);
    }
}
