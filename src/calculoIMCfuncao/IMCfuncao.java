/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculoIMCfuncao;

import javax.swing.JOptionPane;
/**
 *
 * @author Diego Almeida
 */
public class IMCfuncao {
    
    public float calculoImc (float peso, float altura){
        float imc;
        imc = peso / (altura*altura);
        return imc;   
    }
    
    public float receberPeso(){
        float peso;
        peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o peso"));
        return peso;
    }
    
    public float recebeAltura(){
        float altura;
        altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a altura"));
        return altura;
    }
    
    public void categoria(float imc){
        if (imc >=40){
            JOptionPane.showMessageDialog(null,imc + "\n Cuidado, você está no maior grau de OBESIDADE, Grau III!");
        }else if (imc >= 35){
            JOptionPane.showMessageDialog(null,imc + "\n Cuidado, você está no Grau II de OBESIDADE!");
        }else if (imc >= 30){
            JOptionPane.showMessageDialog(null,imc + "\n Cuidado, você está no Grau I de OBESIDADE!");
        }else if (imc >= 25){
            JOptionPane.showMessageDialog(null,imc + "\n Cuidado, você está com SOBREPESO!");
            
        }else if (imc >= 19){
            JOptionPane.showMessageDialog(null,imc + "\n Aêê! Você está no peso IDEAL!");
        }else{
            JOptionPane.showMessageDialog(null,imc + "\n Vish.. Você precisa comer mais, está desnutrido(a)!");
        }              
    }
}
