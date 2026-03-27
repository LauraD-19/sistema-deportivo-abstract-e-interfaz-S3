public class Boxeador extends Atleta implements Evaluar{
    private int gopesAcertados;
    private int peleasGanadas;

    public Boxeador() {
    }

    public Boxeador(int gopesAcertados, int peleasGanadas) {
        this.gopesAcertados = gopesAcertados;
        this.peleasGanadas = peleasGanadas;
    }

    public Boxeador(String nombre, int edad, double horasEntrenamiento, int gopesAcertados, int peleasGanadas) {
        super(nombre, edad, horasEntrenamiento);
        this.gopesAcertados = gopesAcertados;
        this.peleasGanadas = peleasGanadas;
    }

    @Override
    public void calcularRendimineto() {
        double rendimiento = (gopesAcertados * 0.5) + (peleasGanadas * 10);
        System.out.println(rendimiento);


    }

    @Override
    public void clasificarNivel() {

    }

    @Override
    public void calcularBono() {

    }
}
