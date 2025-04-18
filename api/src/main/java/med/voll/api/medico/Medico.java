package med.voll.api.medico;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.controller.medicos.DadosAtualizacaoMedicos;
import med.voll.api.endereco.Endereco;

@Table(name = "medicos")
@Entity(name = "Medicos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String telefone;
    private String crm;
    private boolean ativo;
    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;

    public Medico(DadosCadastroMedicos dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.crm = dados.crm();
        this.ativo = true;
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco());
    }

    public void atulaizarInformacoes(@Valid DadosAtualizacaoMedicos dados) {
        if(dados.nome()!= null)
            this.nome = dados.nome();

        if(dados.email()!= null)
            this.email = dados.email();

        if(dados.crm()!= null)
            this.crm = dados.crm();

        if(dados.endereco()!= null)
            this.endereco.atulaizarInformacoes(dados.endereco());
    }

    public void exluir() {
        this.ativo = false;
    }

}
