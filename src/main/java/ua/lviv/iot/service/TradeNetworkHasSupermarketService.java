package ua.lviv.iot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.dataaccess.TradeNetworkHasSupermarketRepository;
import ua.lviv.iot.domain.TradeNetworkHasSupermarket;

@Service
public class TradeNetworkHasSupermarketService extends GeneralService<TradeNetworkHasSupermarket, Integer> {

    @Autowired
    TradeNetworkHasSupermarketRepository tradeNetworkHasSupermarketRepository;

    @Override
    public JpaRepository<TradeNetworkHasSupermarket, Integer> getRepository() {
        return tradeNetworkHasSupermarketRepository;
    }
}
