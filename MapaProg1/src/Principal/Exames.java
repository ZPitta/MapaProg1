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
public class Exames {
    private String nomePaciente;
    private String tipoSanguineo;
    private Integer anoNascimento;

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public Integer getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(Integer anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    
    public void cadastrarExame() {
        setNomePaciente(JOptionPane.showInputDialog("Informe o nome: "));
        setTipoSanguineo(JOptionPane.showInputDialog("Informe o tipo sanguineo:"));
        setAnoNascimento(Integer.valueOf(JOptionPane.showInputDialog("Informe o ano de nascimento: ")));
    }
    
}
