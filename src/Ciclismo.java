public class Ciclismo extends Atleta implements  Evaluar{
    private double kilometroRecorrido;
    private double tiempoHoras;

    public Ciclismo() {
    }

    public Ciclismo(double kilometroRecorrido, double tiempoHoras) {
        this.kilometroRecorrido = kilometroRecorrido;
        this.tiempoHoras = tiempoHoras;
    }

    public Ciclismo(String nombre, int edad, double horasEntrenamiento, double kilometroRecorrido, double tiempoHoras) {
        super(nombre, edad, horasEntrenamiento);
        this.kilometroRecorrido = kilometroRecorrido;
        this.tiempoHoras = tiempoHoras;
    }

    @Override
    public String toString() {
        return "Ciclismo{" +
                "kilometroRecorrido=" + kilometroRecorrido +
                ", tiempoHoras=" + tiempoHoras +
                '}';
    }

    @Override
    public void calcularRendimineto() {
        double rendimiento = kilometroRecorrido / tiempoHoras;
        System.out.println(rendimiento);


    }

    @Override
    public void clasificarNivel() {

    }

    @Override
    public void calcularBono() {

    }
}
