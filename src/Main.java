import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Atleta> AtletaList = new ArrayList<>();
        Ciclismo c1 = new Ciclismo("Sebastian", 25, 45, 450, 4);
        Boxeador b1 = new Boxeador("Valeria", 20, 20, 30, 5);
        Voleibolista v1 = new Voleibolista("Angelica", 23, 33, 10, 0);
        //lista
        AtletaList.add(c1);
        AtletaList.add(b1);
        AtletaList.add(v1);

        //1
        System.out.println("\n");
        c1.mostrarInfo();
        double rendimineto=c1.calcularRendimineto();
        String nivel= c1.clasificarNivel(rendimineto);
        double bono=c1.calcularBono(nivel);

        System.out.println("--Rendimiento: "+rendimineto);
        System.out.println("--Nivel: "+nivel);
        System.out.println("--Bono: "+bono);

        //2
        System.out.println("\n");
        b1.mostrarInfo();
        double rendimineto2=b1.calcularRendimineto();
        String nivel2= b1.clasificarNivel(rendimineto2);
        double bono2=b1.calcularBono(nivel2);

        System.out.println("--Rendimiento: "+rendimineto2);
        System.out.println("--Nivel: "+nivel2);
        System.out.println("--Bono: "+bono2);

        //3
        System.out.println("\n");
        b1.mostrarInfo();
        double rendimineto3=v1.calcularRendimineto();
        String nivel3= v1.clasificarNivel(rendimineto3);
        double bono3=v1.calcularBono(nivel3);

        System.out.println("--Rendimiento: "+rendimineto3);
        System.out.println("--Nivel: "+nivel3);
        System.out.println("--Bono: "+bono3);

        //mayor
        System.out.println("\n");
        Atleta mayor=null;
        double mayorRendimiento=0;
        for(Atleta A: AtletaList){
            double total= A.calcularRendimineto();
            if(total>mayorRendimiento){
                mayorRendimiento=total;
                mayor=A;
            }
        }
        if(mayor!=null){
            System.out.println("--El Atleta con mayor rendimiento: "+ mayor.getNombre()+" con="+mayorRendimiento);

        }

    }
}