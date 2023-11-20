package net.weg.revisao.service;

import lombok.AllArgsConstructor;
import net.weg.revisao.model.Curso;
import net.weg.revisao.model.Disciplina;
import net.weg.revisao.repository.CursoRepository;
import net.weg.revisao.repository.DisciplinaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@AllArgsConstructor
public class DisciplinaService {

    private DisciplinaRepository disciplinaRepository;


    public Disciplina buscarUm(@PathVariable Integer id){
        return disciplinaRepository.findById(id).get();
    }


    public List<Disciplina> buscarTodos(){
        return disciplinaRepository.findAll();
    }


    public void salvar(@RequestBody Disciplina disciplina){
        disciplinaRepository.save(disciplina);
    }


    public void deletar(@PathVariable Integer id){
        disciplinaRepository.deleteById(id);
    }


}
