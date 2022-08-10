package model;

import enums.Moneda;

import java.math.BigDecimal;

public class ConvertidorDeMonedaPesoChileno extends ConvertidorDeMoneda {

    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnReais) {
        moneda = Moneda.PESO_CHILENO;
        return super.convertirParaMoneda(moneda, valorEnReais);
    }

    @Override
    public BigDecimal convertirParaReal(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.PESO_CHILENO;
        return super.convertirParaReal(moneda, valorEnMoneda);
    }
}
