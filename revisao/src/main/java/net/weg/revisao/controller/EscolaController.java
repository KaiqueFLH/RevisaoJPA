package net.weg.revisao.controller;

import lombok.AllArgsConstructor;
import net.weg.revisao.model.Endereco;
import net.weg.revisao.model.Escola;
import net.weg.revisao.service.EnderecoService;
import net.weg.revisao.service.EscolaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/escola")
public class EscolaController {

    private EscolaService escolaService;

    @GetMapping("/{id}")
    public Escola buscarUm(@PathVariable Integer id){
        return escolaService.buscarUm(id);
    }

    @GetMapping
    public List<Escola> buscarTodos(){
        return escolaService.buscarTodos();
    }

    @PostMapping
    public void criar(@RequestBody Escola escola){
        escolaService.salvar(escola);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id){
        escolaService.deletar(id);
    }

    @PutMapping
    public void editar(@RequestBody Escola escola){
        escolaService.salvar(escola);
    }

}
