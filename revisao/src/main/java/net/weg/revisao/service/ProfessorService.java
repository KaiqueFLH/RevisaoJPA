package net.weg.revisao.service;

import lombok.AllArgsConstructor;
import net.weg.revisao.model.Professor;
import net.weg.revisao.model.id.UsuarioId;
import net.weg.revisao.repository.ProfessorRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;

@Service
@AllArgsConstructor
public class ProfessorService {

    private ProfessorRepository professorRepository;

    public Professor buscarUm(@PathVariable Long cpfId, @PathVariable Long id){
        return professorRepository.findById(new UsuarioId(cpfId,id)).get();
    }

    public Collection<Professor> buscarTodos(){
        return professorRepository.findAll();
    }

    public void salvar(@RequestBody Professor professor){
        professorRepository.save(professor);
    }

    public void deletar(@PathVariable Long cpfId, @PathVariable Long id){
        professorRepository.deleteById(new UsuarioId(cpfId,id));
    }

}
