package ua.lviv.iot.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.House;
import ua.lviv.iot.domain.Section;

@Repository
public interface SectionRepository extends JpaRepository<Section, Integer> {
}
