package net.weg.revisao.controller;

import lombok.AllArgsConstructor;
import net.weg.revisao.model.Diretor;
import net.weg.revisao.model.Professor;
import net.weg.revisao.service.DiretorService;
import net.weg.revisao.service.ProfessorService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/professor")
public class ProfessorController {

    private ProfessorService professorService;

    @GetMapping("/{cpfId}/{id}")
    public Professor buscarUm(@PathVariable Long cpfId, @PathVariable Long id){
        return professorService.buscarUm(cpfId,id);
    }

    @GetMapping
    public Collection<Professor> buscarTodos(){
        return professorService.buscarTodos();
    }

    @PostMapping
    public void criar(@RequestBody Professor professor){
        professorService.salvar(professor);
    }

    @DeleteMapping("/{cpfId}/{id}")
    public void deletar(@PathVariable Long cpfId, @PathVariable Long id){
        professorService.deletar(cpfId, id);
    }

    @PutMapping
    public void editar(@RequestBody Professor professor){
        professorService.salvar(professor);
    }

}
