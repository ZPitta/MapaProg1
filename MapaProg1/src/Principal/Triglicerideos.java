/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import javax.swing.JOptionPane;

/**
 *
 * @author jvoliveira
 */
public class Triglicerideos extends Exames {
    private Integer triglicerideos;
    
    public Integer getTriglicerideos() {
        return triglicerideos;
    }
    
    public void setTriglicerideos(Integer triglicerideos) {
        this.triglicerideos = triglicerideos;
    }
    
    public void cadastrarExameTriglicerideos() {
        cadastrarExame();
        setTriglicerideos(Integer.valueOf(JOptionPane.showInputDialog("Informe a quantidade de triglicerideos em mg/l: ")));
    }
    
    private String classificarResultadoTriglicerideos(Integer idade, Integer triglicerideos) {
        String result;
        if(idade > 0 && idade <= 9) {
            if(triglicerideos < 75) {
                result = "TRIGLICERIDEOS - BOM";
            }else {
                result = "TRIGLICERIDEOS - RUIM";
            }
        }else if(idade >= 10 && idade <= 19) {
            if(triglicerideos < 75) {
                result = "TRIGLICERIDEOS - BOM";
            }else {
                result = "TRIGLICERIDEOS - RUIM";
            }
        }else {            
            if(triglicerideos < 75) {
                result = "TRIGLICERIDEOS - BOM";
            }else {
                result = "TRIGLICERIDEOS - RUIM";
            }
        }
        return result;
    }
    
     public void mostrarResultadoTriglicerideos() {
        Integer idade = 2023 - getAnoNascimento();
        String result = classificarResultadoTriglicerideos(idade, getTriglicerideos());
        String msg = "Exame de Triglicérides"; 
        msg += "\nNome do paciente: " + getNomePaciente();
        msg += "\nTipo sanguineo: " + getTipoSanguineo();
        msg += "\nAno de nascimento: " + getAnoNascimento();
        msg += "\nIdade: " + idade;
        msg += "\nResultado do exame de Glicemia: " + getTriglicerideos();
        msg += "\nClassificação do exame: " + result;
        
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
