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


    /*
     Ejercicio 5. Crea un programa que pida veinte números reales por teclado, los almacene en un array
                  y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores.
 */

    System.out.println("\nEjercicio 5");
    sc = new Scanner(System.in);
    double[] nume = new double[20];
    double sum = 0;

    // Pedimos los 20 números reales
    for (int i = 0; i < numeros.length; i++) {
        System.out.print("Introduce el número real " + (i + 1) + ": ");
        numeros[i] = sc.nextDouble();
        suma += numeros[i];
    }

    // Calculamos la media
    double media = suma / numeros.length;

    // Mostramos el resultado
    System.out.println("\nLa media de los valores introducidos es: " + media);


   /*
     Ejercicio 6. Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño
                  N, escriba M en todas sus posiciones y lo muestre por pantalla.
 */


    System.out.println("\nEjercicio 6");
    sc = new Scanner(System.in);

    // Pedimos los valores N y M
    System.out.print("Introduce el tamaño del array (N): ");
    int N = sc.nextInt();

    System.out.print("Introduce el valor que se almacenará en todas las posiciones (M): ");
    int M = sc.nextInt();

    // Creamos el array de tamaño N
    int[] array = new int[N];

    // Asignamos M a todas las posiciones
    Arrays.fill(array, M);

    // Mostramos el contenido del array
    System.out.println("\nContenido del array:");
    for (int i = 0; i < array.length; i++) {
        System.out.println("Posición " + i + ": " + array[i]);
    }


 /*
     Ejercicio 7. Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño
                  N, escriba M en todas sus posiciones y lo muestre por pantalla.
 */

    System.out.println("\nEjercicio 7");
    sc = new Scanner(System.in);

    System.out.print("Introduce el valor inicial (P): ");
    int P = sc.nextInt();

    System.out.print("Introduce el valor final (Q): ");
    int Q = sc.nextInt();

    // Validamos que P sea menor o igual que Q
    if (P > Q) {
        System.out.println("Error: P debe ser menor o igual que Q.");
    } else {
        int tamaño = Q - P + 1; // Cantidad de números entre P y Q (incluidos)
        int[] numeross = new int[tamaño];

        // Llenamos el array con los valores desde P hasta Q
        for (int i = 0; i < tamaño; i++) {
            numeros[i] = P + i;
        }

        // Mostramos los valores del array
        System.out.println("\nValores desde " + P + " hasta " + Q + ":");
        for (int num : numeross) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


 /*
     Ejercicio 8. Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
                  utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
                  cuántos valores del array son igual o superiores a R
 */

    System.out.println("\nEjercicio 8");

    double[] num = new double[100]; // Array con 100 números reales

    // Llenar el array con números aleatorios entre 0.0 y 1.0
    for (int i = 0; i < numeros.length; i++) {
        numeros[i] = Math.random();
    }

    // Pedir al usuario un valor real R
    sc = new Scanner(System.in);
    System.out.print("Introduce un valor real R (entre 0.0 y 1.0): ");
    double R = sc.nextDouble();

    // Contar cuántos valores son mayores o iguales a R
    int contador = 0;
    for (double nn : num) {
        if (nn >= R) {
            contador++;
        }
    }

    // Mostrar el resultado
    System.out.println("Hay " + contador + " valores mayores o iguales a " + R + ".");


 /*
     Ejercicio 9. Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores
                  enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N
                  y mostrará en qué posiciones del array aparece N
 */


    int[] nu = new int[100]; // Array de tamaño 100

    // Rellenar el array con valores enteros aleatorios entre 1 y 10
            for (int i = 0; i < nu.length; i++) {
    nu[i] = (int) (1 + Math.random() * 10);
            }

    // Pedir al usuario un valor N
    sc = new Scanner(System.in);
            System.out.print("Introduce un número entero N (entre 1 y 10): ");
    N = sc.nextInt();

    // Mostrar en qué posiciones aparece N
            System.out.println("El número " + N + " aparece en las siguientes posiciones:");

    boolean encontrado = false;
            for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == N) {
            System.out.println("Posición: " + i);
    encontrado = true;
            }
            }

            // Si no se encuentra el número
            if (!encontrado) {
            System.out.println("El número " + N + " no aparece en el array.");
            }
}






















