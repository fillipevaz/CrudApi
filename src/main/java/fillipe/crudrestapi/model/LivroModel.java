package fillipe.crudrestapi.model;

import javax.persistence.*;

@Entity(name = "livro")
public class LivroModel {

    @Id
    @GeneratedValue
            (
                    strategy = GenerationType.IDENTITY
            )
    public Integer codigo;
    @Column(nullable = false, length = 100)
    public String nome;
    @Column(nullable = false, length = 100)
    public String autor;
    @Column(nullable = false, length = 10)
    public String dtEmissao;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDtEmissao() {
        return dtEmissao;
    }

    public void setDtEmissao(String dtEmissao) {
        this.dtEmissao = dtEmissao;
    }
}
