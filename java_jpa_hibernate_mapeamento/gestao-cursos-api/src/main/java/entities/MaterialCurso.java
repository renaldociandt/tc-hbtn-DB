package entities;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Getter
@Setter
@Entity
public class MaterialCurso {

    @Id
    private Long id;
    private String url;
    @OneToOne
    private Curso curso;
}
