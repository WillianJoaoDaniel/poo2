package fabrica.abstrata.modelo;

public class CobrancaClaro implements Cobranca {
    @Override
    public void cobrar(int telefone){
        System.out.println("cobrar via Claro");
    }
    
}
