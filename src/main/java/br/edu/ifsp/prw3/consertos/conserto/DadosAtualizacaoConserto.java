package br.edu.ifsp.prw3.consertos.conserto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

// Só podem ser alterados: data de saída, nome do mecânico
// e anos de experiência do mecânico.
public record DadosAtualizacaoConserto(

        @NotNull
        Long id,

        @Pattern(regexp = "\\d{2}/\\d{2}/\\d{4}", message = "deve estar no formato xx/xx/xxxx")
        String dataSaida,

        String nomeMecanico,

        Integer anosExperiencia) {

}
