package ForEach;
import java.util.ArrayList;

public class Atividade02 {


    // 2. Crie um ArrayList com 5 notas ( TEM QUE IMPORTAR E DEPOIS ATIBUIR UM NOVO NOME)
    // e imprima todas usando for-each.

    public static void main(String[] args) {

        ArrayList<Double> notas =  new ArrayList();

            notas.add(7.5);
            notas.add(8.6);
            notas.add(9.0);
            notas.add(6.5);
            notas.add(4.5);


        for (double nota : notas) {
            System.out.println(nota);
        }
    }
}