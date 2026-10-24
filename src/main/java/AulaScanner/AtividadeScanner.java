
/*package AulaScanner;

import java.util.Scanner;

public class AtividadeScanner {
    public  static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//  Peça um número e mostre a tabuada dele de 1 a 10.


        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        sc.close();
    }


}


*/



/*package AulaScanner;

import java.util.Scanner;

public class AtividadeScanner {
    public  static void main(String[] args) {

//3 - Peça a nota de uma aluna e mostre se ela foi aprovada
(7 ou mais), ficou de recuperação (entre 5 e 6.9) ou foi reprovada.


        Scanner sc = new Scanner(System.in);

        System.out.println(" Insira a sua nota da prova: ");
        double nota = sc.nextDouble();

        if (nota >= 7) {
            System.out.println(" Vc foi aprovada");

        } else if (nota >= 5) {
            System.out.println(" vc está de recuperação");
        } else {
            System.out.println(" Reprovada");
        }

        sc.close();
    }
    }
*/


/*package AulaScanner;

import java.util.Scanner;

public class AtividadeScanner {
    public  static void main(String[] args) {

// 2 - Peça dois números inteiros e mostre a soma,
// a subtração, a multiplicação, a divisão e o resto.

        Scanner sc = new Scanner(System.in);

        System.out.println(" Insira 2 números inteiros: ");
        int numero01 = sc.nextInt();
        int numero02 = sc.nextInt();

        System.out.println(" Soma:" + (numero01 + numero02));
        System.out.println( "Subtração: " + (numero01 - numero02 ));
        System.out.println( " multiplicação : "+  (numero01+ numero02));
        System.out.println( " divisão: " +  (numero01 /  numero02));
        System.out.println( " resto : " + (numero01 % numero02));

    }
  }






/* 1 - Peça o nome da pessoa e a idade dela.
// Exemplo: "Oi Ana, você tem 28 anos e vai fazer 29 no próximo aniversário."

public class AtividadeScanner {
     public  static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         System.out.println(  " Digite seu nome:  ");
          String  nome = sc.nextLine();

         System.out.println( " Digite sua idade:  ");
         int idade = sc.nextInt();

         int proximoAniversario = idade + 1;

         System.out.println( " Oi " + nome  + " ,vc tem " + idade  + " e vai fazer " +  proximoAniversario +  " no próximo aniversário"  );

         sc.close();

    }

}

/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println( "Digite seu nome:  ");
         String nome = sc.nextLine();

        System.out.println( " Digite sua idade:  ");
         int idade = sc.nextInt();

        System.out.println( " Pretensão salarial:   ");
        double salario = sc.nextDouble();



    }

}

  /*  public static void main( String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println( " Digite  o seu nome:   ");
         String nome = sc.nextLine();

        System.out.println( " Digite a sua idade:   ");
        int idade  = sc.nextInt();


        System.out.println( " Olá" +  nome  +  " , vc tem " +  idade  +  " anos!");

    }
}
*/