package net.weg.revisao.service;

import lombok.AllArgsConstructor;
import net.weg.revisao.model.Diretor;
import net.weg.revisao.model.id.UsuarioId;
import net.weg.revisao.repository.DiretorRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class DiretorService {

    private DiretorRepository diretorRepository;

    public Diretor buscarUm(Long cpfId, Long id){
        return diretorRepository.findById(new UsuarioId(cpfId,id)).get();
    }

    public Collection<Diretor> buscarTodos(){
        return diretorRepository.findAll();
    }

    public void salvar(Diretor diretor){
        System.out.println(diretor);
        diretorRepository.save(diretor);
    }

    public void deletar(Long cpfId, Long id){
        diretorRepository.deleteById(new UsuarioId(cpfId,id));
    }

}
