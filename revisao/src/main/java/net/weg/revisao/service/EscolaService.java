package net.weg.revisao.service;

import lombok.AllArgsConstructor;
import net.weg.revisao.model.Endereco;
import net.weg.revisao.model.Escola;
import net.weg.revisao.repository.EnderecoRepository;
import net.weg.revisao.repository.EscolaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@AllArgsConstructor
public class EscolaService {

    private EscolaRepository escolaRepository;


    public Escola buscarUm(@PathVariable Integer id){
        return escolaRepository.findById(id).get();
    }


    public List<Escola> buscarTodos(){
        return escolaRepository.findAll();
    }


    public void salvar(@RequestBody Escola escola){
        escolaRepository.save(escola);
    }


    public void deletar(@PathVariable Integer id){
        escolaRepository.deleteById(id);
    }

}
