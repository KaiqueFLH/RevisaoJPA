package net.weg.revisao.controller;

import lombok.AllArgsConstructor;
import net.weg.revisao.model.Endereco;
import net.weg.revisao.model.Turma;
import net.weg.revisao.service.EnderecoService;
import net.weg.revisao.service.TurmaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/turma")
public class TurmaController {

    private TurmaService turmaService;

    @GetMapping("/{id}")
    public Turma buscarUm(@PathVariable Integer id){
        return turmaService.buscarUm(id);
    }

    @GetMapping
    public List<Turma> buscarTodos(){
        return turmaService.buscarTodos();
    }

    @PostMapping
    public void criar(@RequestBody Turma turma){
        turmaService.salvar(turma);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id){
        turmaService.deletar(id);
    }

    @PutMapping
    public void editar(@RequestBody Turma turma){
        turmaService.salvar(turma);
    }

}
