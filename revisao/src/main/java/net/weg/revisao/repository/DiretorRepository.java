package net.weg.revisao.repository;

import net.weg.revisao.model.Diretor;
import net.weg.revisao.model.id.UsuarioId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiretorRepository extends JpaRepository<Diretor, UsuarioId> {
}
