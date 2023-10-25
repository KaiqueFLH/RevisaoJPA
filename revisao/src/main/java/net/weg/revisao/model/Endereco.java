package net.weg.revisao.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Endereco {

    private Long id;
    private String rua;
    private Integer numero;
    private String cidade;
    private String estado;
    private String bairro;
    private Long cep;

}
