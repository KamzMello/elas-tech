package EstruturasDeDecisão;

public class Variavel04 {

    public static void main(String[] args) {

        /* Crie variáveis idade (17) e temAutorizacao (true).
        Mostre se a pessoa pode entrar na festa: precisa ter 18 anos ou ter autorização.
        ( DICAAS ! USAR O BOLLEAN +  OPERADOR OUU ( || ) + OPERADOR E (&&) )
        Faça o mesmo para precisa ter 18 anos e ter autorização.
         */

         int idade = 17;

         boolean temAutorizacao = true;

         if (idade >= 18 || temAutorizacao ) {
             System.out.println( "Pode entrar na festa!");

         }else{
             System.out.println( "Ñ pode entarr na Festa!");
         }

        if (idade >= 18  && temAutorizacao ) {
            System.out.println( " Pode entrar na festa!");

        } else {
            System.out.println( " Não pode entrar" );

        }


    }

}
