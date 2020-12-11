package ua.lviv.iot.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.House;
import ua.lviv.iot.domain.Street;

@Repository
public interface StreetRepository extends JpaRepository<Street, Integer> {
}
