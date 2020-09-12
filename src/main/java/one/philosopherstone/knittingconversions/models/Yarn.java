package one.philosopherstone.knittingconversions.models;

import one.philosopherstone.knittingconversions.models.data.GaugeRepository;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Yarn extends AbstractEntity{

    @ManyToOne
    private Brand brand;

    @ManyToOne
    private Weight weight;

    @ManyToOne
    private Color color;

    //link to gauge, list of gauges with associated needle size
    @ManyToMany
    private List<Gauge> gauges = new ArrayList<>();

    public Yarn() {
    }

    public Yarn(Brand brand, Weight weight, Color color, GaugeRepository someGauges) {
        this.brand = brand;
        this.weight = weight;
        this.color = color;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public List<Gauge> getGauges() {
        return gauges;
    }

    public void setGauges(List<Gauge> gauges) {
        this.gauges = gauges;
    }
}
