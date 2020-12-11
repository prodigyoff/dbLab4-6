package ua.lviv.iot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.dataaccess.AdvertismentRepository;
import ua.lviv.iot.domain.Advertisment;

@Service
public class AdvertismentService extends GeneralService<Advertisment, Integer> {

    @Autowired
    AdvertismentRepository advertismentRepository;

    @Override
    public JpaRepository<Advertisment, Integer> getRepository() {
        return advertismentRepository;
    }
}
