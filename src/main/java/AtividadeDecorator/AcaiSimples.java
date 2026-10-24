package AtividadeDecorator;

public class AcaiSimples implements Acai{

    @Override
    public String getDescricao () {
        return "Açai Simples";

    }

    @Override
    public double getPreco(){
        return 12.00;
    }
}
