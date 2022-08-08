package Conversor;

import javax.swing.*; 

public class ConversorMoeda {
	 public static void main (String[] args) {
	
	Function f = new Function();
    

    while(true) {
    	
    	String opcao = (JOptionPane.showInputDialog(null, "Escolha uma opção ", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Conversor de Moeda", "Conversor de Temperatura"}, "Escolha")).toString();

    	if (opcao == "Conversor de Moeda") {
        String input = JOptionPane.showInputDialog("Insira um valor: ");
        if(f.check(input) == true) {
            double Minput = Double.parseDouble(input);
            f.Converter(Minput);

            int resposta = 0;
            resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
            if((resposta == 0) && (f.check(input) == true)) { 
            } else {
                JOptionPane.showMessageDialog(null, "Programa finalizado");
                break;
            }

        } else {
            JOptionPane.showMessageDialog(null, "Valor inválido");                
        }
    } else if (opcao == "Conversor de Temperatura") {
    	 String input = JOptionPane.showInputDialog("Insira um valor de temperatura para converter");
         if(f.check(input) == true) {
             double Minput = Double.parseDouble(input);
             f.ConverterTemperatura(Minput);

             int resposta = 0;
             resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
             if((resposta == 0) && (f.check(input) == true)) { 
             } else {
                 JOptionPane.showMessageDialog(null, "Programa finalizado");
                 break;
             }

         } else {
             JOptionPane.showMessageDialog(null, "Valor inválido");                
         }
    	}
    }
 }

}
