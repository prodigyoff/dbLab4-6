package ua.lviv.iot.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.Advertisment;

@Repository
public interface AdvertismentRepository extends JpaRepository<Advertisment, Integer> {
}
