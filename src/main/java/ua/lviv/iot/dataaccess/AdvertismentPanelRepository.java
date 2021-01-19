package ua.lviv.iot.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.AdvertismentPanel;

@Repository
public interface AdvertismentPanelRepository extends JpaRepository<AdvertismentPanel, Integer> {
}
