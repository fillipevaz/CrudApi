package fillipe.crudrestapi.service;

import fillipe.crudrestapi.model.LivroModel;
import fillipe.crudrestapi.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

    public LivroModel saveLivro(LivroModel livroModel)
    {
        return  repository.save(livroModel);
    }
    public Iterable<LivroModel> getLivros()
    {
        return repository.findAll();
    }

    public LivroModel getLivrosById(int id)
    {
        return repository.findById(id).orElse(null);
    }

    public String deleteLivro(int id)
    {
        repository.deleteById(id);
        return "Livro Removido !! "+id;
    }

    public LivroModel updateLivro(LivroModel livroModel)
    {
        LivroModel existLivro = repository.findById(livroModel.getCodigo()).orElse(livroModel);
        existLivro.setAutor(livroModel.autor);
        existLivro.setDtEmissao(livroModel.dtEmissao);
        existLivro.setNome(livroModel.nome);
        return repository.save(existLivro);
    }


}
