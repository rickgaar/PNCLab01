import classes.Libro;
import classes.Manga;
import classes.Periodico;
import classes.Prestamos;

import java.util.*;

public class Main {

    private ArrayList<Libro> libro = new ArrayList<>();
    private ArrayList<Manga> manga = new ArrayList<>();
    private ArrayList<Periodico> periodico = new ArrayList<>();
    private ArrayList<Prestamos> prestamo = new ArrayList<>();

    // Función para generar carácteres
    public static String generarCadenaUnica(int longitud) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random rand = new Random();
        Set<Character> caracteresUnicos = new HashSet<>();
        StringBuilder cadena = new StringBuilder();

        while (cadena.length() < longitud) {
            char caracter = caracteres.charAt(rand.nextInt(caracteres.length()));
            if (!caracteresUnicos.contains(caracter)) {
                caracteresUnicos.add(caracter);
                cadena.append(caracter);
            }
        }
        return cadena.toString();
    }

    // Agregar un nuevo libro
    private void agregar_libro_convencional(ArrayList<Libro> libro, Scanner scanner) {

        Random random = new Random();

        String cadenaGenerada = generarCadenaUnica(2);

        List<Integer> digitos = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            digitos.add(i);
        }

        Collections.shuffle(digitos, random);

        String combinacion = "";

        for (int i = 0; i < 4; i++) {
            combinacion += digitos.get(i);
        }

        String combinacionGuardada = combinacion;

        String identificador = "LC-" + combinacionGuardada + "-" + cadenaGenerada;

        System.out.print("Ingrese el nombre del libro: ");
        String nombre_libro = scanner.nextLine();

        System.out.print("Ingrese el nombre del autor: ");
        String autor = scanner.nextLine();

        System.out.print("Ingrese el año del libro: ");
        int anio = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Ingrese el genero del libro: ");

        String genero = scanner.nextLine();

        Libro nuevo_libro = new Libro(identificador, nombre_libro, autor, anio, genero);
        libro.add(nuevo_libro);
        System.out.println();
    }

    // Mostrar libros
    private void lista_libros_convencionales(ArrayList<Libro> libro) {
        if(libro.isEmpty()) {
            System.out.println("No hay libros convencionales");
        } else {
            System.out.println("Libros Convencionales:");

            for(Libro libroConvencional : libro) {
                libroConvencional.mostrar_libro_convencional();
                System.out.println();
            }
        }
    }

    // Agregar un manga
    private void agregar_manga(ArrayList<Manga> manga, Scanner scanner) {

        Random random = new Random();

        String cadenaGenerada = generarCadenaUnica(2);

        List<Integer> digitos = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            digitos.add(i);
        }

        Collections.shuffle(digitos, random);

        String combinacion = "";

        for (int i = 0; i < 4; i++) {
            combinacion += digitos.get(i);
        }

        String combinacionGuardada = combinacion;

        String identificador = "MG-" + combinacionGuardada + "-" + cadenaGenerada;

        System.out.print("Ingrese el nombre del manga: ");
        String nombre_manga = scanner.nextLine();

        System.out.print("Ingrese el nombre del autor: ");
        String autor = scanner.nextLine();

        System.out.print("Ingrese el año del manga: ");
        int anio = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Ingrese el estilo de dibujo: ");
        String estilo_de_dibujo = scanner.nextLine();

        System.out.print("Ingrese el genero: ");
        String genero = scanner.nextLine();

        System.out.print("Ambientado en: ");
        String ambientado = scanner.nextLine();

        Manga nuevo_manga = new Manga(identificador, nombre_manga, autor, anio, estilo_de_dibujo, genero, ambientado);
        manga.add(nuevo_manga);
        System.out.println();
    }

    // Mostrar mangas
    private void lista_mangas(ArrayList<Manga> manga) {
        if(manga.isEmpty()) {
            System.out.println("No hay ningún manga");
        } else {
            System.out.println("Mangas");

            for(Manga mangas: manga) {
                mangas.mostrar_mangas();
                System.out.println();
            }
        }
    }

    // Agregar un nuevo periodico
    private void agregar_periodico(ArrayList<Periodico> periodico, Scanner scanner) {
        Random random = new Random();

        String cadenaGenerada = generarCadenaUnica(2);

        List<Integer> digitos = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            digitos.add(i);
        }

        Collections.shuffle(digitos, random);

        String combinacion = "";

        for (int i = 0; i < 4; i++) {
            combinacion += digitos.get(i);
        }

        String combinacionGuardada = combinacion;

        String identificador = "PR-" + combinacionGuardada + "-" + cadenaGenerada;

        System.out.print("Ingrese el titulo del periodico: ");
        String titulo = scanner.nextLine();

        System.out.print("Ingrese el nombre del autor: ");
        String autor = scanner.nextLine();

        System.out.print("Ingrese el año del manga: ");
        int anio = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Ingrese el estilo del papel: ");
        String estilo_de_papel = scanner.nextLine();

        System.out.print("Ingrese el genero: ");
        String genero = scanner.nextLine();

        System.out.print("Número de hojas: ");
        int numero_hoja = scanner.nextInt();

        Periodico nuevo_periodico = new Periodico(identificador, titulo, autor, anio, estilo_de_papel, genero, numero_hoja);
        periodico.add(nuevo_periodico);
        System.out.println();
    }

    // Mostrar periodicos
    private void lista_periodicos(ArrayList<Periodico> periodico) {
        if(periodico.isEmpty()) {
            System.out.println("No hay ningún periodico");
        } else {
            System.out.println("Periodicos");

            for(Periodico periodicos: periodico) {
                periodicos.mostrar_periodico();
                System.out.println();
            }
        }
    }

    // Agregar un prestamo
    private void agregar_prestamos(ArrayList<Prestamos> prestamo, Scanner scanner) {
        Random random = new Random();

        String cadenaGenerada = generarCadenaUnica(2);

        List<Integer> digitos = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            digitos.add(i);
        }

        Collections.shuffle(digitos, random);

        String combinacion = "";

        for (int i = 0; i < 4; i++) {
            combinacion += digitos.get(i);
        }

        String combinacionGuardada = combinacion;

        String identificador = "PR-" + combinacionGuardada + "-" + cadenaGenerada;

        System.out.print("Ingrese el nombre de la persona: ");
        String nombre_persona = scanner.nextLine();

        System.out.print("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();

        System.out.print("Dui: ");
        String dui = scanner.nextLine();

        scanner.nextLine();

        System.out.print("Fecha de prestamo: ");
        String fecha_prestamo = scanner.nextLine();

        System.out.print("Fecha final del prestamo: ");
        String fecha_fin_prestamo = scanner.nextLine();

        Prestamos nuevo_prestamo = new Prestamos(identificador, nombre_persona, edad, dui, fecha_prestamo, fecha_fin_prestamo);
        prestamo.add(nuevo_prestamo);
        System.out.println();

    }

    // Mostrar prestamos
    private void lista_prestamos(ArrayList<Prestamos> prestamo) {
        if(prestamo.isEmpty()) {
            System.out.println("No hay ningún prestamo registrado");
        } else {
            System.out.println("Prestamos");

            for(Prestamos prestamos: prestamo) {
                prestamos.mostrar_prestamos();
                System.out.println();
            }
        }
    }

    // Funcion #2 de mostrar listado de libros existentes
    private static void listado_libros(Main main) {

        if(main.libro.isEmpty()) {
            System.out.println("No hay libros convencionales");
        } else {
            System.out.println("Libros Convencionales:");

            for(Libro libroConvencional : main.libro) {
                libroConvencional.mostrar_libro_convencional();
                System.out.println();
            }
        }

        if(main.manga.isEmpty()) {
            System.out.println("No hay ningún manga");
        } else {
            System.out.println("Mangas");

            for(Manga mangas: main.manga) {
                mangas.mostrar_mangas();
                System.out.println();
            }
        }

        if(main.periodico.isEmpty()) {
            System.out.println("No hay ningún periodico");
        } else {
            System.out.println("Periodicos");

            for(Periodico periodicos: main.periodico) {
                periodicos.mostrar_periodico();
                System.out.println();
            }
        }

        if(main.prestamo.isEmpty()) {
            System.out.println("No hay ningún prestamo registrado");
        } else {
            System.out.println("Prestamos");

            for(Prestamos prestamos: main.prestamo) {
                prestamos.mostrar_prestamos();
                System.out.println();
            }
        }

    }

    // Sub-Menú
    private void menu() {

        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        int opcion = 0;

        do {
            System.out.println("1. Agregar un libro convencional");
            System.out.println("2. Mostrar libros convencionales ");
            System.out.println("3. Agregar un manga");
            System.out.println("4. Mostrar mangas");
            System.out.println("5. Agregar un periodico");
            System.out.println("6. Mostrar periodicos");
            System.out.println("7. Agregar un prestamo");
            System.out.println("8. Mostrar prestamos");
            System.out.println("9. Volver al menu anterior");
            System.out.print("Ingresar opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch(opcion) {
                case 1:
                    agregar_libro_convencional(libro, scanner);
                    break;
                case 2:
                    lista_libros_convencionales(libro);
                    break;
                case 3:
                    agregar_manga(manga, scanner);
                    break;
                case 4:
                    lista_mangas(manga);
                    break;
                case 5:
                    agregar_periodico(periodico, scanner);
                    break;
                case 6:
                    lista_periodicos(periodico);
                    break;
                case 7:
                    agregar_prestamos(prestamo, scanner);
                    break;
                case 8:
                    lista_prestamos(prestamo);
                    break;
                case 9:
                    return;
                default:
                    System.out.println("Valor inválido o ingrese un número del 1 al 7");
                    break;
            }
        }
        while(opcion >= 1 && opcion <= 9);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        int opcion = 0;

        do {
            System.out.println("Menu Laboratorio 01 PNC");
            System.out.println("1. Inserción de nuevos libros");
            System.out.println("2. Listado de libros existentes");
            System.out.println("3. Listado de libros en estado de préstamo");
            System.out.println("4. Listado de libros disponibles");
            System.out.println("5. Prestar un libro");
            System.out.println("6. Ver detalles de un libro");
            System.out.println("7. Terminar sistema");
            System.out.print("Ingresar opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch(opcion) {
                case 1:
                    main.menu();
                    break;
                case 2:
                    listado_libros(main);
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    return;
                default:
                    System.out.println("Valor inválido o ingrese un número del 1 al 7");
                    break;
            }
        }
        while(opcion >= 1 && opcion <= 7);
    }
}