package net.weg.revisao.service;

import lombok.AllArgsConstructor;
import net.weg.revisao.model.Escola;
import net.weg.revisao.model.Turma;
import net.weg.revisao.repository.EscolaRepository;
import net.weg.revisao.repository.TurmaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@AllArgsConstructor
public class TurmaService {

    private TurmaRepository turmaRepository;


    public Turma buscarUm(@PathVariable Integer id){
        return turmaRepository.findById(id).get();
    }


    public List<Turma> buscarTodos(){
        return turmaRepository.findAll();
    }


    public void salvar(@RequestBody Turma turma){
        turmaRepository.save(turma);
    }


    public void deletar(@PathVariable Integer id){
        turmaRepository.deleteById(id);
    }

}
