package ua.lviv.iot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.dataaccess.CityRepository;
import ua.lviv.iot.dataaccess.HouseRepository;
import ua.lviv.iot.domain.City;
import ua.lviv.iot.domain.House;

@Service
public class HouseService extends GeneralService<House, Integer> {

    @Autowired
    HouseRepository houseRepository;

    @Override
    public JpaRepository<House, Integer> getRepository() {
        return houseRepository;
    }
}
