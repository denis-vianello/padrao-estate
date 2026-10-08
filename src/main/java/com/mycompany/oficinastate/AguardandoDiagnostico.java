/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oficinastate;

/**
 *
 * @author PICHAU
 */
public class AguardandoDiagnostico implements EstadoOrdemServico {

    private final OrdemServico ordem;

    public AguardandoDiagnostico(OrdemServico ordem) {
        this.ordem = ordem;
    }

    @Override
    public void iniciarReparo() {
        ordem.setEstado(new EmReparo(ordem));
    }

    @Override
    public void solicitarPecas() {
        System.out.println("Nao e possivel solicitar pecas antes do diagnostico.");
    }

    @Override
    public void concluirReparo() {
        System.out.println("Nao e possivel concluir um reparo que ainda nao comecou.");
    }

    @Override
    public void entregarVeiculo() {
        System.out.println("O veiculo ainda nao esta pronto para entrega.");
    }

    @Override
    public String getNomeEstado() {
        return "Aguardando diagnostico";
    }
}
