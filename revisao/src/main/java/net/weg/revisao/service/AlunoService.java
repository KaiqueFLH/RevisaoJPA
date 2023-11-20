package net.weg.revisao.service;

import lombok.AllArgsConstructor;
import net.weg.revisao.model.Aluno;
import net.weg.revisao.model.id.UsuarioId;
import net.weg.revisao.repository.AlunoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;

@Service
@AllArgsConstructor
public class AlunoService {

    private AlunoRepository alunoRepository;

    public Aluno buscarUm(@PathVariable Long cpfId, @PathVariable Long id){
        return alunoRepository.findById(new UsuarioId(cpfId,id)).get();
    }

    public Collection<Aluno> buscarTodos(){
        return alunoRepository.findAll();
    }

    public void salvar(@RequestBody Aluno aluno){
        alunoRepository.save(aluno);
    }

    public void deletar(@PathVariable Long cpfId, @PathVariable Long id){
        alunoRepository.deleteById(new UsuarioId(cpfId,id));
    }
}
