package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.domain.Supermarket;
import ua.lviv.iot.domain.TradeNetwork;
import ua.lviv.iot.service.ServiceInterface;
import ua.lviv.iot.service.SupermarketService;
import ua.lviv.iot.service.TradeNetworkService;

@RestController
@RequestMapping("/trade_network")
public class TradeNetworkController extends AbstractController<TradeNetwork, Integer> {

    @Autowired
    TradeNetworkService tradeNetworkService;

    @Override
    public ServiceInterface<TradeNetwork, Integer> getService() {
        return tradeNetworkService;
    }

}
