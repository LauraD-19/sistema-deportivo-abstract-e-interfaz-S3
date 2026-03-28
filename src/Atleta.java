public abstract class Atleta {
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

    public String getNombre() {
        return nombre;
    }

    public void mostrarInfo(){
        System.out.println("--Nombre: "+nombre+" --Edad:"+edad+" --Horas de entrenamiento: "+horasEntrenamiento);
    }
    public abstract double calcularRendimineto();

}
