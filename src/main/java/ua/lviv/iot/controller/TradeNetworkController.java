package ua.lviv.iot.controller;

import ua.lviv.iot.model.entity.TradeNetwork;
import ua.lviv.iot.service.TradeNetworkService;

public class TradeNetworkController extends AbstractController<TradeNetwork, Integer, TradeNetworkService> {

    public TradeNetworkController(){
        super(TradeNetworkService.class);
    }
}
