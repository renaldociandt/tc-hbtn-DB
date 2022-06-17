package entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sigla;
    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;
    @OneToOne
    @JoinColumn(name = "materialCurso_id")
    private MaterialCurso materialCurso;
    @ManyToMany
    @JoinColumn(name = "alunos_id")
    private List<Aluno> alunos = new ArrayList<>();
}
