package ua.lviv.iot.controller;

import ua.lviv.iot.model.entity.City;
import ua.lviv.iot.service.CityService;

public class CityController extends AbstractController<City, Integer, CityService> {

    public CityController(){
        super(CityService.class);
    }
}
