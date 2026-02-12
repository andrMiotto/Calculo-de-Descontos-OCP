package service;

import model.Pedido;

public class DescontoSazonal implements EstrategiaDesconto {


    @Override
    public double aplicar(Pedido pedido) {
        return pedido.getValorBruto() * 0.90;
    }
}