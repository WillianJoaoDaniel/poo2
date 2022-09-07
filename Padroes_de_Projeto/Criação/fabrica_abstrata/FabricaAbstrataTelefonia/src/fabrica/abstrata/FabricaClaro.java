package fabrica.abstrata;

import fabrica.abstrata.modelo.Cobranca;
import fabrica.abstrata.modelo.CobrancaClaro;
import fabrica.abstrata.modelo.EnvioSMS;
import fabrica.abstrata.modelo.EnvioSMSClaro;

public class FabricaClaro extends FabricaAbstrataEnvios{
    @Override
    public EnvioSMS criaEnvioSMS(){
        return new EnvioSMSClaro();

    }
    @Override
    public Cobranca criaCobranca(){
        return new CobrancaClaro();
    }
}
