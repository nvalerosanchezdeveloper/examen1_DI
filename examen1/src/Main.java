import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //concesionario - coches, furgos.
        //coche : marca, mk y color.
        //furgo: marca y km

        boolean bucle = true;

        System.out.println("1. Ver vehículos\n2. Crear coche\n3. Conducir vehículo por marca\n 4. Salir");

        while (true){
            System.out.print("Escoja una opción: ");
            int opcion = scanner.nextInt();
            if (opcion == 1) {
                String vehiculo1 = "Ford", vehiculo2 = "Opel", vehiculo3 = "BMW";

                System.out.println("OPCIÓN: 1");
                System.out.print("%s\n%s\n%s,vehiculo1,vehiculo2,vehiculo3");
            }


        }



    }
}