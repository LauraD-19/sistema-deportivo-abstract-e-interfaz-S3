public class Atleta {
    protected String nombre;
    protected  int edad;
    protected double horasEntrenamiento;

    public Atleta() {
    }

    public Atleta(String nombre, int edad, double horasEntrenamiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.horasEntrenamiento = horasEntrenamiento;
    }

    public void mostrarInfo(){
        System.out.println("--Nombre: "+nombre+" --Edad:"+edad+" --Horas de entrenamiento: "+horasEntrenamiento);
    }
    public abstract void calcularRendimineto();

}
