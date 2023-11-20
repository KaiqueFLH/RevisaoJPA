package net.weg.revisao.controller;

import lombok.AllArgsConstructor;
import net.weg.revisao.model.Curso;
import net.weg.revisao.model.Disciplina;
import net.weg.revisao.service.CursoService;
import net.weg.revisao.service.DisciplinaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/disciplina")
public class DisciplinaController {

    private DisciplinaService disciplinaService;

    @GetMapping("/{id}")
    public Disciplina buscarUm(@PathVariable Integer id){
        return disciplinaService.buscarUm(id);
    }

    @GetMapping
    public List<Disciplina> buscarTodos(){
        return disciplinaService.buscarTodos();
    }

    @PostMapping
    public void criar(@RequestBody Disciplina disciplina){
        disciplinaService.salvar(disciplina);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id){
        disciplinaService.deletar(id);
    }

    @PutMapping
    public void editar(@RequestBody Disciplina disciplina){
        disciplinaService.salvar(disciplina);
    }

}
