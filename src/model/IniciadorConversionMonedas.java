package model;

import enums.Moneda;
import enums.TipoConversion;

import java.math.BigDecimal;

public class IniciadorConversionMonedas {

    private static final String REAL_PARA_DOLAR = "De Real a Dólar";
    private static final String REAL_PARA_EURO = "De Real a Euro";
    private static final String REAL_PARA_LIBRA_ESTERLINA = "De Real a Libra Esterlina";
    private static final String REAL_PARA_PESO_ARGENTINO = "De Real a Peso Argentino";
    private static final String REAL_PARA_PESO_CHILENO = "De Real a Peso Chileno";
    private static final String DOLAR_PARA_REAL = "De Dólar a Real";
    private static final String EURO_PARA_REAL = "De Euro a Real";
    private static final String LIBRA_ESTERLINA_PARA_REAL = "De Libra Esterlina a Real";
    private static final String PESO_ARGENTINO_PARA_REAL = "De Peso Argentino a Real";
    private static final String PESO_CHILENO_PARA_REAL = "De Peso Chileno a Real";
    private ConvertidorDeMoneda convertidorDeMonedaDolar = new ConvertidorDeMonedaDolar();
    private ConvertidorDeMoneda convertidorDeMonedaEuro = new ConvertidorDeMonedaEuro();
    private ConvertidorDeMoneda convertidorDeMonedaLibraEsterlina = new ConvertidorDeMonedaLibraEsterlina();
    private ConvertidorDeMoneda convertidorDeMonedaPesoArgentino = new ConvertidorDeMonedaPesoArgentino();
    private ConvertidorDeMoneda convertidorDeMonedaPesoChileno = new ConvertidorDeMonedaPesoChileno();

    private Moneda moneda;

    public BigDecimal operarConversao(String operacionMonedas, double valorInicial) throws Exception {

        switch (operacionMonedas) {
            case REAL_PARA_DOLAR -> {
                return convertidorDeMonedaDolar.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case REAL_PARA_EURO -> {
                return convertidorDeMonedaEuro.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case REAL_PARA_LIBRA_ESTERLINA -> {
                return convertidorDeMonedaLibraEsterlina.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case REAL_PARA_PESO_ARGENTINO -> {
                return convertidorDeMonedaPesoArgentino.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case REAL_PARA_PESO_CHILENO -> {
                return convertidorDeMonedaPesoChileno.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case DOLAR_PARA_REAL -> {
                return convertidorDeMonedaDolar.convertirParaReal(moneda, BigDecimal.valueOf(valorInicial));
            }
            case EURO_PARA_REAL -> {
                return convertidorDeMonedaEuro.convertirParaReal(moneda, BigDecimal.valueOf(valorInicial));
            }
            case LIBRA_ESTERLINA_PARA_REAL -> {
                return convertidorDeMonedaLibraEsterlina.convertirParaReal(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESO_ARGENTINO_PARA_REAL -> {
                return  convertidorDeMonedaPesoArgentino.convertirParaReal(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESO_CHILENO_PARA_REAL -> {
                return convertidorDeMonedaPesoChileno.convertirParaReal(moneda, BigDecimal.valueOf(valorInicial));
            }
            default -> throw new Exception("ELECCIÓN INVÁLIDA");
        }

    }

}
