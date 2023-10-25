package net.weg.revisao.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Escola {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @OneToOne
    private Endereco endereco;
    private String email;
    @OneToMany(mappedBy = "escola")
    private List<Professor> listaDeProfessores;
    @OneToMany
    private List<Curso> listaDeCursos;
    private Diretor diretor;
}
