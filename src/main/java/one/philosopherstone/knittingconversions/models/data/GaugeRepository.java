package one.philosopherstone.knittingconversions.models.data;

import one.philosopherstone.knittingconversions.models.Gauge;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GaugeRepository extends CrudRepository<Gauge, Integer> {
}
