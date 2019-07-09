package cz.digana.entropytest.repository;

import cz.digana.entropytest.model.Cat;
import org.springframework.data.repository.CrudRepository;

public interface CatRepository extends CrudRepository<Cat, Long> {
}
