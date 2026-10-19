//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    IO.println("Ejercicio 1");
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce una cadena de texto" );
    String texto = sc.nextLine();

    String[] palabras = texto.split("\\s+");


    System.out.println("\nLas palabras son:");
    for (String palabra : palabras) {
        System.out.println(palabra);
    }


    IO.println("\nEjercicio 2");
    sc = new Scanner(System.in);

    // Pedir las dos cadenas
    System.out.print("Introduce la primera cadena: ");
    String cadena1 = sc.nextLine();

    System.out.print("Introduce la segunda cadena: ");
    String cadena2 = sc.nextLine();

    // Comparar exactamente
    if (cadena1.equals(cadena2)) {
        System.out.println("Las cadenas son iguales.");
    } else {
        System.out.println("Las cadenas son diferentes.");
    }

    // Comparar ignorando mayúsculas y minúsculas
    if (cadena1.equalsIgnoreCase(cadena2)) {
        System.out.println("Las cadenas son iguales (sin distinguir mayúsculas/minúsculas).");
    } else {
        System.out.println("Las cadenas son diferentes (aunque no se distinga mayúsculas/minúsculas).");
    }

    IO.println("\nEjercicio 3");
    sc = new Scanner(System.in);

    // Pedir nombre y apellidos
    System.out.print("Introduce tu nombre: ");
    String nombre = sc.nextLine();

    System.out.print("Introduce tu primer apellido: ");
    String apellido1 = sc.nextLine();

    System.out.print("Introduce tu segundo apellido: ");
    String apellido2 = sc.nextLine();



    // Tomar las tres primeras letras de cada uno (si tiene menos, usa lo que haya)
    String codigo = (nombre.length() >= 3 ? nombre.substring(0, 3) : nombre)
            + (apellido1.length() >= 3 ? apellido1.substring(0, 3) : apellido1)
            + (apellido2.length() >= 3 ? apellido2.substring(0, 3) : apellido2);

    // Convertir a mayúsculas
    codigo = codigo.toUpperCase();

    // Mostrar el resultado
    System.out.println("Tu código de usuario es: " + codigo);


    IO.println("\nEjercicio 4");
    sc = new Scanner(System.in);

    System.out.print("Introduce una frase: ");
    String frase = sc.nextLine().toLowerCase();

    int a = 0, e = 0, i = 0, o = 0, u = 0;

    // Recorremos la frase carácter por carácter
    for (int j = 0; j < frase.length(); j++) {
        char c = frase.charAt(j);
        switch (c) {
            case 'a':
                a++;
                break;
            case 'e':
                e++;
                break;
            case 'i':
                i++;
                break;
            case 'o':
                o++;
                break;
            case 'u':
                u++;
                break;
        }
    }

    // Mostramos los resultados
    System.out.println("Nº de A's: " + a);
    System.out.println("Nº de E's: " + e);
    System.out.println("Nº de I's: " + i);
    System.out.println("Nº de O's: " + o);
    System.out.println("Nº de U's: " + u);
}













