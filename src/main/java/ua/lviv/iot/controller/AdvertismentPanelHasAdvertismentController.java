package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.domain.AdvertismentPanel;
import ua.lviv.iot.domain.AdvertismentPanelHasAdvertisment;
import ua.lviv.iot.service.AdvertismentPanelHasAdvertismentService;
import ua.lviv.iot.service.AdvertismentPanelService;
import ua.lviv.iot.service.ServiceInterface;

@RestController
@RequestMapping("/advertisment_panel_has_advertisment")
public class AdvertismentPanelHasAdvertismentController extends AbstractController<AdvertismentPanelHasAdvertisment, Integer> {
    @Autowired
    AdvertismentPanelHasAdvertismentService advertismentPanelHasAdvertismentService;

    @Override
    public ServiceInterface<AdvertismentPanelHasAdvertisment, Integer> getService() {
        return advertismentPanelHasAdvertismentService;
    }
}
