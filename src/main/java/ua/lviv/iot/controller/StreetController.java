package ua.lviv.iot.controller;

import ua.lviv.iot.model.entity.Street;
import ua.lviv.iot.service.StreetService;

public class StreetController extends AbstractController<Street, Integer, StreetService> {

    public StreetController(){
        super(StreetService.class);
    }
}
