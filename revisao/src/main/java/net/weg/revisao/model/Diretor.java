package net.weg.revisao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Diretor extends Usuario{

    @OneToOne(mappedBy = "diretor")
    private Escola escola;

}
