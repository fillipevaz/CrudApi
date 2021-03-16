package fillipe.crudrestapi.service;

import fillipe.crudrestapi.model.LivroModel;
import fillipe.crudrestapi.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroServiceImpl implements LivroService {

    @Autowired
    private LivroRepository repository;

    public LivroModel updateLivro(LivroModel livroModel)
    {

        LivroModel existLivro = repository.findById(livroModel.getCodigo()).orElseThrow
                (
                        () -> new IllegalStateException
                                (
                                        "Livro com o id: "+livroModel.getCodigo()+" não existe !"
                                )
                );
        existLivro.setAutor(livroModel.autor);
        existLivro.setEdicao(livroModel.edicao);
        existLivro.setNome(livroModel.nome);
        return repository.save(existLivro);
    }


    @Override
    public Iterable<LivroModel> findAll() {
        return repository.findAll();
    }

    @Override
    public LivroModel find(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public LivroModel save(LivroModel livroModel) {
        return  repository.save(livroModel);
    }

    @Override
    public void delete(int id) {
        boolean exists = repository.existsById(id);
        if(!exists)
        {
            throw new IllegalStateException
                    (
                            "Livro com o id: "+id+" não existe !"
                    );
        }
        repository.deleteById(id);
    }
}
