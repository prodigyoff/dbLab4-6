package ua.lviv.iot.model.entity;

import ua.lviv.iot.model.annotation.Column;
import ua.lviv.iot.model.annotation.PrimaryKey;
import ua.lviv.iot.model.annotation.Table;

@Table(name = "supermarket_has_section")
public class SupermarketHasSection {

    @PrimaryKey
    @Column(name = "supermarket_id")
    private Integer supermarketId;

    @Column(name = "section_id")
    private Integer sectionId;

    public SupermarketHasSection() {
    }

    public SupermarketHasSection(Integer sectionId){
        this(-1, sectionId);
    }

    public SupermarketHasSection(Integer supermarketId, Integer sectionId) {
        this.supermarketId = supermarketId;
        this.sectionId = sectionId;
    }

    public Integer getSupermarketId() {
        return supermarketId;
    }

    public void setSupermarketId(Integer supermarketId) {
        this.supermarketId = supermarketId;
    }

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    @Override
    public String toString() {
        return "SupermarketHasSection{" +
                "supermarketId=" + supermarketId +
                ", sectionId=" + sectionId +
                '}';
    }
}
