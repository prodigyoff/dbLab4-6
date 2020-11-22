package ua.lviv.iot.DAO;

import ua.lviv.iot.model.entity.Section;

public class SectionDAO extends BaseDAO<Section, Integer> {
    public SectionDAO(){
        super(Section.class);
    }
}
