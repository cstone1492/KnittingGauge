package one.philosopherstone.knittingconversions.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Optional;

@Entity
public class Yarn extends AbstractEntity{

    @ManyToOne
    private Brand brand;

    @ManyToOne
    private Weight weight;

    @ManyToOne
    private Color color;

    public Yarn() {
    }

    public Yarn(Brand brand, Weight weight, Color color) {
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

}
