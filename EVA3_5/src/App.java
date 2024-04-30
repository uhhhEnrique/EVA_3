public class App {
    public static void main(String[] args) throws Exception {
        int arreglo[] = new int[3];
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        //------
                arreglo = new int[5];
        System.out.println("");
        System.out.println("DESPUESDE DEL CAMBIO DE TAMAÑO");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
    }
}
}
