package comparator;

public class CarroEValor implements Comparable<CarroEValor> {
    private String carro;
    private Integer valor;

    public CarroEValor(String carro, Integer valor) {
        this.carro = carro;
        this.valor = valor;
    }

    public String getCarro() {
        return carro;
    }

    public Integer getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return carro + " - R$" + valor;
    }

    @Override
    public int compareTo(CarroEValor o) {
        return this.getValor() - o.getValor();
    }
}
