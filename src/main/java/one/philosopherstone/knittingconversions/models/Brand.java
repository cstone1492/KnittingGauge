package one.philosopherstone.knittingconversions.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Brand extends AbstractEntity{

    @OneToMany(mappedBy = "brand", cascade = CascadeType.ALL)
    private final List<Yarn> yarns = new ArrayList<>();

    public Brand() {
        super();
    }

    public List<Yarn> getYarns() {
        return yarns;
    }

}
