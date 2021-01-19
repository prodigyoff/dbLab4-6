package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.domain.City;
import ua.lviv.iot.domain.House;
import ua.lviv.iot.service.CityService;
import ua.lviv.iot.service.HouseService;
import ua.lviv.iot.service.ServiceInterface;

@RestController
@RequestMapping("/house")
public class HouseController extends AbstractController<House, Integer> {

    @Autowired
    HouseService houseService;

    @Override
    public ServiceInterface<House, Integer> getService() {
        return houseService;
    }

}
