package Daniel;

public class Clase {
    public static void main(String[]args){
        Coche miCoche = new Coche();
        miCoche.AnadirPuerta();
        System.out.println(miCoche.Puertas);
    }
}

class Coche{
    public int Puertas=4;
    public void AnadirPuerta(){
        this.Puertas++;
    }
}