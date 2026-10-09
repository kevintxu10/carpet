//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


    /*
     Ejercicio 1. Crea un programa que pida diez números reales por teclado, los almacene en un array,
                  y luego muestre todos sus valores.
 */

    System.out.println("\nEjercicio 1");

    Scanner sc = new Scanner(System.in);

    double[] numeros = new double[10]; // Array para guardar los 10 números

    // Pedir los números al usuario
    System.out.println("Introduce 10 números reales:");
    for (int i = 0; i < numeros.length; i++) {
        System.out.print("Número " + (i + 1) + ": ");
        numeros[i] = sc.nextDouble();
    }

    // Mostrar los números introducidos
    System.out.println("\nLos números introducidos son:");
    for (int i = 0; i < numeros.length; i++) {
        System.out.println("Número " + (i + 1) + ": " + numeros[i]);
    }
    /*
     Ejercicio 2. Crea un programa que pida diez números reales por teclado, los almacene en un array,
                  y luego muestre la suma de todos los valores.
 */

    System.out.println("\nEjercicio 2");

    sc = new Scanner(System.in);
    double suma = 0;

    double[] n = new double[10]; // Array para guardar los 10 números

    // Pedir los números al usuario
    System.out.println("Introduce 10 números reales:");
    for (int i = 0; i < numeros.length; i++) {
        System.out.print("Número " + (i + 1) + ": ");
        numeros[i] = sc.nextDouble();
    }

    // Calcular la suma
    for (double num : numeros) {
        suma += num;
    }

    // Mostrar el resultado
    System.out.println("\nLa suma de todos los números es: " + suma);

    /*
    Ejercicio 3. Crea un programa que pida diez números reales por teclado, los almacene en un array,
                 y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.
 */

    System.out.println("\nEjercicio 3");
    sc = new Scanner(System.in);
    double[] numero = new double[10];

    for(int i = 0; i < numeros.length; i++) {
        System.out.print("Introduce el numero" + (i + 1) + ":");
        numeros[i] = sc.nextDouble();
    }

    double maximo = Double.MIN_VALUE;
    double minimo = Double.MAX_VALUE;

    for(int i = 1; i < numeros.length; i++){
        maximo = Math.max(numeros[i], maximo);
        minimo = Math.min(numeros[i], minimo);
        // Se puede hacer de las dos formas
        if (numeros[1] > maximo) {
            maximo = numeros[i];
        }
        if (numeros[i] < minimo) {
            minimo = numeros[i];
        }
    }

    System.out.println("El numero maximo es:" + maximo);
    System.out.println("El numero minimo es:" + minimo);


    /*
     Ejercicio 4. Crea un programa que pida veinte números enteros por teclado, los almacene en un
                  array y luego muestre por separado la suma de todos los valores positivos y negativos
 */

    System.out.println("\nEjercicio 4");
    sc = new Scanner(System.in);
    int[] numer = new int[20];
    int sumaPositivos = 0;
    int sumaNegativos = 0;

    // Pedimos los 20 números
    for (int i = 0; i < numeros.length; i++) {
        System.out.print("Introduce el número entero " + (i + 1) + ": ");
        numeros[i] = sc.nextInt();

        // Sumamos según el signo
        if (numeros[i] > 0) {
            sumaPositivos += numeros[i];
        } else if (numeros[i] < 0) {
            sumaNegativos += numeros[i];
        }
    }

    // Mostramos resultados
    System.out.println("\nSuma de valores positivos: " + sumaPositivos);
    System.out.println("Suma de valores negativos: " + sumaNegativos);

}




