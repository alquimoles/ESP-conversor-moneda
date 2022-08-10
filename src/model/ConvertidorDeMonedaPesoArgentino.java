package model;

import enums.Moneda;

import java.math.BigDecimal;

public class ConvertidorDeMonedaPesoArgentino extends ConvertidorDeMoneda {

    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnReais) {
        moneda = Moneda.PESO_ARGENTINO;
        return super.convertirParaMoneda(moneda, valorEnReais);
    }

    @Override
    public BigDecimal convertirParaReal(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.PESO_ARGENTINO;
        return super.convertirParaReal(moneda, valorEnMoneda);
    }
}
