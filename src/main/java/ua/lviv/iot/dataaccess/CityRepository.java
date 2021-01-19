package ua.lviv.iot.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
}
