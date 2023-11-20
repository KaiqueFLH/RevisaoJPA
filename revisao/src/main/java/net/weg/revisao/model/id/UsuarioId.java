package net.weg.revisao.model.id;

import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class UsuarioId {

    @GeneratedValue(strategy = GenerationType.TABLE)
    protected Long usuarioId;

    protected Long cpfId;


}
