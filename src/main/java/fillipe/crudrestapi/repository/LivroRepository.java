package fillipe.crudrestapi.repository;

import fillipe.crudrestapi.model.LivroModel;
import org.springframework.data.repository.CrudRepository;

public interface LivroRepository extends CrudRepository<LivroModel, Integer > {
}
