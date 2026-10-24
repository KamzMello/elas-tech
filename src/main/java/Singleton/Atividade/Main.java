    package Singleton.Atividade;

    public class Main {

        public static void main(String[] args) {

            ContadorVisitas pagina1 = ContadorVisitas.getInstancia();
            ContadorVisitas pagina2 = ContadorVisitas.getInstancia();

            pagina1.registrarVisita();
            pagina1.registrarVisita();
            pagina2.registrarVisita();

            System.out.println("Total de visitas: " + pagina1.getTotal());
        }
    }

