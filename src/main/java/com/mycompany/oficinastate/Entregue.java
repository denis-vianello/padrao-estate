/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oficinastate;

/**
 *
 * @author PICHAU
 */
public class Entregue implements EstadoOrdemServico {

    @Override
    public void iniciarReparo() {
        System.out.println("O veiculo ja foi entregue.");
    }

    @Override
    public void solicitarPecas() {
        System.out.println("O veiculo ja foi entregue.");
    }

    @Override
    public void concluirReparo() {
        System.out.println("O veiculo ja foi entregue.");
    }

    @Override
    public void entregarVeiculo() {
        System.out.println("O veiculo ja foi entregue ao cliente.");
    }

    @Override
    public String getNomeEstado() {
        return "Entregue";
    }
}
