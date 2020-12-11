package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.domain.AdvertismentPanel;
import ua.lviv.iot.domain.City;
import ua.lviv.iot.service.AdvertismentPanelService;
import ua.lviv.iot.service.CityService;
import ua.lviv.iot.service.ServiceInterface;

@RestController
@RequestMapping("/city")
public class CityController extends AbstractController<City, Integer> {

    @Autowired
    CityService cityService;

    @Override
    public ServiceInterface<City, Integer> getService() {
        return cityService;
    }

}
