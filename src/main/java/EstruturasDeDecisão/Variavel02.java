package EstruturasDeDecisao;

public class Variavel02 {
    public static void main(String[] args) {

    /*2 — Crie variáveis para o saldo da conta (R$ 500.00) e o valor de uma compra (R$ 320.00).
    Se o saldo for suficiente, mostre "Compra aprovada!" e o saldo restante. Se não for,
     "Saldo insuficiente" e quanto está faltando.*/


        double saldoDaConta = 500.00;
        double valorDaCompra = 320.00;


        if (saldoDaConta >= valorDaCompra) {
            double saldoRestante = saldoDaConta - valorDaCompra;

            System.out.println("Compra aprovada!");
            System.out.println("Saldo restante: R$" + saldoRestante);

        } else {
            double valorFaltando = valorDaCompra - saldoDaConta;

            System.out.println("Saldo insuficiente!");
            System.out.println(" Valor que falta : R$" + valorFaltando);
        }


    }
}
