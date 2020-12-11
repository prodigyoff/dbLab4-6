package ua.lviv.iot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.dataaccess.AdvertismentPanelRepository;
import ua.lviv.iot.dataaccess.AdvertismentRepository;
import ua.lviv.iot.domain.Advertisment;
import ua.lviv.iot.domain.AdvertismentPanel;

@Service
public class AdvertismentPanelService extends GeneralService<AdvertismentPanel, Integer> {

    @Autowired
    AdvertismentPanelRepository advertismentPanelRepository;

    @Override
    public JpaRepository<AdvertismentPanel, Integer> getRepository() {
        return advertismentPanelRepository;
    }
}
