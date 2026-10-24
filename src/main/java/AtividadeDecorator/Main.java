
package AtividadeDecorator;

public class Main {
    public static void main(String[] args) {

        // Açaí + granola
        Acai acaiComGranola = new Granola(new AcaiSimples());

        System.out.println("Descrição: " + acaiComGranola.getDescricao());
        System.out.println("Preço: R$ " + acaiComGranola.getPreco());

        System.out.println();

        // Açaí com granola +  morango
        Acai acaiComGranolaEMorango =
                new Morango(new Granola(new AcaiSimples()));

        System.out.println("Descrição: " + acaiComGranolaEMorango.getDescricao());
        System.out.println("Preço: R$ " + acaiComGranolaEMorango.getPreco());
    }
}
