package net.weg.revisao.service;

import lombok.AllArgsConstructor;
import net.weg.revisao.model.Curso;
import net.weg.revisao.model.Endereco;
import net.weg.revisao.repository.CursoRepository;
import net.weg.revisao.repository.EnderecoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@AllArgsConstructor
public class EnderecoService {

    private EnderecoRepository enderecoRepository;


    public Endereco buscarUm(@PathVariable Integer id){
        return enderecoRepository.findById(id).get();
    }


    public List<Endereco> buscarTodos(){
        return enderecoRepository.findAll();
    }


    public void salvar(@RequestBody Endereco endereco){
        enderecoRepository.save(endereco);
    }


    public void deletar(@PathVariable Integer id){
        enderecoRepository.deleteById(id);
    }


}
