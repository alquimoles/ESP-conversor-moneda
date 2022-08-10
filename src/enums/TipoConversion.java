package enums;

public enum TipoConversion {
    REAL_PARA_DOLAR("De Real a Dólar"),
    REAL_PARA_EURO("De Real a Euro"),
    REAL_PARA_LIBRA_ESTERLINA("De Real a Libra Esterlina"),
    REAL_PARA_PESO_ARGENTINO ("De Real a Peso Argentino"),
    REAL_PARA_PESO_CHILENO("De Real a Peso Chileno"),
    DOLAR_PARA_REAL("De Dólar a Real"),
    EURO_PARA_REAL("De Euro a Real"),
    LIBRA_ESTERLINA_PARA_REAL("De Libra Esterlina a Real"),
    PESO_ARGENTINO_PARA_REAL("De Peso Argentino a Real"),
    PESO_CHILENO_PARA_REAL("De Peso Chileno a Real"),


    CELSIUS_PARA_FAHRENHEIT("Celsius a Fahrenheit"),
    CELSIUS_PARA_KELVIN("Celsius a Kelvin"),
    KELVIN_PARA_FAHRENHEIT("Kelvin a Fahrenheit"),
    KELVIN_PARA_CELSIUS ("Kelvin a Celsius"),
    FAHRENHEIT_PARA_CELSIUS ("Fahrenheit a Celsius"),
    FAHRENHEIT_PARA_KELVIN("Fahrenheit a Kelvin");

    private String descripcion;

    TipoConversion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
