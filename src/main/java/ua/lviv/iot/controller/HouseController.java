package ua.lviv.iot.controller;

import ua.lviv.iot.model.entity.House;
import ua.lviv.iot.service.HouseService;

public class HouseController extends AbstractController<House, Integer, HouseService> {

    public HouseController(){
        super(HouseService.class);
    }
}
