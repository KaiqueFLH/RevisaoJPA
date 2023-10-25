package net.weg.revisao.repository;

import net.weg.revisao.model.Escola;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscolaRepository extends JpaRepository<Escola,Integer> {
}
