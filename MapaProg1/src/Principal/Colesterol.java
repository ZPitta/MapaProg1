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
public class Colesterol extends Exames {
    private Integer qtdLDL;
    private Integer qtdHDL;
    private String risco;
    
    public Integer getQtdLDL() {
        return qtdLDL;
    }
    
    public void setQtdLDL(Integer qtdLDL) {
        this.qtdLDL = qtdLDL;
    }
    
    public Integer getQtdHDL() {
        return qtdHDL;
    }
    
    public void setQtdHDL(Integer qtdHDL) {
        this.qtdHDL = qtdHDL;
    }
    
    public String getRisco() {
        return risco;
    }
    
    public void setRisco(String risco) {
        String resultRisco = risco.toUpperCase();
        if("B".equals(resultRisco) || "BAIXO".equals(resultRisco)) {
            resultRisco = "BAIXO";
        }else if("M".equals(resultRisco) || "MEDIO".equals(resultRisco)) {
            resultRisco = "MEDIO";
        }else if("A".equals(resultRisco) || "ALTO".equals(resultRisco)) {
            resultRisco = "ALTO";
        }
        this.risco = resultRisco; 
    }
    
    public void CadastrarExameColesterol() {
        cadastrarExame();
        setQtdHDL(Integer.valueOf(JOptionPane.showInputDialog("Informe a quantidade de HDL em mg/l: ")));
        setQtdLDL(Integer.valueOf(JOptionPane.showInputDialog("Informe a quantidade de LDL em mg/l: ")));
        setRisco(JOptionPane.showInputDialog("Informe o risco:\nB- baixo, M- médio, A - alto"));
    }
    
    private String classificarResultadoColesterol(Integer idade, Integer qtdHDL, Integer qtdLDL, String risco) {
        String result;
        if(idade > 0 && idade <= 19) {
            if(qtdHDL > 45) {
                result = "\nClassificação do exame: HDL - BOM";
            }else {
                result = "\nClassificação do exame: HDL - RUIM";
            }
        }else{
            if(qtdHDL > 40) {
                result = "\nClassificação do exame: HDL - BOM";
            }else {
                result = "\nClassificação do exame: HDL - RUIM";
            }
        }
        if("BAIXO".equals(risco)) {
            if(qtdLDL < 100) {
                result += "\nClassificação do exame: LDL - BOM";
            }else {
                result += "\nClassificação do exame: LDL - ALTO";
            }
        }else if("MEDIO".equals(risco)) {
            if(qtdLDL < 70) {
                result += "\nClassificação do exame: LDL - BOM";
            }else {
                result += "\nClassificação do exame: LDL - ALTO";
            }
        }else if("ALTO".equals(risco)) {
            if(qtdLDL < 50) {
                result += "\nClassificação do exame: LDL - BOM";
            }else {
                result += "\nClassificação do exame: LDL - ALTO";
            }
        }
        return result;
    }
    
    public void mostrarResultadoColesterol() {
        Integer idade = 2023 - getAnoNascimento();
        String result = classificarResultadoColesterol(idade, getQtdHDL(), getQtdLDL(), getRisco());
        String msg = "Exame de Colesterol"; 
        msg += "\nNome do paciente: " + getNomePaciente();
        msg += "\nTipo sanguineo: " + getTipoSanguineo();
        msg += "\nAno de nascimento: " + getAnoNascimento();
        msg += "\nIdade: " + idade;
        msg += "\nResultado do exame de Colesterol - HDL: " + getQtdHDL();
        msg += "\nResultado do exame de Colesterol - LDL: " + getQtdLDL();
        msg += "\nRisco informado pelo paciente: " + getRisco();
        msg += result;
        
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
