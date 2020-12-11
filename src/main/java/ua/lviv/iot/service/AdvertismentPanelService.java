package ua.lviv.iot.service;

import ua.lviv.iot.DAO.AdvertismentPanelDAO;
import ua.lviv.iot.model.entity.AdvertismentPanel;

public class AdvertismentPanelService extends AbstractService<AdvertismentPanel, Integer, AdvertismentPanelDAO> {

    public AdvertismentPanelService(){
        super(AdvertismentPanelDAO.class);
    }
}
