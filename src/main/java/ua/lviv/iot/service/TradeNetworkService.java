package ua.lviv.iot.service;

import ua.lviv.iot.DAO.TradeNetworkDAO;
import ua.lviv.iot.model.entity.TradeNetwork;

public class TradeNetworkService extends AbstractService<TradeNetwork, Integer, TradeNetworkDAO> {

    public TradeNetworkService(){
        super(TradeNetworkDAO.class);
    }
}
