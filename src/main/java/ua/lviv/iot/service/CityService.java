package ua.lviv.iot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.dataaccess.AdvertismentRepository;
import ua.lviv.iot.dataaccess.CityRepository;
import ua.lviv.iot.domain.Advertisment;
import ua.lviv.iot.domain.City;

@Service
public class CityService extends GeneralService<City, Integer> {

    @Autowired
    CityRepository cityRepository;

    @Override
    public JpaRepository<City, Integer> getRepository() {
        return cityRepository;
    }
}
