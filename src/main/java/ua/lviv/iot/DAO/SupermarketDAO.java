package ua.lviv.iot.DAO;

import ua.lviv.iot.model.entity.Supermarket;

public class SupermarketDAO extends BaseDAO<Supermarket, Integer> {
    public SupermarketDAO(){
        super(Supermarket.class);
    }
}
