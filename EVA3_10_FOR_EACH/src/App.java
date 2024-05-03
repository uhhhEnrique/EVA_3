public class App {
    public static void main(String[] args) throws Exception {
        String diasSemana[] = {"Domingo", "Lunes", "Martes", "Miercoles", 
                                    "Jueves", "Viernes", "Sábado"};
        for (String dia : diasSemana) { 
            System.out.println(dia);
        }

        int salario[] = {50, 100, 200, 300, 500, 1000};
        for(int cant : salario){
            System.out.println("$" + cant);
        }

        String MesesAño[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
                                    "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
                                    for(String Mes : MesesAño){
                                        System.out.println(Mes);
                                    }








    }
}
