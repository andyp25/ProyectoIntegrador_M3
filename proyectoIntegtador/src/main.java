import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        System.out.println("*****MOTORCICLES*****");
        System.out.println("Somos una empresa dedicada a la venta de todo tipo de moto" +
                " según el propósito del cliente");

        do {
            System.out.println("1. Inicio" + " 2.Motos en Venta" + " 3.Clientes"
            +  " 4.Asesores" + " 5.Pagos");
            System.out.println("Selecciona una opción:");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Bienveido a MOTORCCICLES");
                    System.out.println("************************");
                    break;
                case 2:
                    System.out.println("Motos en venta...");
                    System.out.println("Qué moto deseas adquirir: ");
                    String adquirirMoto = sc.next();
                    System.out.println("Felicidades! Adquiriste una: " + adquirirMoto);
                    break;
                case 3:
                    System.out.println("CLientes");
                    System.out.print("Ingresa tu nombre:");
                    String nombre = sc.next();
                    System.out.print("Ingrese tu apellido: ");
                    String apellido = sc.next();
                    System.out.print("Ingrese su fecha de nacimiento: ");
                    String nacimiento = sc.next();
                    sc.nextLine();
                    System.out.print("correo electronico: ");
                    String email = sc.nextLine();
                    System.out.print("Número de contacto: ");
                    int contacto = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese su dirección: ");
                    String direccion = sc.nextLine();
                    break;
                case 4:
                    System.out.println("Asesores");
                    System.out.println("Asesor 1. Juan Ramiro Velez: Especialidad en motos deportivas");
                    System.out.println("Asesor 2. Jhon Jaime Betancur: Especialidad en motos clásicas");
                    System.out.println("Asesor 3. Kevin Torres: Especialidad en motos enduro");
                    break;
                case 5:
                    System.out.println("Pagos");
                    System.out.print("Nombre completo: ");
                    nombre = sc.next();
                    apellido = sc.next();
                    System.out.print("Moto a adquirir:");
                    adquirirMoto = sc.next();
                    System.out.print("Monto a pagar: ");
                    double monto = sc.nextDouble();

                    System.out.println("Su pago ha sido realizado con exito!");
                    System.out.println("Nombre comprador: " + nombre + " " + apellido);
                    System.out.println("Moto adquirida: " + adquirirMoto);
                    System.out.println("Monto final: $" + monto);
                    break;
                default:
                    System.out.println("Opción no valida, seleccione otra opción...");
            }
        }while (opcion<=5);

        sc.close();
    }
}
