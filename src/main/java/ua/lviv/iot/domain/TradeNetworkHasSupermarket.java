package ua.lviv.iot.domain;

import javax.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "trade_network_has_supermarket")
public class TradeNetworkHasSupermarket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "supermarket_id", referencedColumnName = "id")
    private Supermarket supermarket;


    @ManyToOne
    @JoinColumn(name = "trade_network_id", referencedColumnName = "id")
    private TradeNetwork tradeNetwork;

    public TradeNetworkHasSupermarket() {
    }

    public TradeNetworkHasSupermarket(Supermarket supermarket, TradeNetwork tradeNetwork) {
        this.supermarket = supermarket;
        this.tradeNetwork = tradeNetwork;
    }

    public TradeNetworkHasSupermarket(Integer id, Supermarket supermarket, TradeNetwork tradeNetwork) {
        this.id = id;
        this.supermarket = supermarket;
        this.tradeNetwork = tradeNetwork;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Supermarket getSupermarket() {
        return supermarket;
    }

    public void setSupermarket(Supermarket supermarket) {
        this.supermarket = supermarket;
    }

    public TradeNetwork getTradeNetwork() {
        return tradeNetwork;
    }

    public void setTradeNetwork(TradeNetwork tradeNetwork) {
        this.tradeNetwork = tradeNetwork;
    }

    @Override
    public String toString() {
        return "TradeNetworkHasSupermarket{" +
                "id=" + id +
                ", supermarket=" + supermarket +
                ", tradeNetwork=" + tradeNetwork +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TradeNetworkHasSupermarket that = (TradeNetworkHasSupermarket) o;
        return id.equals(that.id) &&
                supermarket.equals(that.supermarket) &&
                tradeNetwork.equals(that.tradeNetwork);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, supermarket, tradeNetwork);
    }
}
