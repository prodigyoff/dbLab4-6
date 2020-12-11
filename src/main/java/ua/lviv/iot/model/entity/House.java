package ua.lviv.iot.model.entity;

import javax.persistence.Column;
import javax.persistence.Table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "House")
@Table(name = "house")
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "street_id")
    private Integer streetId;

    public House(){
    }

    public House(Integer streetId) {
        this(-1, streetId);
    }

    public House(Integer id, Integer streetId) {
        this.id = id;
        this.streetId = streetId;
    }

    public Integer getId() {
        return id;
    }

    public Integer getStreetId() {
        return streetId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStreetId(Integer streetId) {
        this.streetId = streetId;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", streetId=" + streetId +
                '}';
    }
}
