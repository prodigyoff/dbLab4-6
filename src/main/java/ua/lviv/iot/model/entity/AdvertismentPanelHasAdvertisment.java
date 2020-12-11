package ua.lviv.iot.model.entity;

import ua.lviv.iot.model.annotation.Column;
import ua.lviv.iot.model.annotation.PrimaryKey;
import ua.lviv.iot.model.annotation.Table;

@Table(name = "advertisment_panel_has_advertisment")
public class AdvertismentPanelHasAdvertisment {

    @PrimaryKey
    @Column(name = "advertisment_panel_id")
    private Integer advertismentPanelId;

    @Column(name = "advertisment_id")
    private Integer advertismentId;

    public AdvertismentPanelHasAdvertisment() {
    }

    public AdvertismentPanelHasAdvertisment(Integer advertismentId){
        this(-1, advertismentId);
    }

    public AdvertismentPanelHasAdvertisment(Integer advertismentPanelId, Integer advertismentId) {
        this.advertismentPanelId = advertismentPanelId;
        this.advertismentId = advertismentId;
    }

    public Integer getAdvertismentPanelId() {
        return advertismentPanelId;
    }

    public void setAdvertismentPanelId(Integer advertismentPanelId) {
        this.advertismentPanelId = advertismentPanelId;
    }

    public Integer getAdvertismentId() {
        return advertismentId;
    }

    public void setAdvertismentId(Integer advertismentId) {
        this.advertismentId = advertismentId;
    }

    @Override
    public String toString() {
        return "AdvertismentPanelHasAdvertisment{" +
                "advertismentPanelId=" + advertismentPanelId +
                ", advertismentId=" + advertismentId +
                '}';
    }
}
