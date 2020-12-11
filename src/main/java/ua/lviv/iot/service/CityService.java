package ua.lviv.iot.service;

import ua.lviv.iot.DAO.CityDAO;
import ua.lviv.iot.model.entity.City;

public class CityService extends AbstractService<City, Integer, CityDAO> {
    public CityService(){
        super(CityDAO.class);
    }
}
