package model;

import enums.Moneda;

import java.math.BigDecimal;

public class ConvertidorDeMonedaEuro extends ConvertidorDeMoneda {
    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnReais) {
        moneda = Moneda.EURO;
        return super.convertirParaMoneda(moneda, valorEnReais);
    }

    @Override
    public BigDecimal convertirParaReal(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.EURO;
        return super.convertirParaReal(moneda, valorEnMoneda);
    }
}
