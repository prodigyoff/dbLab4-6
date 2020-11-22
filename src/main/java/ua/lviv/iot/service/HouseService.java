package ua.lviv.iot.service;

import ua.lviv.iot.DAO.HouseDAO;
import ua.lviv.iot.model.entity.House;

public class HouseService extends AbstractService<House, Integer, HouseDAO> {

    public HouseService(){
        super(HouseDAO.class);
    }
}
