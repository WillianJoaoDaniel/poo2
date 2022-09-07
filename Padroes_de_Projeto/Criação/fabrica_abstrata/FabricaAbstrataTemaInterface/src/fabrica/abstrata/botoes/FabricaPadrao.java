package fabrica.abstrata.botoes;

import javax.swing.JButton;

public class FabricaPadrao extends FabricaAbstrataBotoes {

    @Override
    public JButton criaBotaoOK() {
        return new JButton("OK");
    }

    @Override
    public JButton criaBotaoCancel() {
        return new JButton("Cancelar");
    }
    
}
