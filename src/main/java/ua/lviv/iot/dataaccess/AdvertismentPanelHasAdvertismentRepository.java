package ua.lviv.iot.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.AdvertismentPanelHasAdvertisment;

@Repository
public interface AdvertismentPanelHasAdvertismentRepository extends JpaRepository<AdvertismentPanelHasAdvertisment, Integer> {
}
