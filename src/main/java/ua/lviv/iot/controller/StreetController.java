package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.domain.Section;
import ua.lviv.iot.domain.Street;
import ua.lviv.iot.service.SectionService;
import ua.lviv.iot.service.ServiceInterface;
import ua.lviv.iot.service.StreetService;

@RestController
@RequestMapping("/street")
public class StreetController extends AbstractController<Street, Integer> {

    @Autowired
    StreetService streetService;

    @Override
    public ServiceInterface<Street, Integer> getService() {
        return streetService;
    }

}

