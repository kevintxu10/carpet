//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
   /*
 Ejercicio 1: Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “Eres
mayor de edad” solo si lo somos.
 */
    System.out.println("\n Ejercicio 1");
    Scanner entrada = new Scanner(System.in);

    System.out.println("Ingrese su edad");
    int edad;

    edad = entrada.nextInt();
    if (edad >= 18) {
        System.out.println("Eres mayor de edad");
    }

  /*
 Ejercicio 2: Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “eres
mayor de edad” o el mensaje de “eres menor de edad”
 */
    System.out.println("\n Ejercicio 2");
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese su edad");
    int Edad;

    Edad = sc.nextInt();
    if (Edad >= 18) {
        System.out.println("Eres mayor de edad");
    } else if (Edad <= 17 && Edad >= 0) {
        System.out.println("Eres menor de edad");
    } else {
        System.out.println("La edad no tiene sentido");
    }

 /*
 Ejercicio 3: Realiza un programa que muestre por pantalla los 20 primeros números naturales (1, 2,
3... 20).
 */
    System.out.println("\n Ejercicio 3");
    sc = new Scanner(System.in);

    for (int i = 1; i <= 20; i++) {
        System.out.println("Numero:" + i);
    }
/*
 Ejercicio 4: Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200.
Para ello utiliza un contador y suma de 2 en 2.
 */

    System.out.println("\n Ejercicio 4");
    sc = new Scanner(System.in);
    for (int i = 0; i <= 200; i += 2) {
        System.out.println("Numero:" + i);
    }

/*
 Ejercicio 5: Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200.
Esta vez utiliza un contador sumando de 1 en 1.
 */

    System.out.println("\n Ejercicio 5");
    sc = new Scanner(System.in);
    for (int i = 2; i <= 200; i++)
        if (1 % 2 == 0) {
            System.out.println("Numero:" + i);
        }

/*
 Ejercicio 6: Realiza un programa que muestre los números desde el 1 hasta un número N que se
introducirá por teclado
 */

    System.out.println("\n Ejercicio 6");
    sc = new Scanner(System.in);
    int max;
    System.out.println("Introduzca el numero");
    max = sc.nextInt();
    for (int i = 1; i <= max; i++) {
        System.out.println("Numero:" + i);
    }

/*
 Ejercicio 7: Escribe un programa que lea una calificación numérica entre 0 y 10 y la transforma en
calificación alfabética, escribiendo el resultado.

• de 0 a <3 Muy Deficiente.
• de 3 a <5 Insuficiente.
• de 5 a <6 Bien.
• de 6 a <9 Notable
• de 9 a 10 Sobresaliente
 */

    System.out.println("\n Ejercicio 7");
    sc = new Scanner(System.in);
    int nota;

    System.out.println("Introduzca tu calificacion entre el 0 y el 10");
    nota = sc.nextInt();
    if (nota <= 3) {
        System.out.println("Muy deficiente");
    } else if (nota < 5) {
        System.out.println("Insuficiente");
    } else if (nota <= 6) {
        System.out.println("Bien");
    } else if (nota < 9) {
        System.out.println("Notable");
    } else if (nota <= 10) {
        System.out.println("Sobredaliente");
    }

/*
 Ejercicio 8: Realiza un programa que lea un número positivo N y calcule y visualice su factorial N!
Siendo el factorial:

• 0! = 1
• 1! = 1
• 2! = 2 * 1
• 3! = 3 * 2* 1
• N! = N * (N-1) * (N-2)........* 3*2*1
 */

    System.out.println("\n Ejercicio 8");
    sc = new Scanner(System.in);

    System.out.println("Introduce un numero entero positivo");
    int N = sc.nextInt();

    if (N < 0) {
        System.out.println("Error: Porfavor introduzca un numero adecuado");
    } else {
        int factorial = 1;
        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de:" + N + " es: " + factorial);

    }

/*
 Ejercicio 9: Escribe un programa que recibe como datos de entrada una hora expresada en horas,
minutos y segundos que nos calcula y escribe la hora, minutos y segundos que serán,
transcurrido un segundo
 */

    System.out.println("\n Ejercicio 9");
    sc = new Scanner(System.in);
    System.out.print("Introduce las horas: ");
    int horas = sc.nextInt();
    System.out.print("Introduce los minutos: ");
    int minutos = sc.nextInt();
    System.out.print("Introduce los segundos: ");
    int segundos = sc.nextInt();


    segundos++;

    if (segundos == 60) {
        segundos = 0;
        minutos++;
    }

    if (minutos == 60) {
        minutos = 0;
        horas++;
    }

    if (horas == 24) {
        horas = 0;
    }

    System.out.printf("Dentro de un segundo serán:" + horas + ":" + minutos + ":" + segundos);

/*
 Ejercicio 10:  Realiza un programa que lea 10 números no nulos y luego muestre un mensaje de si ha
leído algún número negativo o no.
 */
    System.out.println("\n Ejercicio 10");




}
