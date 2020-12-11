package ua.lviv.iot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.dataaccess.HouseRepository;
import ua.lviv.iot.dataaccess.SectionRepository;
import ua.lviv.iot.domain.House;
import ua.lviv.iot.domain.Section;

@Service
public class SectionService extends GeneralService<Section, Integer> {

    @Autowired
    SectionRepository sectionRepository;

    @Override
    public JpaRepository<Section, Integer> getRepository() {
        return sectionRepository;
    }
}
