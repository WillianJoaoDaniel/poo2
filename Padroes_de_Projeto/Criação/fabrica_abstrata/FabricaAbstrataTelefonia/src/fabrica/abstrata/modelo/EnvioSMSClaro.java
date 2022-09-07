package fabrica.abstrata.modelo;

public class EnvioSMSClaro implements EnvioSMS{
    @Override
    public boolean enviar(Mensagem msg, int telefone){
        System.out.println("Enviando mensagem:" +  msg.texto + 
        " para o telefone claro:" + telefone );
        return true;
    }
 }
