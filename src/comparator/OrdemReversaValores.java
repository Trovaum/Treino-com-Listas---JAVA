package comparator;

import java.util.Comparator;

public class OrdemReversaValores implements Comparator<CarroEValor> {
    @Override
    public int compare(CarroEValor valor1, CarroEValor valor2) {
        return valor2.getValor() - valor1.getValor();
    }
}
