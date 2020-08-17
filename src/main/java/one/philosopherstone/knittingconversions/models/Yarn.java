package one.philosopherstone.knittingconversions.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Yarn extends AbstractEntity{

    private String brand;

    private String weight;

    private Integer wpi;

    @ManyToOne
    private Color color;

    //link to gauge, list of gauges with associated needle size
    @ManyToMany
    private List<Gauge> gauges = new ArrayList<>();

    public Yarn() {
    }

    public Yarn(String brand, String weight, Integer wpi, Color color) {
        this.brand = brand;
        this.weight = weight;
        this.wpi = wpi;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Integer getWpi() {
        return wpi;
    }

    public void setWpi(Integer wpi) {
        this.wpi = wpi;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
