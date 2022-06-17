package entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Setter
@Getter
@Entity
public class Endereco {

    @Id
    private Long id;
    private String logradouro;
    private String endereco;
    private String numero;
    private String bairo;
    private String cidade;
    private String estado;
    private String cep;
    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;


}
