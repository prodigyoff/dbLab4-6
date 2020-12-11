package ua.lviv.iot.controller;

import ua.lviv.iot.model.entity.Supermarket;
import ua.lviv.iot.service.SupermarketService;

public class SupermarketController extends AbstractController<Supermarket, Integer, SupermarketService> {

    public SupermarketController(){
        super(SupermarketService.class);
    }
}
