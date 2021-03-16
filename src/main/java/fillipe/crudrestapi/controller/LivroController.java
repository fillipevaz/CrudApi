package fillipe.crudrestapi.controller;

import fillipe.crudrestapi.model.LivroModel;
import fillipe.crudrestapi.repository.LivroRepository;
import fillipe.crudrestapi.service.LivroService;
import net.bytebuddy.asm.Advice;
import org.hibernate.internal.util.StringHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
public class LivroController {

    @Autowired
    private LivroService service;



    @GetMapping(path = "/api/livro/")
    public Iterable<LivroModel> consultarTodos()
    {
            return service.getLivros();
    }

    @PostMapping(path = "/api/livro/salvar")
    public LivroModel salvar(@RequestBody LivroModel livro)
    {
        return  service.saveLivro(livro) ;

    }

    @DeleteMapping(path = "/api/livro/excluir/{codigo}")
    public void salvar(@PathVariable("codigo") Integer codigo)
    {
         service.deleteLivro(codigo);
    }

    @PutMapping(path = "/api/livro/update")
    public void updateLivro(@RequestBody LivroModel livro)
    {
        service.updateLivro(livro) ;
    }

}
