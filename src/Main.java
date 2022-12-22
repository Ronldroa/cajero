import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Inicialmente se debe pedir cuantos billetes se cargan al cajero para cada denominación.
        System.out.println("Ingrese cantidad de billetes de 50: ");
        int cantidadBilletes50 = scanner.nextInt();
        System.out.println("Ingrese cantidad de billetes de 100: ");
        int cantidadBilletes100 = scanner.nextInt();
        System.out.println("Ingrese cantidad de billetes de 200: ");
        int cantidadBilletes200 = scanner.nextInt();
        System.out.println("Ingrese cantidad de billetes de 500: ");
        int cantidadBilletes500 = scanner.nextInt();

        //Posterior a esta carga inicial se inicia el ciclo de extracción donde se debe pedir el monto a retirar.

        System.out.println("Ingrese la cantidad a retirar: ");
        int montoParaRetirar = scanner.nextInt();

        //que el monto ingresado no supere a los 5000.
        //si excede los 5000 pesos, se debe mostrar un mensaje de error y volver a pedir el monto a retirar.

        while (montoParaRetirar > 5000) {
            System.out.println("El monto ingresado no puede superar los 5000 pesos");
            System.out.println("Ingrese la cantidad a retirar: ");
            montoParaRetirar = scanner.nextInt();
        }

        // que el monto ingresado no exceda el saldo disponible en el cajero.
        // si excede el saldo disponible, se debe mostrar un mensaje de error y volver a pedir el monto a retirar.
        while (montoParaRetirar > (cantidadBilletes50 * 50 + cantidadBilletes100 * 100 + cantidadBilletes200 * 200 + cantidadBilletes500 * 500)) {
            System.out.println("El monto ingresado no puede superar el saldo disponible en el cajero");
            System.out.println("Ingrese la cantidad a retirar: ");
            montoParaRetirar = scanner.nextInt();
        }

        ////Se debe validar que el monto a retirar sea múltiplo de 50, de lo contrario se debe mostrar un mensaje de error y volver a pedir el monto a retirar.
        while (montoParaRetirar % 50 != 0) {
            System.out.println("El monto ingresado debe ser múltiplo de 50");
            System.out.println("Ingrese la cantidad a retirar: ");
            montoParaRetirar = scanner.nextInt();
        }

        //Se debe validar que el monto a retirar no sea mayor al saldo disponible en el cajero, de lo contrario se debe mostrar un mensaje de error y volver a pedir el monto a retirar.
        while (montoParaRetirar > (cantidadBilletes50 * 50 + cantidadBilletes100 * 100 + cantidadBilletes200 * 200 + cantidadBilletes500 * 500)) {
            System.out.println("El monto ingresado no puede superar el saldo disponible en el cajero");
            System.out.println("Ingrese la cantidad a retirar: ");
            montoParaRetirar = scanner.nextInt();
        }

        //Mostrar el monto a retirar y la cantidad de billetes de la denominacion correspondiente que se deben entregar. si no hay billetes de una denominación, no se debe mostrar nada.
        while (montoParaRetirar > 0) {

            if (montoParaRetirar >= 500 && cantidadBilletes500 > 0) {
                montoParaRetirar -= 500;
                cantidadBilletes500--;


            } else if (montoParaRetirar >= 200 && cantidadBilletes200 > 0) {
                montoParaRetirar -= 200;
                cantidadBilletes200--;


            } else if (montoParaRetirar >= 100 && cantidadBilletes100 > 0) {
                montoParaRetirar -= 100;
                cantidadBilletes100--;


            } else if (montoParaRetirar >= 50 && cantidadBilletes50 > 0) {
                montoParaRetirar -= 50;
                cantidadBilletes50--;


            } else {
                System.out.println("No hay billetes disponibles para el monto ingresado");
                break;
            }
            if (montoParaRetirar == 0) {
                System.out.println("Retire su dinero");
                if (cantidadBilletes50 > 0) {
                    System.out.println("Billetes de 50: " + cantidadBilletes50);
                }
                if (cantidadBilletes100 > 0) {
                    System.out.println("Billetes de 100: " + cantidadBilletes100);
                }
                if (cantidadBilletes200 > 0) {
                    System.out.println("Billetes de 200: " + cantidadBilletes200);
                }
                if (cantidadBilletes500 > 0) {
                    System.out.println("Billetes de 500: " + cantidadBilletes500);
                }

            }

        }

//        System.out.println("Desea retirar otro monto? (S/N)");
//        String respuesta = scanner.next();
//
//        if (respuesta.equals("S")) {
//            System.out.println("Ingrese la cantidad a retirar: ");
//            montoParaRetirar = scanner.nextInt();
//
//        } else if (respuesta.equals("N")) {
//            System.out.println("Gracias por utilizar nuestros servicios");
//
//        } else {
//            System.out.println("La respuesta ingresada es incorrecta");
//        }

    }

   
}

