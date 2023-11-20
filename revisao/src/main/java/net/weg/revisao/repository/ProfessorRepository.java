package net.weg.revisao.repository;

import net.weg.revisao.model.Professor;
import net.weg.revisao.model.id.UsuarioId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, UsuarioId> {
}
