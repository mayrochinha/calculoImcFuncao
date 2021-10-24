/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo.pkgdo.imc;

import calculoIMCfuncao.IMCfuncao;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego Almeida
 */
public class CalculoDoImc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code applicatio1n logic here

       float peso, altura, IMC;
      // int categoria;
     
        IMCfuncao calcularImc = new IMCfuncao();
        
        peso = calcularImc.receberPeso(); //Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o seu peso:"));
        altura = calcularImc.recebeAltura();//Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a sua altura:"));
       
        //IMC = peso / (altura * altura);
        IMC = calcularImc.calculoImc(peso, altura);
        
        //JOptionPane.showMessageDialog(null, IMC);
        
        calcularImc.categoria(IMC);
                
                
    
    
    }

}
