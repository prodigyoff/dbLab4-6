package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.domain.Advertisment;
import ua.lviv.iot.domain.AdvertismentPanel;
import ua.lviv.iot.service.AdvertismentPanelService;
import ua.lviv.iot.service.AdvertismentService;
import ua.lviv.iot.service.ServiceInterface;

@RestController
@RequestMapping("/advertisment_panel")
public class AdvertismentPanelController extends AbstractController<AdvertismentPanel, Integer> {

    @Autowired
    AdvertismentPanelService advertismentPanelService;

    @Override
    public ServiceInterface<AdvertismentPanel, Integer> getService() {
        return advertismentPanelService;
    }

}
