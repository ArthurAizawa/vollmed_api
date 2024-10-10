package med.voll.api.controller.medicos;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;
import med.voll.api.medico.Especialidade;

public record DadosAtualizacaoMedicos(
        @NotNull
        Long id,
        String nome,
        String email,
        String crm,
        DadosEndereco endereco,
        Especialidade especialidade) {

}
