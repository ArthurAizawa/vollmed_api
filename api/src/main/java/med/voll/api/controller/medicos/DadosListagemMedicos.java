package med.voll.api.controller.medicos;

import med.voll.api.medico.Especialidade;
import med.voll.api.medico.Medico;

public record DadosListagemMedicos (Long id,String nome, String email, String crm, Especialidade especialidade) {

    public DadosListagemMedicos(Medico medico){
        this(medico.getId(),medico.getNome(),medico.getEmail(),medico.getCrm(),medico.getEspecialidade());
    }
}
