package ua.lviv.iot.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.AdvertismentPanel;
import ua.lviv.iot.domain.House;

@Repository
public interface HouseRepository extends JpaRepository<House, Integer> {
}
