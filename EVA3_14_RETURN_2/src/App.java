import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner read = new Scanner(System.in);

        System.out.println("Base: ");
        int base = read.nextInt();
        System.out.println("Potencia: ");
        int pot = read.nextInt();

        System.out.println(base+"^"+pot+"="+calcularPot(base, pot));
    }

    public static int calcularPot(int base, int pot){
        //Necesitamos un ACUMULADOR
        //suma = suma + valor
        //suma += valor
        int acum=1;
        for (int i = 0; i != pot; i++){
            acum=acum*base;
         }
         return acum;
}
}
