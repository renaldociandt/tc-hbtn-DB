package entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Aluno {

    @Id
    private Long id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nomeCompleto;
    private String matricula;
    private LocalDate nascimento;
    private String email;
    @OneToMany
    private List<Endereco> enderecos = new ArrayList<>();
    @OneToMany
    @JoinColumn(name = "telefones_id")
    private List<Telefone> telefones = new ArrayList<>();
    @ManyToMany
    private List<Curso> cursos = new ArrayList<>();

}
