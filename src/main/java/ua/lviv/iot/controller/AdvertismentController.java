package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.domain.Advertisment;
import ua.lviv.iot.service.AdvertismentService;
import ua.lviv.iot.service.ServiceInterface;

@RestController
@RequestMapping("/advertisment")
public class AdvertismentController extends AbstractController<Advertisment, Integer> {

    @Autowired
    AdvertismentService advertismentService;

    @Override
    public ServiceInterface<Advertisment, Integer> getService() {
        return advertismentService;
    }

}
