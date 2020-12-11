package ua.lviv.iot.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "advertisment")
public class Advertisment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "description")
    private String description;

    @Column(name = "producer")
    private String producer;

    @Column(name = "duration")
    private String duration;

    @Column(name = "trade_network_id")
    private Integer tradeNetworkId;

    public Advertisment() {
    }

    public Advertisment(String description, String producer, String duration, Integer tradeNetworkId){
        this(-1, description, producer, duration, tradeNetworkId);
    }

    public Advertisment(Integer id, String description, String producer, String duration, Integer tradeNetworkId) {
        this.id = id;
        this.description = description;
        this.producer = producer;
        this.duration = duration;
        this.tradeNetworkId = tradeNetworkId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Integer getTradeNetworkId() {
        return tradeNetworkId;
    }

    public void setTradeNetworkId(Integer tradeNetworkId) {
        this.tradeNetworkId = tradeNetworkId;
    }

    @Override
    public String toString() {
        return "Advertisment{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", producer='" + producer + '\'' +
                ", duration=" + duration +
                ", tradeNetworkId=" + tradeNetworkId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Advertisment that = (Advertisment) o;
        return id.equals(that.id) &&
                Objects.equals(description, that.description) &&
                producer.equals(that.producer) &&
                duration.equals(that.duration) &&
                tradeNetworkId.equals(that.tradeNetworkId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, producer, duration, tradeNetworkId);
    }
}
