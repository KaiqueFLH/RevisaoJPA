package net.weg.revisao.repository;

import net.weg.revisao.model.Aluno;
import net.weg.revisao.model.id.UsuarioId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, UsuarioId> {
}
