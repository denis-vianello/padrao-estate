/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oficinastate;

/**
 *
 * @author PICHAU
 */
public class AguardandoPecas implements EstadoOrdemServico {

    private final OrdemServico ordem;

    public AguardandoPecas(OrdemServico ordem) {
        this.ordem = ordem;
    }

    @Override
    public void iniciarReparo() {
        ordem.setEstado(new EmReparo(ordem));
    }

    @Override
    public void solicitarPecas() {
        System.out.println("A oficina ja esta aguardando as pecas.");
    }

    @Override
    public void concluirReparo() {
        System.out.println("Nao e possivel concluir o reparo enquanto faltam pecas.");
    }

    @Override
    public void entregarVeiculo() {
        System.out.println("O veiculo ainda nao pode ser entregue.");
    }

    @Override
    public String getNomeEstado() {
        return "Aguardando pecas";
    }
}
