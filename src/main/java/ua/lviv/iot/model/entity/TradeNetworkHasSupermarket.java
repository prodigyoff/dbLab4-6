package ua.lviv.iot.model.entity;

import ua.lviv.iot.model.annotation.Column;
import ua.lviv.iot.model.annotation.PrimaryKey;
import ua.lviv.iot.model.annotation.Table;

@Table(name = "trade_network_has_supermarket")
public class TradeNetworkHasSupermarket {

    @PrimaryKey
    @Column(name = "trade_network_id")
    private Integer tradeNetworkId;

    @Column(name = "supermarket_id")
    private Integer supermarketId;

    public TradeNetworkHasSupermarket() {
    }

    public TradeNetworkHasSupermarket(Integer supermarketId){
        this(-1, supermarketId);
    }

    public TradeNetworkHasSupermarket(Integer tradeNetworkId, Integer supermarketId) {
        this.tradeNetworkId = tradeNetworkId;
        this.supermarketId = supermarketId;
    }

    public Integer getTradeNetworkId() {
        return tradeNetworkId;
    }

    public void setTradeNetworkId(Integer tradeNetworkId) {
        this.tradeNetworkId = tradeNetworkId;
    }

    public Integer getSupermarketId() {
        return supermarketId;
    }

    public void setSupermarketId(Integer supermarketId) {
        this.supermarketId = supermarketId;
    }

    @Override
    public String toString() {
        return "TradeNetworkHasSupermarket{" +
                "tradeNetworkId=" + tradeNetworkId +
                ", supermarketId=" + supermarketId +
                '}';
    }
}