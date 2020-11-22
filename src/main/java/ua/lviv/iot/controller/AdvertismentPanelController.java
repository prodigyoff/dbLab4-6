package ua.lviv.iot.controller;

import ua.lviv.iot.model.entity.AdvertismentPanel;
import ua.lviv.iot.service.AdvertismentPanelService;

public class AdvertismentPanelController extends AbstractController<AdvertismentPanel, Integer, AdvertismentPanelService> {

    public AdvertismentPanelController(){
        super(AdvertismentPanelService.class);
    }
}
