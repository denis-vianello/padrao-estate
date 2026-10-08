/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.mycompany.oficinastate.OrdemServico;


/**
 *
 * @author PICHAU
 */
public class OrdemServicoTest {

    @Test
    public void testeEstadoInicial() {
        OrdemServico ordem = new OrdemServico();

        assertEquals("Aguardando diagnostico", ordem.getNomeEstado());
    }

    @Test
    public void testeIniciarReparo() {
        OrdemServico ordem = new OrdemServico();

        ordem.iniciarReparo();

        assertEquals("Em reparo", ordem.getNomeEstado());
    }

    @Test
    public void testeSolicitarPecas() {
        OrdemServico ordem = new OrdemServico();

        ordem.iniciarReparo();
        ordem.solicitarPecas();

        assertEquals("Aguardando pecas", ordem.getNomeEstado());
    }

    @Test
    public void testeRetomarReparo() {
        OrdemServico ordem = new OrdemServico();

        ordem.iniciarReparo();
        ordem.solicitarPecas();
        ordem.iniciarReparo();

        assertEquals("Em reparo", ordem.getNomeEstado());
    }

    @Test
    public void testeConcluirReparo() {
        OrdemServico ordem = new OrdemServico();

        ordem.iniciarReparo();
        ordem.concluirReparo();

        assertEquals("Concluida", ordem.getNomeEstado());
    }

    @Test
    public void testeEntregarVeiculo() {
        OrdemServico ordem = new OrdemServico();

        ordem.iniciarReparo();
        ordem.concluirReparo();
        ordem.entregarVeiculo();

        assertEquals("Entregue", ordem.getNomeEstado());
    }
}
