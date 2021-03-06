package one.philosopherstone.knittingconversions.models.data;

import one.philosopherstone.knittingconversions.models.Color;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepository extends CrudRepository<Color, Integer> {
}
