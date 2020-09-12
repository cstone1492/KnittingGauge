package one.philosopherstone.knittingconversions.models.data;

import one.philosopherstone.knittingconversions.models.Weight;
import one.philosopherstone.knittingconversions.models.Yarn;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeightRepository extends CrudRepository<Weight, Integer> {
}
