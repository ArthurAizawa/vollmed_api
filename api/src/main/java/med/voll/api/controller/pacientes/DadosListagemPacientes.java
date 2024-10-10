package med.voll.api.controller.pacientes;

import med.voll.api.paciente.Consulta;
import med.voll.api.paciente.Paciente;

public record DadosListagemPacientes(Long id ,String nome, String email, String telefone, String cpf , Consulta consulta) {

    public DadosListagemPacientes(Paciente paciente){
        this(paciente.getId(),paciente.getNome(), paciente.getEmail(),paciente.getTelefone(), paciente.getCpf() , paciente.getConsulta());
    }
}
