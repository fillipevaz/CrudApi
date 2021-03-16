package fillipe.crudrestapi.service;

import fillipe.crudrestapi.model.LivroModel;

public interface LivroService {

    public Iterable<LivroModel> findAll();

    public LivroModel find(int id);

    public LivroModel save(LivroModel livroModel);

    public void delete(int id);

}
