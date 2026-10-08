/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.oficinastate;

/**
 *
 * @author PICHAU
 */
public interface EstadoOrdemServico {

    void iniciarReparo();
    
    void solicitarPecas();
    
    void concluirReparo();
    
    void entregarVeiculo();
    
    String getNomeEstado();
}