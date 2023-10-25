package net.weg.revisao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Curso {

    private Long id;
    private String nome;
    @ManyToMany
    private List<Disciplina> listaDeDisciplinas;

}
