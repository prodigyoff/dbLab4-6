package ua.lviv.iot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.dataaccess.StreetRepository;
import ua.lviv.iot.dataaccess.SupermarketRepository;
import ua.lviv.iot.domain.Street;
import ua.lviv.iot.domain.Supermarket;

@Service
public class SupermarketService extends GeneralService<Supermarket, Integer> {

    @Autowired
    SupermarketRepository supermarketRepository;

    @Override
    public JpaRepository<Supermarket, Integer> getRepository() {
        return supermarketRepository;
    }
}
