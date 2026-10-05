//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


/*
    Ejercicio 1: Realiza un programa que dada una cantidad de euros que el usuario introduce por
    teclado (múltiplo de 5 €) mostrará los billetes de cada tipo que serán necesarios para
    alcanzar dicha cantidad (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5). Hay que
    indicar el mínimo de billetes posible. Por ejemplo, si el usuario introduce 145 el
    programa indicará que será necesario 1 billete de 100 €, 2 billetes de 20 € y 1 billete de
    5 € (no será válido por ejemplo 29 billetes de 5, que aunque sume 145 € no es el mínimo número de billetes posible)
*/

    System.out.println("Ejercicio 1");
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce una cantidad en euros (múltiplo de 5): ");
    int cantidad = sc.nextInt();


    if (cantidad % 5 != 0) {
        System.out.println("La cantidad debe ser un múltiplo de 5.");
        return;
    }


    int[] billetes = {500, 200, 100, 50, 20, 10, 5};


    System.out.println("\nDesglose mínimo de billetes para " + cantidad + " €:");

    for (int billete : billetes) {
        int numBilletes = cantidad / billete;
        if (numBilletes > 0) {
            System.out.println(numBilletes + " billete(s) de " + billete + " €");
            cantidad = cantidad % billete;
        }
    }
/*
    Ejercicio 2: Realiza un programa que muestre un menú de opciones como el siguiente:
    1. Sumar
    2. Restar
    3. Multiplicar
    4. Dividir (incluir manejo de división por 0)
    5. Salir
    El menú debe de repetirse hasta que se escoja la opción 5 (Salir).
*/

    System.out.println("Ejercicio 2");
    sc = new Scanner(System.in);
    int opcion;
    double num1, num2, resultado;

    do {
        // Mostrar menú
        System.out.println("\n MENÚ DE OPCIONES");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print("Elige una opción: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Introduce el primer número: ");
                num1 = sc.nextDouble();
                System.out.print("Introduce el segundo número: ");
                num2 = sc.nextDouble();
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;

            case 2:
                System.out.print("Introduce el primer número: ");
                num1 = sc.nextDouble();
                System.out.print("Introduce el segundo número: ");
                num2 = sc.nextDouble();
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;

            case 3:
                System.out.print("Introduce el primer número: ");
                num1 = sc.nextDouble();
                System.out.print("Introduce el segundo número: ");
                num2 = sc.nextDouble();
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;

            case 4:
                System.out.print("Introduce el dividendo: ");
                num1 = sc.nextDouble();
                System.out.print("Introduce el divisor: ");
                num2 = sc.nextDouble();
                if (num2 == 0) {
                    System.out.println("Error: No se puede dividir entre 0.");
                } else {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                }
                break;

            case 5:
                System.out.println("Saliendo del programa...");
                break;

            default:
                System.out.println("Opción no válida. Inténtalo de nuevo.");
        }
    } while (opcion != 5);


}
