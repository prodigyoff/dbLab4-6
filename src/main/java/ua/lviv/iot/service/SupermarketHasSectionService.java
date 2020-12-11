package ua.lviv.iot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.dataaccess.SupermarketHasSectionRepository;
import ua.lviv.iot.dataaccess.TradeNetworkHasSupermarketRepository;
import ua.lviv.iot.domain.SupermarketHasSection;
import ua.lviv.iot.domain.TradeNetworkHasSupermarket;

@Service
public class SupermarketHasSectionService extends GeneralService<SupermarketHasSection, Integer> {
    @Autowired
    SupermarketHasSectionRepository supermarketHasSectionRepository;

    @Override
    public JpaRepository<SupermarketHasSection, Integer> getRepository() {
        return supermarketHasSectionRepository;
    }
}
