package ua.lviv.iot.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.AdvertismentPanel;
import ua.lviv.iot.domain.SupermarketHasSection;

@Repository
public interface SupermarketHasSectionRepository extends JpaRepository<SupermarketHasSection, Integer> {
}
