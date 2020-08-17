package one.philosopherstone.knittingconversions.models;

public class Color extends AbstractEntity{
    private String name;

    public Color() {
    }

    public Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
