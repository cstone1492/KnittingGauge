package one.philosopherstone.knittingconversions.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Weight extends AbstractEntity{

    @OneToMany(mappedBy = "weight")
    private final List<Yarn> yarns = new ArrayList<>();

    public Weight () {
    }

}
