import model.Pedido;
import service.CalculadoraDesconto;
import service.DescontoAniversario;
import service.DescontoSazonal;
import service.EstrategiaDesconto;

public class Main {
    public static void main(String[] args) {


        Pedido pedido =  new Pedido("1",1000,3,"teste@gmail.com",null);


        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();
        EstrategiaDesconto estrategiaDesconto = new DescontoSazonal();

        double valorFinal = calculadoraDesconto.aplicarDesconto(pedido, estrategiaDesconto);

        System.out.println("Valor com desconto: " + valorFinal);

    }
}