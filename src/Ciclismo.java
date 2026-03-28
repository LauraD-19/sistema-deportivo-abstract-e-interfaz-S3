import java.lang.ref.SoftReference;

public class Ciclismo extends Atleta implements  Evaluar {
    private double kilometroRecorrido;
    private double tiempoHoras;

    public Ciclismo() {
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

    public void mostrarInfo(){
        System.out.println("--Nombre: "+nombre+" --Edad:"+edad+" --Horas de entrenamiento: "+horasEntrenamiento+" --Recorrido(km): "+kilometroRecorrido+" --Tiempo(h): "+tiempoHoras);
    }

    @Override
    public double calcularRendimineto() {
        double rendimiento = kilometroRecorrido / tiempoHoras;
        return rendimiento;
    }

    @Override
    public String clasificarNivel(double rendimiento) {
        if(rendimiento<30){
            return "basico";
        }else if(rendimiento>=30&&rendimiento<=70){
            return "competente";
        }else {
            return "elite";
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
