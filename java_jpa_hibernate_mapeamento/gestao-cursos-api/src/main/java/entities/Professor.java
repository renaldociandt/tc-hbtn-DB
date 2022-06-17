package entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Professor {

    @Id
    private Long id;
    private String nomeCompleto;
    private String matricula;
    private String email;
    @OneToMany
    private List<Curso> cursos = new ArrayList<>();

}
