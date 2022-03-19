package com.github.hugodutra.tspsolver.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TspRequestParams {
    private Boolean isElitismo;
    private Boolean novoIndividuo;
    private Boolean populacaoGeral;
    private Integer elitismo;
    private Integer evolucoes;
    private Integer tamanho_populacao;
    private Integer torneio;
    private double taxa_crossover;
    private double taxa_mutacao;
    private Pontos[] pontos;
}
