package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.domain.Street;
import ua.lviv.iot.domain.Supermarket;
import ua.lviv.iot.service.ServiceInterface;
import ua.lviv.iot.service.StreetService;
import ua.lviv.iot.service.SupermarketService;

@RestController
@RequestMapping("/supermarket")
public class SupermarketController extends AbstractController<Supermarket, Integer> {

    @Autowired
    SupermarketService supermarketService;

    @Override
    public ServiceInterface<Supermarket, Integer> getService() {
        return supermarketService;
    }

}
