package model;

public class ConvertidorDeTemperatura {

    private double valorConvertido;

    public double convertirCelsiusParaFahrenheit(double valor){
        valorConvertido = valor * 1.8 + 32;
        return valorConvertido;
    }

    public double convertirFahrenheitParaCelsius(double valor){
        valorConvertido = (valor - 32) /1.8;
        return valorConvertido;
    }

    public double convertirCelsiusParaKelvin(double valor){
        valorConvertido = valor + 273;
        return valorConvertido;
    }

    public double convertirKelvinParaCelsius(double valor){
        valorConvertido = valor - 273;
        return valorConvertido;
    }

    public double convertirKelvinParaFahrenheit(double valor){
        valorConvertido = convertirKelvinParaCelsius(valor);
        valorConvertido = convertirCelsiusParaFahrenheit(valorConvertido);
        return valorConvertido;
    }

    public double convertirFahrenheitParaKelvin(double valor){
        valorConvertido = convertirFahrenheitParaCelsius(valor);
        valorConvertido = convertirCelsiusParaKelvin(valorConvertido);
        return valorConvertido;
    }
}
