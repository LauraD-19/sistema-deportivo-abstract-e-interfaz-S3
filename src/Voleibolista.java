public class Voleibolista extends Atleta implements Evaluar{
    private int saquesEfectivos;
    private int bloqueos;

    public Voleibolista() {
    }

    public Voleibolista(int saquesEfectivos, int bloqueos) {
        this.saquesEfectivos = saquesEfectivos;
        this.bloqueos = bloqueos;
    }

    public Voleibolista(String nombre, int edad, double horasEntrenamiento, int saquesEfectivos, int bloqueos) {
        super(nombre, edad, horasEntrenamiento);
        this.saquesEfectivos = saquesEfectivos;
        this.bloqueos = bloqueos;
    }

    @Override
    public void calcularRendimineto() {
        double rendimiento = (saquesEfectivos * 2) + (bloqueos * 3);
        System.out.println(rendimiento);

    }

    @Override
    public void clasificarNivel() {

    }

    @Override
    public void calcularBono() {

    }
}
