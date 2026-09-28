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
    if (edad >=18) {
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
    if (Edad >=18) {
        System.out.println("Eres mayor de edad");
    } else if ( Edad <=17 && Edad >= 0) {
        System.out.println("Eres menor de edad");
    }
    else{
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
    for (int i = 0; i <= 200; i +=2) {
        System.out.println("Numero:" + i);
    }

/*
 Ejercicio 5: Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200.
Esta vez utiliza un contador sumando de 1 en 1.
 */



}
