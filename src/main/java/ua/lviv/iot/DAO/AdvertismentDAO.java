package ua.lviv.iot.DAO;

import ua.lviv.iot.model.entity.Advertisment;

public class AdvertismentDAO extends BaseDAO<Advertisment, Integer>{
    public AdvertismentDAO() {
        super(Advertisment.class);
    }
}
