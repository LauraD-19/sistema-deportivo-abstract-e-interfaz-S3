public class Boxeador extends Atleta implements Evaluar{
    private int gopesAcertados;
    private int peleasGanadas;

    public Boxeador() {
    }


    public Boxeador(String nombre, int edad, double horasEntrenamiento, int gopesAcertados, int peleasGanadas) {
        super(nombre, edad, horasEntrenamiento);
        this.gopesAcertados = gopesAcertados;
        this.peleasGanadas = peleasGanadas;
    }

    public void mostrarInfo(){
        System.out.println("--Nombre: "+nombre+" --Edad:"+edad+" --Horas de entrenamiento: "+horasEntrenamiento+" --Golpes acertados: "+gopesAcertados+" --Peleas ganadas: "+peleasGanadas);
    }

    @Override
    public double calcularRendimineto() {
        double rendimiento = (gopesAcertados * 0.5) + (peleasGanadas * 10);
        return rendimiento;


    }

    @Override
    public String clasificarNivel(double rendimiento) {
        if(rendimiento<30){
            return "basico";
        }else if(rendimiento>=30&&rendimiento<=70){
            return "competente";
        }else {
            return "Elite";
        }

    }

    @Override
    public double calcularBono(String nivel) {
        switch (nivel){
            case "basico":
                return 50000;
            case "competente":
                return 150000;
            case "elite":
                return 300000;
            default:
                return 0;
        }

    }
}
