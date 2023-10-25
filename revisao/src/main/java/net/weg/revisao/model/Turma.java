package net.weg.revisao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Turma {

    private Long id;
    private String nome;
    @ManyToOne
    private Escola escola;
    @OneToMany(mappedBy = "turma")
    private List<Aluno> listaDeAlunos;

}
