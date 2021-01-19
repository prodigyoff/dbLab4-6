package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.domain.AdvertismentPanelHasAdvertisment;
import ua.lviv.iot.domain.SupermarketHasSection;
import ua.lviv.iot.service.AdvertismentPanelHasAdvertismentService;
import ua.lviv.iot.service.ServiceInterface;
import ua.lviv.iot.service.SupermarketHasSectionService;

@RestController
@RequestMapping("/supermarket_has_section")
public class SupermarketHasSectionController extends AbstractController<SupermarketHasSection, Integer> {
    @Autowired
    SupermarketHasSectionService supermarketHasSectionService;

    @Override
    public ServiceInterface<SupermarketHasSection, Integer> getService() {
        return supermarketHasSectionService;
    }
}
