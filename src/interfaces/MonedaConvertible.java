package interfaces;

import enums.Moneda;

import java.math.BigDecimal;

public interface MonedaConvertible {

    BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEmReais);
    BigDecimal convertirParaReal(Moneda moneda, BigDecimal valorNaMoeda);

}
