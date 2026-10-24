/*1. (sentir o private na pele)

   CLASSE= Crie a classe ContaBancaria com os atributos titular (String) e
   saldo (double), os DOIS private.

   MAIN =  crie uma conta e tente fazer estas duas linhas:
   System.out.println(c.titular);
   c.saldo = -5000;

   Rode e LEIA o erro.

   Saída esperada:

   error: titular has private access in ContaBancaria
   error: saldo has private access in ContaBancaria

    Agora a classe está fechada demais — não dá pra fazer nada
      com ela. As próximas questões abrem as portas, uma por uma.

 */



// get= pegar/olhar
package AtividadeEncapsulamento;

public class ContaBancaria {

    private String titular ;
    private double saldo;
    private String numeroConta = "001-X";

    public String getTitular () {
        return  titular;

    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    //Setter
    public void setTitular(String titular) {

        if (titular == null || titular.isEmpty()) {
            System.out.println("Titular Inválido! Mantido " + this.titular);
            return;
        }
        this.titular = titular;
    }


//Criando novo método 01 = depositar dinhero= PUBLICOS

    public  void depositar (double valor) {
        if (valor <=0) {
            System.out.println(" valor inválido!");
            return;
        }

        saldo +=valor;
        registrarLog("deposito de " + valor);
}
// Criando novo método 02= Sacar dinheiro - PUBLICO
        public  void sacar (double valor) {
        if (!temSaldo(valor)){
                System.out.println(" Saldo insuficiente!" );
                return;
}

            saldo -= valor;
            registrarLog("saque de " + valor);
        }
  // Criando método 03- para verificar o saldo = PRIVADO
        private boolean temSaldo (double valor) {
            return valor > 0 && saldo >= valor;
        }

  // criando método 04 = para resgistar   a operação = PRIVADO

        private void registrarLog ( String acao) {
            System.out.println("[LOG] " + titular + ":" + acao);
        }
}

