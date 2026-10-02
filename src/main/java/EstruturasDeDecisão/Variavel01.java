package EstruturasDeDecisão;

public class Variavel01 {

    static void main() {
        /*1 — Crie uma variável idade e mostre a categoria de uma pessoa:
        menos de 13 anos é "Criança", de 13 a 17 é "Adolescente", de
        18 a 59 é "Adulto" e 60 ou mais é "Idoso". - DICA: F/ ELSE IF- 2x /ELS */

                int idade = 20;

                if (idade < 13) {

                    System.out.println("Criança");

                } else if (idade <= 17) {

                    System.out.println("Adolescente");

                } else if (idade <= 59) {

                    System.out.println("Adulto");

                } else {

                    System.out.println("Idoso");

                }


            }
}
