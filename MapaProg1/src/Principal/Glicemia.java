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
public class Glicemia extends Exames {
    private Integer glicose;
    
    public Integer getGlicose() {
        return glicose;
    }
    
    public void setGlicose(Integer glicose) {
        this.glicose = glicose;
    }
    
    public void cadastrarExameGlicemia() {
        cadastrarExame();
        setGlicose(Integer.valueOf(JOptionPane.showInputDialog("Informe a quantidade de glicose em mg/l: ")));
    }
    
    private String classificarResultadoGlicemia(Integer glicose) {
        String result;
        if(glicose < 100) {
            result = "Normoglicemia";
        }else if(glicose >= 100 && glicose < 126) {
            result = "Pré-diabetes";
        }else {
            result = "Diabetes estabelecido";
        }
        return result;
    }
    
    public void mostrarResultadoGlicemia() {
        String result = classificarResultadoGlicemia(getGlicose());
        String msg = "Exame de Glicemia"; 
        msg += "\nNome do paciente: " + getNomePaciente();
        msg += "\nTipo sanguineo: " + getTipoSanguineo();
        msg += "\nAno de nascimento: " + getAnoNascimento();
        msg += "\nIdade: " + (2023 - getAnoNascimento());
        msg += "\nResultado do exame de Glicemia: " + getGlicose();
        msg += "\nClassificação do exame: " + result;
        
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
