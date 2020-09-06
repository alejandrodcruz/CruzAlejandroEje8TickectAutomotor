//Enunciado 
/*
Se solicita hacer un sistema para sacar turnos en un centro de servicios para el automovil.
se debe solicitar al clientes :
    -Nombre del Clientes, DNI y dominio del vehiculo
Solicitar al cliente permitir seleccionar:
Cambio de neumáticos
Cambio de aceite
Pastillas de frenos 
Alineación 
Balanceo
Impirmir el turno al cliente con detalle con los servicios seleccionados y la informacion del cliente
 */
package cruz.alejandro.cruzalejandroeje8tickectautomotor;

import java.util.Scanner;

public class TurnoServicios {

    public static void main(String[] args) {

        // Declasion de variables
        int servicio = 0;
        int marca = 0;
        String cliente = "";
        String dominio = "";
        String nmarca = "";
        String nservicio = "";
        String cantServicios[] = new String[5];

        Scanner leer = new Scanner(System.in);

        int dni = 0;
        boolean neumáticos = false;
        boolean aceite = false;
        boolean frenos = false;
        boolean alineacion = false;
        boolean balanceo = false;

        //Informacion de Cliente
        System.out.println("==================================");
        System.out.println("======== Bienvenido ==============");
        System.out.println("=== Centro Servicios  CFP N°36 ===");
        System.out.println("==Ingrese el Nombre:");
        cliente = leer.nextLine();
        System.out.println("==Ingrese el DNI:");

        dni = leer.nextInt();

        do {
            System.out.println("==Ingrese la marca :");
            System.out.println("== 1-Ford");
            System.out.println("==  2-Chevrolet");
            System.out.println("==  3-Renault");
            System.out.println("==  4-Fiat");
            System.out.println("==  5-Citroen");
            marca = leer.nextInt();

        } while (marca == 0 || marca > 5);

        System.out.println("Ingrese el dominio del vehiculo:");
        dominio = leer.next();
        int contador = 0;

        do {
            System.out.println("==Ingrese el servicio :");
            System.out.println("==  1- Cambio de neumáticos");
            System.out.println("==  2- Cambio de aceite");
            System.out.println("==  3- Pastillas de frenos");
            System.out.println("==  4- Alineación");
            System.out.println("==  5- Balanceo");
            System.out.println("==  9- Salir");
            System.out.println("==================================");
            servicio = leer.nextInt();

            if (servicio >= 1 && servicio <= 5) {

                switch (servicio) {
                    case 1:
                        nservicio = "Cambio de Neumáticos";
                        break;
                    case 2:
                        nservicio = "Cambio de Aceite";
                        break;
                    case 3:
                        nservicio = "Pastillas de Frenos";
                        break;
                    case 4:
                        nservicio = "Alineación";
                        break;
                    case 5:
                        nservicio = "Balanceo";
                        break;
                };

                cantServicios[contador] = nservicio;

                contador++;
            }
        } while (servicio != 9 || contador > 4);

        //Imprimir ticket
        System.out.println("==================================");
        System.out.println("======== Bienvenido ==============");
        System.out.println("Centro Servicios  CFP N°36");
        System.out.println("Zavaleta 204, C1437EYF, CABA");
        System.out.println("==================================");
        System.out.println("Nombre del Cliente " + cliente);
        System.out.println("DNI del cliente  " + dni);
        System.out.println("Marca del Vehiculo " + nmarca);
        System.out.println("Dominio del Vehiculo " + dominio);
        System.out.println("==================================");
        for (String cantServicio : cantServicios) {
            System.out.println("Servicios :" + cantServicio);
        }
        System.out.println("==================================");

    }

}
