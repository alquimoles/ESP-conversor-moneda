package model;

import enums.Moneda;
import interfaces.MonedaConvertible;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConvertidorDeMoneda implements MonedaConvertible {

    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnReais) {
        return valorEnReais.divide(moneda.getFACTOR_CONVERSION(), 2, RoundingMode.HALF_UP);
    }

    public BigDecimal convertirParaReal(Moneda moneda, BigDecimal valorEnMoneda){
        return valorEnMoneda.multiply(moneda.getFACTOR_CONVERSION());
    };


}
