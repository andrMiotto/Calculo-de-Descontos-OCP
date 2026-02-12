package service;

import model.Pedido;

public class CalculadoraDesconto {


    public double aplicarDesconto(Pedido pedido,EstrategiaDesconto estrategiaDesconto){
        return estrategiaDesconto.aplicar(pedido);

    }
}
