package ua.lviv.iot.service;

import ua.lviv.iot.DAO.SupermarketDAO;
import ua.lviv.iot.model.entity.Supermarket;

public class SupermarketService extends AbstractService<Supermarket, Integer, SupermarketDAO> {

    public SupermarketService(){
        super(SupermarketDAO.class);
    }
}
