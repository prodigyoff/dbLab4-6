package ua.lviv.iot.controller;

import ua.lviv.iot.model.entity.Advertisment;
import ua.lviv.iot.service.AdvertismentService;

public class AdvertismentController extends AbstractController<Advertisment, Integer, AdvertismentService> {

    public AdvertismentController(){
        super(AdvertismentService.class);
    }
}
