package net.weg.revisao.controller;

import lombok.AllArgsConstructor;
import net.weg.revisao.model.Aluno;
import net.weg.revisao.service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/aluno")
public class AlunoController {

    private AlunoService alunoService;

    @GetMapping("/{cpfId}/{id}")
    public Aluno buscarUm(@PathVariable Long cpfId, @PathVariable Long id){
        return alunoService.buscarUm(cpfId,id);
    }

    @GetMapping
    public Collection<Aluno> buscarTodos(){
        return alunoService.buscarTodos();
    }

    @PostMapping
    public void criar(@RequestBody Aluno aluno){
        alunoService.salvar(aluno);
    }

    @DeleteMapping("/{cpfId}/{id}")
    public void deletar(@PathVariable Long cpfId, @PathVariable Long id){
        alunoService.deletar(cpfId, id);
    }

    @PutMapping
    public void editar(@RequestBody Aluno aluno){
        alunoService.salvar(aluno);
    }

}
