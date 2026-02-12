package service;

import model.Pedido;

public interface EstrategiaDesconto {
    double aplicar(Pedido pedido);

}
