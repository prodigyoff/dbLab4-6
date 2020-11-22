package ua.lviv.iot.DAO;

import ua.lviv.iot.model.entity.TradeNetwork;

public class TradeNetworkDAO extends BaseDAO<TradeNetwork, Integer> {
    public TradeNetworkDAO(){
        super(TradeNetwork.class);
    }
}
