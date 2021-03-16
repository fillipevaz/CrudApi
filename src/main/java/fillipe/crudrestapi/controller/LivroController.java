package fillipe.crudrestapi.controller;

import fillipe.crudrestapi.model.LivroModel;
import fillipe.crudrestapi.service.LivroServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LivroController {

    @Autowired
    private LivroServiceImpl service;



    @GetMapping(path = "/api/livro/")
    public Iterable<LivroModel> consultarTodos()
    {
            return service.findAll();
    }

    @PostMapping(path = "/api/livro/salvar")
    public LivroModel salvar(@RequestBody LivroModel livro)
    {
        return  service.save(livro) ;

    }

    @DeleteMapping(path = "/api/livro/excluir/{codigo}")
    public void salvar(@PathVariable("codigo") Integer codigo)
    {
         service.delete(codigo);
    }

    @PutMapping(path = "/api/livro/update")
    public void updateLivro(@RequestBody LivroModel livro)
    {
        service.updateLivro(livro) ;
    }

}
