package service;

import model.Pedido;

public class DescontoCupom implements EstrategiaDesconto {


    @Override
    public double aplicar(Pedido pedido) {
        return pedido.getValorBruto() * 0.85;
    }

}