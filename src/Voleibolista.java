public class Voleibolista extends Atleta implements Evaluar{
    private int saquesEfectivos;
    private int bloqueos;

    public Voleibolista() {
    }

    public Voleibolista(String nombre, int edad, double horasEntrenamiento, int saquesEfectivos, int bloqueos) {
        super(nombre, edad, horasEntrenamiento);
        this.saquesEfectivos = saquesEfectivos;
        this.bloqueos = bloqueos;
    }

    public void mostrarInfo(){
        System.out.println("--Nombre: "+nombre+" --Edad:"+edad+" --Horas de entrenamiento: "+horasEntrenamiento+" --Saques efectivos: "+saquesEfectivos+" --Bloqueos: "+bloqueos);
    }

    @Override
    public double calcularRendimineto() {
        double rendimiento = (saquesEfectivos * 2) + (bloqueos * 3);
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
