
package calculadorasimples;

import javax.swing.*;

public class CalculadoraSimples { 
    static String aux;
    static String opr;
    static double num1, num2, resp = 0.0;
    public static void main(String[] args) {
        opr = JOptionPane.showInputDialog(null,"OPERAÇÕES: \n 1| SOMA \n 2| SUBTRAÇÃO \n 3| MULTIPLICAÇÃO \n 4| DIVISÃO \n \n Insira o código da operação desejada:");
        aux = JOptionPane.showInputDialog(null,"Insira o primeiro valor:");
        num1 = Double.parseDouble(aux);
        aux = JOptionPane.showInputDialog(null,"Insira o segundo valor:");
        num2 = Double.parseDouble(aux);
        
        //JOptionPane.showMessageDialog(null,"NUM1: "+num1+" NUM2: "+num2);
        CalculadoraSimples.Resposta(num1,num2);
    }
    
    
    public static void Resposta(double num1,double num2){
        
        switch (opr) {
            case "1":
                resp = Operacoes.somaValor(num1, num2);
                break;
            case "2":
                resp = Operacoes.subtValor(num1, num2);
                break;
            case "3":
                resp = Operacoes.multValor(num1, num2);
                break;
            case "4":
                resp = Operacoes.divValor(num1, num2);
                break;
            default:
                break;
        }
        JOptionPane.showMessageDialog(null, "Resultado: "+resp);
    }

    

}
        
      

