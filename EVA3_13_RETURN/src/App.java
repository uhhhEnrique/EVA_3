import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        System.out.println("Valor 1: ");
        int val1 = read.nextInt();
        System.out.println("Valor 2: ");
        int val2 = read.nextInt();
        //LLAMAR LA FUNCIÓN
        //1.Guardar el resultado:
        int resu = sumar(val1, val2);
        System.out.println("La suma es = ");
        //2. Usar directamente el resultado de la función
        System.out.println("La suma es = " + sumar(val1, val2));
        //3.Ignorar el resultado
        sumar(val1, val2);

    }
public static int sumar(int num1, int num2){
    int resu = num1 + num2;
    return resu; //Es la ultima instrucción del método
                 //después del return no puede haber más instrucciónes


}


}
 