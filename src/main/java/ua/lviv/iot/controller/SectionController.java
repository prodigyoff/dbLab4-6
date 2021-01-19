package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.domain.City;
import ua.lviv.iot.domain.Section;
import ua.lviv.iot.service.CityService;
import ua.lviv.iot.service.SectionService;
import ua.lviv.iot.service.ServiceInterface;

@RestController
@RequestMapping("/section")
public class SectionController extends AbstractController<Section, Integer> {

    @Autowired
    SectionService sectionService;

    @Override
    public ServiceInterface<Section, Integer> getService() {
        return sectionService;
    }

}
