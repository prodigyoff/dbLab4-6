package ua.lviv.iot.service;

import ua.lviv.iot.DAO.SectionDAO;
import ua.lviv.iot.model.entity.Section;

public class SectionService extends AbstractService<Section, Integer, SectionDAO> {

    public SectionService(){
        super(SectionDAO.class);
    }
}
