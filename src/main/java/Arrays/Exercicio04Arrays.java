package Arrays;

import java.util.Scanner;

  public class Exercicio04Arrays {
      // 4 — Peça 5 números para a pessoa, guarde num array,
// e depois mostre todos de trás pra frente.
     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         int[] numeros = new int[5];

         System.out.println("Insira 5 números: ");


      for (int i = 0; i < 5; i ++) {
          numeros[i] = sc.nextInt();
      }
      for (int i= 4; i>=0; i--){
          System.out.println(numeros[i]);
      }
      sc.close();
    }
  }