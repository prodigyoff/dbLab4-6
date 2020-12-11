package ua.lviv.iot.service;

import ua.lviv.iot.DAO.AdvertismentDAO;
import ua.lviv.iot.model.entity.Advertisment;

public class AdvertismentService extends AbstractService<Advertisment, Integer, AdvertismentDAO> {

    public AdvertismentService(){
        super(AdvertismentDAO.class);
    }
}
