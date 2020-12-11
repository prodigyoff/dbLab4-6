package ua.lviv.iot.model.entity;

import javax.persistence.Column;
import javax.persistence.Table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Street")
@Table(name = "street")
public class Street {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "city_id")
    private Integer cityId;

    @Column(name = "name")
    private String name;

    public Street() {
    }

    public Street(Integer cityId, String name){
        this(-1, cityId, name);
    }

    public Street(Integer id, Integer cityId, String name) {
        this.id = id;
        this.cityId = cityId;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Street{" +
                "id=" + id +
                ", cityId=" + cityId +
                ", name='" + name + '\'' +
                '}';
    }
}
