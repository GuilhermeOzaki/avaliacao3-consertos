package br.edu.ifsp.prw3.consertos.conserto;

import br.edu.ifsp.prw3.consertos.mecanico.DadosMecanico;
import br.edu.ifsp.prw3.consertos.veiculo.DadosVeiculo;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroConserto(

        @Pattern(regexp = "\\d{2}/\\d{2}/\\d{4}", message = "deve estar no formato xx/xx/xxxx")
        String dataEntrada,

        @Pattern(regexp = "\\d{2}/\\d{2}/\\d{4}", message = "deve estar no formato xx/xx/xxxx")
        String dataSaida,

        @NotNull
        @Valid
        DadosMecanico mecanico,

        @NotNull
        @Valid
        DadosVeiculo veiculo) {

}
