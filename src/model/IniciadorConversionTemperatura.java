package model;

public class IniciadorConversionTemperatura {

    ConvertidorDeTemperatura convertidorDeTemperatura = new ConvertidorDeTemperatura();
    private static final String CELSIUS_PARA_FAHRENHEIT = "Celsius a Fahrenheit";
    private static final String CELSIUS_PARA_KELVIN = "Celsius a Kelvin";
    private static final String KELVIN_PARA_FAHRENHEIT = "Kelvin a Fahrenheit";
    private static final String KELVIN_PARA_CELSIUS = "Kelvin a Celsius";
    private static final String FAHRENHEIT_PARA_CELSIUS = "Fahrenheit a Celsius";
    private static final String FAHRENHEIT_PARA_KELVIN = "Fahrenheit a Kelvin";


    public double operarConversao(String operacionTemperatura, double valorInicial) throws Exception {
        switch (operacionTemperatura){
            case CELSIUS_PARA_FAHRENHEIT -> {
                return convertidorDeTemperatura.convertirCelsiusParaFahrenheit(valorInicial);
            }
            case CELSIUS_PARA_KELVIN -> {
                return convertidorDeTemperatura.convertirCelsiusParaKelvin(valorInicial);
            }
            case KELVIN_PARA_CELSIUS -> {
                return convertidorDeTemperatura.convertirKelvinParaCelsius(valorInicial);
            }
            case KELVIN_PARA_FAHRENHEIT -> {
                return convertidorDeTemperatura.convertirKelvinParaFahrenheit(valorInicial);
            }
            case FAHRENHEIT_PARA_CELSIUS -> {
                return convertidorDeTemperatura.convertirFahrenheitParaCelsius(valorInicial);
            }
            case FAHRENHEIT_PARA_KELVIN -> {
                return convertidorDeTemperatura.convertirFahrenheitParaKelvin(valorInicial);
            }
            default -> throw new Exception("Elección Inválida");
        }
    }
}
