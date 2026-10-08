/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oficinastate;

/**
 *
 * @author PICHAU
 */
public class EmReparo implements EstadoOrdemServico {

    private final OrdemServico ordem;

    public EmReparo(OrdemServico ordem) {
        this.ordem = ordem;
    }

    @Override
    public void iniciarReparo() {
        System.out.println("O reparo ja esta em andamento.");
    }

    @Override
    public void solicitarPecas() {
        ordem.setEstado(new AguardandoPecas(ordem));
    }

    @Override
    public void concluirReparo() {
        ordem.setEstado(new Concluida(ordem));
    }

    @Override
    public void entregarVeiculo() {
        System.out.println("O veiculo ainda precisa ter o reparo concluido.");
    }

    @Override
    public String getNomeEstado() {
        return "Em reparo";
    }
}