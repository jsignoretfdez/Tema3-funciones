public class App {
    public static void main(String[] args) throws Exception {
        
        Coche misPuertas = new Coche();
        misPuertas.ponerPuertas();
        misPuertas.ponerPuertas();
        misPuertas.ponerPuertas();
        misPuertas.ponerPuertas();
        System.out.println(suma(10,20,50));
        System.out.println(misPuertas.puertas);

    }

    public static int suma(int a, int b,int c){
        int resultado = a + b + c;
        return resultado;
        
    }

    
}

class Coche {
    int puertas = 3;

    public int ponerPuertas(){
        return puertas++;
    }

}