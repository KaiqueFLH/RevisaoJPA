package net.weg.revisao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
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
public class Professor extends Usuario{

    @ManyToOne
    private Escola escola;
    @ManyToMany(mappedBy = "listaDeProfessores")
    private List<Disciplina> listaDeDisciplinas;

}
