package br.edu.ifsp.prw3.consertos.conserto;

// Dados parciais: id, datas, nome do mecânico, marca e modelo do veículo.
public record DadosListagemConserto(Long id, String dataEntrada, String dataSaida,
                                    String nomeMecanico, String marca, String modelo) {

    public DadosListagemConserto(Conserto conserto) {

        this(conserto.getId(), conserto.getDataEntrada(), conserto.getDataSaida(),
                conserto.getMecanico().getNome(),
                conserto.getVeiculo().getMarca(), conserto.getVeiculo().getModelo());
    }
}
