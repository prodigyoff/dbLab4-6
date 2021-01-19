package ua.lviv.iot.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "advertisment_panel_has_advertisment")
public class AdvertismentPanelHasAdvertisment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "advertisment_id", referencedColumnName = "id")
    private Advertisment advertisment;


    @ManyToOne
    @JoinColumn(name = "advertisment_panel_id", referencedColumnName = "id")
    private AdvertismentPanel advertismentPanel;

    public AdvertismentPanelHasAdvertisment() {
    }


    public AdvertismentPanelHasAdvertisment(Advertisment advertisment, AdvertismentPanel advertismentPanel) {
        this.advertisment = advertisment;
        this.advertismentPanel = advertismentPanel;
    }

    public AdvertismentPanelHasAdvertisment(Integer id, Advertisment advertisment, AdvertismentPanel advertismentPanel) {
        this.id = id;
        this.advertisment = advertisment;
        this.advertismentPanel = advertismentPanel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Advertisment getAdvertisment() {
        return advertisment;
    }

    public void setAdvertisment(Advertisment advertisment) {
        this.advertisment = advertisment;
    }

    public AdvertismentPanel getAdvertismentPanel() {
        return advertismentPanel;
    }

    public void setAdvertismentPanel(AdvertismentPanel advertismentPanel) {
        this.advertismentPanel = advertismentPanel;
    }

    @Override
    public String toString() {
        return "AdvertismentPanelHasAdvertisment{" +
                "id=" + id +
                ", advertisment=" + advertisment +
                ", advertismentPanel=" + advertismentPanel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdvertismentPanelHasAdvertisment that = (AdvertismentPanelHasAdvertisment) o;
        return id.equals(that.id) &&
                advertisment.equals(that.advertisment) &&
                advertismentPanel.equals(that.advertismentPanel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, advertisment, advertismentPanel);
    }
}
