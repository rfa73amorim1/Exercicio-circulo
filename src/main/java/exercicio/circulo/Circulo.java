package exercicio.circulo;

public class Circulo {
    private double raio;

    private final double pi = 3.1416;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double Area (double raio){
        return pi*(raio*raio);
    }
    public double Circunferencia (double raio){
        return 2* pi* raio;
    }
    public double aumentarRaio(double percentual){
        double novoRaio = raio + (raio * percentual)/100;
        setRaio(novoRaio);
        return novoRaio;
    }
}
