package med.voll.api.controller.pacientes;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;
import med.voll.api.paciente.Consulta;

public record DadosAtualizacaoPacientes(
        @NotNull
        Long id,
        String nome,
        String email,
        String cpf,
        String telefone,
        Consulta consulta,
        DadosEndereco endereco) {

}
