public class App {
    public static void main(String[] args) throws Exception {
        int cant;
        Scanner read = new Scanner(System.in);
        System.out.println("cuantos nombres vas a capturar?");
        cant = read.nextInt();
        String[] listaNombre = new String[cant];
        read.nextLine();
        // hay que preguntar cada nombre 
        for (int i = 0; i<listaNombre.length; i++){
            System.out.println("nombre #" +(i + 1)+ ": ");
        listaNombre[i] = read.nextLine();
            
        }
          for (int i = 0; i<listaNombre.length; i++){
              System.out.println(listaNombre[i]);
    }
}
}