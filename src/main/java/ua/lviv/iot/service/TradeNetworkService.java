package ua.lviv.iot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.dataaccess.SupermarketRepository;
import ua.lviv.iot.dataaccess.TradeNetworkRepository;
import ua.lviv.iot.domain.Supermarket;
import ua.lviv.iot.domain.TradeNetwork;

@Service
public class TradeNetworkService extends GeneralService<TradeNetwork, Integer> {

    @Autowired
    TradeNetworkRepository tradeNetworkRepository;

    @Override
    public JpaRepository<TradeNetwork, Integer> getRepository() {
        return tradeNetworkRepository;
    }
}
