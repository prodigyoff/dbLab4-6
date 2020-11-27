package ua.lviv.iot.model.entity;

import javax.persistence.Column;
import javax.persistence.Table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Supermarket_has_section")
@Table(name = "supermarket_has_section")
public class SupermarketHasSection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
