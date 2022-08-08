package Conversor;

import javax.swing.JOptionPane;

public class Function {
	public void Converter(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, "Escolha a moeda para a qual você deseja girar seu dinheiro ", "Moedas", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De Reais a Dólares", "De Reais a Euros", "De Reais a Libras","De Reais a Peso Argentino","De Reais a Peso Chileno","De Dólares a Reais", "De Euros a Reais", "De Libras a Reais","De Peso Argentino a Reais","De Peso Chileno a Reais"}, "Escolha")).toString();
        if(opcion == "De Reais a Dólares") {
        	double monedaDolar = Minput / 5.13;
    		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
            JOptionPane.showMessageDialog(null, "Você tem $ " +monedaDolar+ " Dolares");
        } else if (opcion == "De Reais a Euros") {
            double monedaEuro = Minput / 10.85;
            monedaEuro = (double) Math.round(monedaEuro *100d)/100;
            JOptionPane.showMessageDialog(null, "Você tem $ " +monedaEuro+ " Euros");
        } else if (opcion == "De Reais a Libras"){
            double monedaLibra = Minput / 6.33;
            monedaLibra = (double) Math.round(monedaLibra *100d)/100;
            JOptionPane.showMessageDialog(null, "Você tem $ " +monedaLibra+ " Libras Esterlinas");
        }  else if (opcion == "De Reais a Peso Argentino"){
            double monedaYen = Minput / 0.039;
            monedaYen = (double) Math.round(monedaYen *100d)/100;
            JOptionPane.showMessageDialog(null, "Você tem $ " +monedaYen+ "Peso Argentino");
        } else if (opcion == "De Reais a Peso Chileno"){
            double monedaWon = Minput / 0.0040;
            monedaWon = (double) Math.round(monedaWon *100d)/100;
            JOptionPane.showMessageDialog(null, "Você tem $ " +monedaWon+ " Wons");
        } 
        else if(opcion == "De Dólares a Reais") {
        	double monedaDolar = Minput * 5.13;
    		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
            JOptionPane.showMessageDialog(null, "Você tem $ " +monedaDolar+ " Reais");
        } else if (opcion == "De Euros a Reais") {
            double monedaEuro = Minput * 10.85;
            monedaEuro = (double) Math.round(monedaEuro *100d)/100;
            JOptionPane.showMessageDialog(null, "Você tem $ " +monedaEuro+ " Reais");
        } else if (opcion == "De Libras a Reais"){
            double monedaLibra = Minput * 6.33;
            monedaLibra = (double) Math.round(monedaLibra *100d)/100;
            JOptionPane.showMessageDialog(null, "Você tem $ " +monedaLibra+ " Reais");
        }  else if (opcion == "De Peso Argentino a Reais"){
            double monedaYen = Minput * 29.68;
            monedaYen = (double) Math.round(monedaYen *100d)/100;
            JOptionPane.showMessageDialog(null, "Você tem $" +monedaYen+ " Reais");
        } else if (opcion == "De Peso Chileno a Reais"){
            double monedaWon = Minput * 3.04;
            monedaWon = (double) Math.round(monedaWon *100d)/100;
            JOptionPane.showMessageDialog(null, "Você tem $" +monedaWon+ " Reais");
        }      
    }
    
    public void ConverterTemperatura(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Grados Celcius a Grados Farenheit", "Grados Celcius a Kelvin", "Grados Farenheit a Grados Celcius","Kelvin a Grados Celcius","Kelvin a Grados Farenheit"}, "Seleccion")).toString();
        if(opcion == "Grados Celcius a Grados Farenheit") {
        	double farenheit = Minput * 1.8 + 32;
        	farenheit = (double) Math.round(farenheit *100d)/100;
            JOptionPane.showMessageDialog(null, +Minput+ " Grados Celcius son " +farenheit+ " Grados Farenheit ");
        } else if (opcion == "Grados Celcius a Kelvin") {
            double kelvin = Minput + 273.15;
            kelvin = (double) Math.round(kelvin *100d)/100;
            JOptionPane.showMessageDialog(null, +Minput+ " Grados Celcius son " +kelvin+ " Kelvin");
        } else if (opcion == "Grados Farenheit a Grados Celcius"){
            double celcius = (Minput - 32) / 1.8;
            celcius = (double) Math.round(celcius *100d)/100;
            JOptionPane.showMessageDialog(null, +Minput+ " Grados Farenheit son " +celcius+ " Celcius");
        }  else if (opcion == "Kelvin a Grados Celcius"){
            double kelvinCelcius = Minput - 273.15;
            kelvinCelcius = (double) Math.round(kelvinCelcius *100d)/100;
            JOptionPane.showMessageDialog(null, +Minput+ " Kelvin son " +kelvinCelcius+ " Celcius");
        } else if (opcion == "Kelvin a Grados Farenheit"){
            double monedaWon = (Minput - 273.15) * 9/5 + 32;
            monedaWon = (double) Math.round(monedaWon *100d)/100;
            JOptionPane.showMessageDialog(null, "Tienes $" +monedaWon+ " Pesos");
        }      
    }

    public boolean check(String input) {
        try {
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
    }
}
