package net.weg.revisao.service;

import lombok.AllArgsConstructor;
import net.weg.revisao.model.Curso;
import net.weg.revisao.repository.CursoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@AllArgsConstructor
@Service
public class CursoService {

    private CursoRepository cursoRepository;


    public Curso buscarUm(@PathVariable Integer id){
        return cursoRepository.findById(id).get();
    }


    public Collection<Curso> buscarTodos(){
        return cursoRepository.findAll();
    }


    public void salvar(@RequestBody Curso curso){
        cursoRepository.save(curso);
    }


    public void deletar(@PathVariable Integer id){
        cursoRepository.deleteById(id);
    }

}
