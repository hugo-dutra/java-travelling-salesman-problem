package com.github.hugodutra.tspsolver.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class TspRequestParams {
    private Integer elitismo;
    private Integer evolucoes;
    private boolean isElitismo;
    private boolean novoIndividuo;
    private List<CoordenadasLocais> pontos = new ArrayList<>();
    private boolean populacaoGeral;
    private Integer tamanho_populacao;
    private double taxa_crossover;
    private double taxa_mutacao;
    private Integer torneio;
}
