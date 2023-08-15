/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author jvoliveira
 */
public class Principal {
    public static void main(String[] str) {
        Glicemia exGlicemia = new Glicemia();
        Colesterol exColesterol = new Colesterol();
        Triglicerideos exTriglicerideos = new Triglicerideos();
        
        exGlicemia.cadastrarExameGlicemia();
        exGlicemia.mostrarResultadoGlicemia();
        
        exColesterol.CadastrarExameColesterol();
        exColesterol.mostrarResultadoColesterol();
        
        exTriglicerideos.cadastrarExameTriglicerideos();
        exTriglicerideos.mostrarResultadoTriglicerideos();
        
    }
}
