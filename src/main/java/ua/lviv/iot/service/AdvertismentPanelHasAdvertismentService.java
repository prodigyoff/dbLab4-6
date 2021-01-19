package ua.lviv.iot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.dataaccess.AdvertismentPanelHasAdvertismentRepository;
import ua.lviv.iot.dataaccess.AdvertismentPanelRepository;
import ua.lviv.iot.domain.AdvertismentPanel;
import ua.lviv.iot.domain.AdvertismentPanelHasAdvertisment;

@Service
public class AdvertismentPanelHasAdvertismentService extends GeneralService<AdvertismentPanelHasAdvertisment, Integer> {
    @Autowired
    AdvertismentPanelHasAdvertismentRepository advertismentPanelHasAdvertismentRepository;

    @Override
    public JpaRepository<AdvertismentPanelHasAdvertisment, Integer> getRepository() {
        return advertismentPanelHasAdvertismentRepository;
    }
}
