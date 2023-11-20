package net.weg.revisao.controller;

import lombok.AllArgsConstructor;
import net.weg.revisao.model.Curso;
import net.weg.revisao.service.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/curso")
public class CursoController {

    private CursoService cursoService;

    @GetMapping("/{id}")
    public Curso buscarUm(@PathVariable Integer id){
        return cursoService.buscarUm(id);
    }

    @GetMapping
    public Collection<Curso> buscarTodos(){
        return cursoService.buscarTodos();
    }

    @PostMapping
    public void criar(@RequestBody Curso curso){
        cursoService.salvar(curso);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id){
        cursoService.deletar(id);
    }

    @PutMapping
    public void editar(@RequestBody Curso curso){
        cursoService.salvar(curso);
    }

}
