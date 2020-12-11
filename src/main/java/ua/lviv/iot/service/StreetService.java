package ua.lviv.iot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.dataaccess.SectionRepository;
import ua.lviv.iot.dataaccess.StreetRepository;
import ua.lviv.iot.domain.Section;
import ua.lviv.iot.domain.Street;

@Service
public class StreetService extends GeneralService<Street, Integer> {

    @Autowired
    StreetRepository streetRepository;

    @Override
    public JpaRepository<Street, Integer> getRepository() {
        return streetRepository;
    }
}