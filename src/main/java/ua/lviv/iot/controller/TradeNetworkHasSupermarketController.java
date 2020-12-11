package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.domain.SupermarketHasSection;
import ua.lviv.iot.domain.TradeNetworkHasSupermarket;
import ua.lviv.iot.service.ServiceInterface;
import ua.lviv.iot.service.SupermarketHasSectionService;
import ua.lviv.iot.service.TradeNetworkHasSupermarketService;

@RestController
@RequestMapping("/trade_network_has_supermarket")
public class TradeNetworkHasSupermarketController extends AbstractController<TradeNetworkHasSupermarket, Integer>{
    @Autowired
    TradeNetworkHasSupermarketService tradeNetworkHasSupermarketService;

    @Override
    public ServiceInterface<TradeNetworkHasSupermarket, Integer> getService() {
        return tradeNetworkHasSupermarketService;
    }
}
