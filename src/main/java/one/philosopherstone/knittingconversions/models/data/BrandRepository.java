package one.philosopherstone.knittingconversions.models.data;

import one.philosopherstone.knittingconversions.models.Brand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends CrudRepository<Brand, Integer> {
}
