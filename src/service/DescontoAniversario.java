package service;

import model.Pedido;

public class DescontoAniversario implements EstrategiaDesconto{

    @Override
    public double aplicar(Pedido pedido) {
        return pedido.getValorBruto() * 0.80;
    }
}
