package ua.lviv.iot.service;

import ua.lviv.iot.DAO.StreetDAO;
import ua.lviv.iot.model.entity.Street;

public class StreetService extends AbstractService<Street, Integer, StreetDAO> {

    public StreetService(){
        super(StreetDAO.class);
    }
}
