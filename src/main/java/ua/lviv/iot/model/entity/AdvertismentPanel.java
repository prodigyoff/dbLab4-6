package ua.lviv.iot.model.entity;

import ua.lviv.iot.model.annotation.Column;
import ua.lviv.iot.model.annotation.PrimaryKey;
import ua.lviv.iot.model.annotation.Table;

@Table(name = "advertisment_panel")
public class AdvertismentPanel {

    @PrimaryKey
    @Column(name = "id")
    private Integer id;

    @Column(name = "producer")
    private String producer;

    @Column(name = "screen_resolution")
    private String screenResolution;

    @Column(name = "consuming_power_amount_in_wats")
    private Integer consumingPowerInWats;

    @Column(name = "section_id")
    private Integer sectionId;

    @Column(name = "number_of_panels")
    private Integer numberOfPanels;

    public AdvertismentPanel() {
    }

    public AdvertismentPanel(String producer, String screenResolution, Integer consumingPowerInWats,
                             Integer sectionId, Integer numberOfPanels){
        this(-1, producer, screenResolution, consumingPowerInWats, sectionId, numberOfPanels);
    }

    public AdvertismentPanel(Integer id, String producer, String screenResolution, Integer consumingPowerInWats,
                             Integer sectionId, Integer numberOfPanels) {
        this.id = id;
        this.producer = producer;
        this.screenResolution = screenResolution;
        this.consumingPowerInWats = consumingPowerInWats;
        this.sectionId = sectionId;
        this.numberOfPanels = numberOfPanels;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public Integer getConsumingPowerInWats() {
        return consumingPowerInWats;
    }

    public void setConsumingPowerInWats(Integer consumingPowerInWats) {
        this.consumingPowerInWats = consumingPowerInWats;
    }

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public Integer getNumberOfPanels() {
        return numberOfPanels;
    }

    public void setNumberOfPanels(Integer numberOfPanels) {
        this.numberOfPanels = numberOfPanels;
    }

    @Override
    public String toString() {
        return "AdvertismentPanel{" +
                "id=" + id +
                ", producer='" + producer + '\'' +
                ", screenResolution='" + screenResolution + '\'' +
                ", consumingPowerInWats=" + consumingPowerInWats +
                ", sectionId=" + sectionId +
                ", numberOfPanels=" + numberOfPanels +
                '}';
    }
}
