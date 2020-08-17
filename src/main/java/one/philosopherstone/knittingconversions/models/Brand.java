package one.philosopherstone.knittingconversions.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Brand extends AbstractEntity{

    @OneToMany(mappedBy = "brand")
    private final List<Yarn> yarns = new ArrayList<>();

}
