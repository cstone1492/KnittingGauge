package one.philosopherstone.knittingconversions.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Color extends AbstractEntity{

    @OneToMany(mappedBy = "color")
    private final List<Yarn> yarns = new ArrayList<>();

    public Color() {
    }

}
