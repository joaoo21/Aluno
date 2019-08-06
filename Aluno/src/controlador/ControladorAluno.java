/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import dao.DaoAluno;
import javax.swing.JOptionPane;
import Modelo.Aluno;
import tela.manutencao.ManutencaoAluno;
/**
 *
 * @author Administrador
 */
public class ControladorAluno {

public static void inserir(ManutencaoAluno man){
        Aluno objeto = new Aluno();
        objeto.setNome(man.jtfNome.getText());
        objeto.setEndereco(man.jtfEndereco.getText());
        
        boolean resultado = DaoAluno.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}

    public static void alterar(ManutencaoAluno aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
