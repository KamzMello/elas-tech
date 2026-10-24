package ForEach;

public class Atividade04 {

// 4. Com um array de nomes, use for-each e um if
// para contar quantos têm mais de 5 letras.
//  Mostre o total. Dica: usem o método length.


    public static void main(String[] args) {

        String [] nomes = { "Marcio", "Bia", "Ana", "Raul", "Fernanda" };
         int total = 0; // contador

        for (String nome: nomes) {
            if (nome.length() > 5) {
                total ++;           }
        }
        System.out.println( "Total: " +  total);
    }
}
