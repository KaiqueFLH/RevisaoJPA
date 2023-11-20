package net.weg.revisao.controller;

import lombok.AllArgsConstructor;
import net.weg.revisao.model.Aluno;
import net.weg.revisao.model.Diretor;
import net.weg.revisao.service.AlunoService;
import net.weg.revisao.service.DiretorService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/diretor")
public class DiretorController {

    private DiretorService diretorService;

    @GetMapping("/{cpfId}/{id}")
    public Diretor buscarUm(@PathVariable Long cpfId, @PathVariable Long id){
        return diretorService.buscarUm(cpfId,id);
    }

    @GetMapping
    public Collection<Diretor> buscarTodos(){
        return diretorService.buscarTodos();
    }

    @PostMapping
    public void criar(@RequestBody Diretor diretor){
        System.out.println(diretor);
        diretorService.salvar(diretor);
    }

    @DeleteMapping("/{cpfId}/{id}")
    public void deletar(@PathVariable Long cpfId, @PathVariable Long id){
        diretorService.deletar(cpfId, id);
    }

    @PutMapping
    public void editar(@RequestBody Diretor diretor){
        diretorService.salvar(diretor);
    }

}
