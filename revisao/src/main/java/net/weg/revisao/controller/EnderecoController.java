package net.weg.revisao.controller;

import lombok.AllArgsConstructor;
import net.weg.revisao.model.Disciplina;
import net.weg.revisao.model.Endereco;
import net.weg.revisao.service.DisciplinaService;
import net.weg.revisao.service.EnderecoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/endereco")
public class EnderecoController {

    private EnderecoService enderecoService;

    @GetMapping("/{id}")
    public Endereco buscarUm(@PathVariable Integer id){
        return enderecoService.buscarUm(id);
    }

    @GetMapping
    public List<Endereco> buscarTodos(){
        return enderecoService.buscarTodos();
    }

    @PostMapping
    public void criar(@RequestBody Endereco endereco){
        enderecoService.salvar(endereco);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id){
        enderecoService.deletar(id);
    }

    @PutMapping
    public void editar(@RequestBody Endereco endereco){
        enderecoService.salvar(endereco);
    }
}
