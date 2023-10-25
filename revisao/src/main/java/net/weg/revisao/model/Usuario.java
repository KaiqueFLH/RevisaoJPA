package net.weg.revisao.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.weg.revisao.model.id.UsuarioIdClass;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@IdClass(UsuarioIdClass.class)
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Id
    private Long cpf;

    private String nome;
    private String email;
    private String telefone;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Endereco endereco;

}
