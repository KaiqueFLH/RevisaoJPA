package net.weg.revisao.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.weg.revisao.model.id.UsuarioId;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario {

    @EmbeddedId
    protected UsuarioId usuarioId;

    protected String nome;
    protected String email;
    protected String telefone;
    @OneToOne
    protected Endereco endereco;

}
