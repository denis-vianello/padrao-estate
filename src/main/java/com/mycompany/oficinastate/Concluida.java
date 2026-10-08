/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oficinastate;

/**
 *
 * @author PICHAU
 */
public class Concluida implements EstadoOrdemServico {

    private final OrdemServico ordem;

    public Concluida(OrdemServico ordem) {
        this.ordem = ordem;
    }

    @Override
    public void iniciarReparo() {
        System.out.println("O reparo ja foi concluido.");
    }

    @Override
    public void solicitarPecas() {
        System.out.println("O reparo ja foi concluido.");
    }

    @Override
    public void concluirReparo() {
        System.out.println("O reparo ja foi concluido.");
    }

    @Override
    public void entregarVeiculo() {
        ordem.setEstado(new Entregue());
    }

    @Override
    public String getNomeEstado() {
        return "Concluida";
    }
}
