package ua.lviv.iot.domain;

import javax.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "supermarket_has_section")
public class SupermarketHasSection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "section_id", referencedColumnName = "id")
    private Section section;


    @ManyToOne
    @JoinColumn(name = "supermarket_id", referencedColumnName = "id")
    private Supermarket supermarket;

    public SupermarketHasSection() {
    }

    public SupermarketHasSection(Section section, Supermarket supermarket) {
        this.section = section;
        this.supermarket = supermarket;
    }

    public SupermarketHasSection(Integer id, Section section, Supermarket supermarket) {
        this.id = id;
        this.section = section;
        this.supermarket = supermarket;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public Supermarket getSupermarket() {
        return supermarket;
    }

    public void setSupermarket(Supermarket supermarket) {
        this.supermarket = supermarket;
    }

    @Override
    public String toString() {
        return "SupermarketHasSection{" +
                "id=" + id +
                ", section=" + section +
                ", supermarket=" + supermarket +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SupermarketHasSection that = (SupermarketHasSection) o;
        return id.equals(that.id) &&
                section.equals(that.section) &&
                supermarket.equals(that.supermarket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, section, supermarket);
    }
}
