/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oficinastate;

/**
 *
 * @author PICHAU
 */
public class OrdemServico {

    private EstadoOrdemServico estado;

    public OrdemServico() {
        this.estado = new AguardandoDiagnostico(this);
    }

    public void setEstado(EstadoOrdemServico estado) {
        this.estado = estado;
    }

    public String getNomeEstado() {
        return estado.getNomeEstado();
    }

    public void iniciarReparo() {
        estado.iniciarReparo();
    }

    public void solicitarPecas() {
        estado.solicitarPecas();
    }

    public void concluirReparo() {
        estado.concluirReparo();
    }

    public void entregarVeiculo() {
        estado.entregarVeiculo();
    }
}
