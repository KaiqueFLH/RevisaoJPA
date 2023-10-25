package net.weg.revisao.repository;

import net.weg.revisao.model.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaRepository extends JpaRepository<Turma,Integer> {
}
