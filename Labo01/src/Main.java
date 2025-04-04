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
    private void agregarLibro(ArrayList<Libro> libro, Scanner scanner) {
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

        try {
            System.out.print("Ingrese el nombre del libro: ");
            String nombre_libro = scanner.nextLine();

            System.out.print("Ingrese el nombre del autor: ");
            String autor = scanner.nextLine();

            System.out.print("Ingrese el año del libro: ");
            int anio = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Ingrese el genero del libro: ");
            String genero = scanner.nextLine();

            Libro nuevo_libro = new Libro(identificador, nombre_libro, autor, anio, genero, false);
            libro.add(nuevo_libro);
            System.out.println();
        } catch (InputMismatchException e){
            System.out.println("Error: Entrada inválida. Asegúrese de ingresar el tipo de dato correcto.");
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }
    }

    // Mostrar libros
    private void listaDeLibros(ArrayList<Libro> libro) {
        if(libro.isEmpty()) {
            System.out.println("\n----------------------");
            System.out.println("No hay libros convencionales");
        } else {
            System.out.println("\n----------------------");
            System.out.println("Libros Convencionales:");

            for(Libro libroConvencional : libro) {
                libroConvencional.mostrarLibro();
                System.out.println();
            }
        }
    }

    // Agregar un manga
    private void agregarManga(ArrayList<Manga> manga, Scanner scanner) {
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

        try {
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
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada inválida. Asegúrese de ingresar el tipo de dato correcto.");
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }
    }

    // Mostrar mangas
    private void listaDeMangas(ArrayList<Manga> manga) {
        if(manga.isEmpty()) {
            System.out.println("\n----------------------");
            System.out.println("No hay ningún manga");
        } else {
            System.out.println("\n----------------------");
            System.out.println("Mangas");

            for(Manga mangas: manga) {
                mangas.mostrarMangas();
                System.out.println();
            }
        }
    }

    // Agregar un nuevo periodico
    private void agregarPeriodico(ArrayList<Periodico> periodico, Scanner scanner) {
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

        try {
            System.out.print("Ingrese el titulo del periodico: ");
            String titulo = scanner.nextLine();

            System.out.print("Ingrese el nombre del autor: ");
            String autor = scanner.nextLine();

            System.out.print("Ingrese el año del periodico: ");
            int anio = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Ingrese el estilo de papel: ");
            String estilo_de_papel = scanner.nextLine();

            System.out.print("Ingrese el genero: ");
            String genero = scanner.nextLine();

            System.out.print("Número de hojas: ");
            int numero_hoja = scanner.nextInt();

            Periodico nuevo_periodico = new Periodico(identificador, titulo, autor, anio, estilo_de_papel, genero, numero_hoja);
            periodico.add(nuevo_periodico);
            System.out.println();
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada inválida. Asegúrese de ingresar el tipo de dato correcto.");
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }
    }

    // Mostrar periodicos
    private void listaDePeriodicos(ArrayList<Periodico> periodico) {
        if(periodico.isEmpty()) {
            System.out.println("\n----------------------");
            System.out.println("No hay ningún periodico");
        } else {
            System.out.println("\n----------------------");
            System.out.println("Periodicos");

            for(Periodico periodicos: periodico) {
                periodicos.mostrarPeriodico();
                System.out.println();
            }
        }
    }

    // Mostrar prestamos
    private void listaPrestamos(ArrayList<Prestamos> prestamo) {
        if(prestamo.isEmpty()) {
            System.out.println("\n----------------------");
            System.out.println("No hay ningún prestamo registrado");
        } else {
            System.out.println("\n----------------------");
            System.out.println("Prestamos");

            for(Prestamos prestamos: prestamo) {
                prestamos.mostrarPrestamos();
                System.out.println();
            }
        }
    }

    // Funcion #2 de mostrar listado de libros existentes
    private static void listadoDeLibros(Main main) {

        if(main.libro.isEmpty()) {
            System.out.println("\n----------------------");
            System.out.println("No hay libros convencionales");
        } else {
            System.out.println("\n----------------------");
            System.out.println("Libros Convencionales:");

            for(Libro libroConvencional : main.libro) {
                libroConvencional.mostrarLibro();
                System.out.println();
            }
        }

        if(main.manga.isEmpty()) {
            System.out.println("\n----------------------");
            System.out.println("No hay ningún manga");
        } else {
            System.out.println("\n----------------------");
            System.out.println("Mangas");

            for(Manga mangas: main.manga) {
                mangas.mostrarMangas();
                System.out.println();
            }
        }

        if(main.periodico.isEmpty()) {
            System.out.println("\n----------------------");
            System.out.println("No hay ningún periodico");
        } else {
            System.out.println("\n----------------------");
            System.out.println("Periodicos");

            for(Periodico periodicos: main.periodico) {
                periodicos.mostrarPeriodico();
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
            System.out.println("\n---------------------------------");
            System.out.println("1. Agregar un libro convencional");
            System.out.println("2. Agregar un manga");
            System.out.println("3. Agregar un periodico");
            System.out.println("4. Volver al menu anterior");
            System.out.print("Ingresar opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch(opcion) {
                case 1:
                    agregarLibro(libro, scanner);
                    break;
                case 2:
                    agregarManga(manga, scanner);
                    break;
                case 3:
                    agregarPeriodico(periodico, scanner);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Valor inválido, ingrese un número del 1 al 4");
                    break;
            }
        }
        while(opcion >= 1 && opcion <= 9);
    }

    // Funcionalidad de listado de libros en estado de prestamo (true).
    private void librosEnEstadoDePrestamo() {
        boolean prestamoDeLibro = false;
        System.out.println("\n---------------------------------------");
        System.out.println("Listado de libros en estado de prestamo");

        for(Libro tipoLibro: this.libro) {
            for(Prestamos tipoPrestamo: this.prestamo) {
                if(tipoLibro.isPrestado()) {
                    if(tipoPrestamo.getEdad() >= 18) {
                        tipoLibro.mostrarID();
                        tipoPrestamo.datosDePersonasEnEstadoDePrestamo();
                        System.out.println();
                        prestamoDeLibro = true;
                    } else {
                        tipoLibro.mostrarID();
                        tipoPrestamo.datosDePersonasMenorDeEdad();
                        System.out.println();
                        prestamoDeLibro = true;
                    }
                }
            }
        }

        for(Manga tipoManga: this.manga) {
            for(Prestamos tipoPrestamo: this.prestamo) {
                if(tipoManga.isPrestado()) {
                    if(tipoPrestamo.getEdad() >= 18) {
                        tipoManga.mostrarID();
                        tipoPrestamo.datosDePersonasEnEstadoDePrestamo();
                        System.out.println();
                        prestamoDeLibro = true;
                    } else {
                        tipoManga.mostrarID();
                        tipoPrestamo.datosDePersonasMenorDeEdad();
                        System.out.println();
                        prestamoDeLibro = true;
                    }
                }
            }
        }

        for(Periodico tipoPeriodico: this.periodico) {
            for(Prestamos tipoPrestamo: this.prestamo) {
                if(tipoPeriodico.isPrestado()) {
                    if(tipoPrestamo.getEdad() >= 18) {
                        tipoPeriodico.mostrarID();
                        tipoPrestamo.datosDePersonasEnEstadoDePrestamo();
                        System.out.println();
                        prestamoDeLibro = true;
                    } else {
                        tipoPrestamo.datosDePersonasMenorDeEdad();
                        System.out.println();
                        prestamoDeLibro = true;
                    }
                }
            }
        }

        if(!prestamoDeLibro) {
            System.out.println("No hay ningun tipo de libro que esté en estado de prestamo");
        }
    }

    // Funcionalidad de listado de libros en estado de disponible (false).
    private void librosEnEstadoDeDisponible() {
        boolean prestamoDeLibro = false;
        System.out.println("\n---------------------------------------");
        System.out.println("Listado de libros disponibles");

        for(Libro tipoLibro: this.libro) {
            if(!tipoLibro.isPrestado()) {
                tipoLibro.mostrarLibro();
                System.out.println();
                prestamoDeLibro = true;
            }
        }

        for(Manga tipoManga: this.manga) {
            if(!tipoManga.isPrestado()) {
                tipoManga.mostrarMangas();
                System.out.println();
                prestamoDeLibro = true;
            }
        }

        for(Periodico tipoPeriodico: this.periodico) {
            if(!tipoPeriodico.isPrestado()) {
                tipoPeriodico.mostrarPeriodico();
                System.out.println();
                prestamoDeLibro = true;
            }
        }

        if(!prestamoDeLibro) {
            System.out.println("\n---------------------------------------");
            System.out.println("No hay ningun tipo de libro que esté disponible");
        }
    }

    // Funcion #5: Prestar/devolver un libro
    private void prestarLibro(Scanner scanner) {
        System.out.print("Ingrese el identificador del libro/manga/periodico: ");
        String identificador = scanner.nextLine();

        Libro material = null;

        // Buscar en libros
        for (Libro l : libro) {
            if (l.getIdentificador().equals(identificador)) {
                material = l;
                break;
            }
        }

        // Si no esta en libro, buscar en manga
        if (material == null) {
            for (Manga m : manga) {
                if (m.getIdentificador().equals(identificador)) {
                    material = m;
                    break;
                }
            }
        }

        // Si no esta en libro ni en manga, buscar en periodico
        if (material == null) {
            for (Periodico p : periodico) {
                if (p.getIdentificador().equals(identificador)) {
                    material = p;
                    break;
                }
            }
        }

        // Si no se encontro ningun libro/manga/periodico
        if (material == null) {
            System.out.println("No se encontró ningún material con ese identificador.");
            return;
        }

        // Si el material esta disponible
        if (!material.isPrestado()) {
            // Generacion de ID
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
            String id_prestamo = "PR-" + combinacionGuardada + "-" + cadenaGenerada;

            System.out.print("Ingrese el nombre de la persona: ");
            String nombre_persona = scanner.nextLine();

            System.out.print("Ingrese la edad de la persona: ");
            int edad = scanner.nextInt();
            scanner.nextLine();

            // Aqui se evalua si la persona es menor de edad
            String dui = "";
            if (edad >= 18) {
                System.out.print("Ingrese el DUI: ");
                dui = scanner.nextLine();
            } else {
                System.out.println("Menor de edad, no es necesario ingresar DUI.");
            }

            System.out.print("Ingrese la fecha del préstamo: ");
            String fecha_prestamo = scanner.nextLine();

            System.out.print("Ingrese la fecha final del préstamo: ");
            String fecha_fin = scanner.nextLine();

            Prestamos nuevoPrestamo = new Prestamos(id_prestamo, nombre_persona, edad, dui, fecha_prestamo, fecha_fin);
            prestamo.add(nuevoPrestamo);
            //Cambiando el estado a prestado
            material.cambiarEstado();

            System.out.println("El material ahora está prestado.");
        } else {
            // Si el libro ya estaba prestado
            material.cambiarEstado();
            System.out.println("El material ahora está disponible.");
        }
    }

    // Funcionalidad 6: ver detalles de un libro y su estado
    private void verDetallesLibros() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID del libro que desea revisar sus detalles: ");
        String id = scanner.nextLine();

        boolean encontrado = false;

        for (Libro tipoLibro : this.libro) {
            if (tipoLibro.getIdentificador().equals(id)) {
                System.out.println("\nDetalles del Libro:");
                tipoLibro.mostrarLibro();
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            for (Manga tipoManga : this.manga) {
                if (tipoManga.getIdentificador().equals(id)) {
                    System.out.println("\nDetalles del Manga:");
                    tipoManga.mostrarMangas();
                    encontrado = true;
                    break;
                }
            }
        }

        if (!encontrado) {
            for (Periodico tipoPeriodico : this.periodico) {
                if (tipoPeriodico.getIdentificador().equals(id)) {
                    System.out.println("\nDetalles del Periódico:");
                    tipoPeriodico.mostrarPeriodico();
                    encontrado = true;
                    break;
                }
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún libro, manga o periódico con ese ID.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        int opcion = 0;

        do {
            System.out.println("\n---------------------------");
            System.out.println("Menu Laboratorio 01 PNC");
            System.out.println("1. Inserción de nuevos libros");
            System.out.println("2. Listado de libros existentes");
            System.out.println("3. Listado de libros en estado de préstamo");
            System.out.println("4. Listado de libros disponibles");
            System.out.println("5. Prestar/devolver un libro");
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
                    listadoDeLibros(main);
                    break;
                case 3:
                    main.librosEnEstadoDePrestamo();
                    break;
                case 4:
                    main.librosEnEstadoDeDisponible();
                    break;
                case 5:
                    main.prestarLibro(scanner);
                    break;
                case 6:
                    main.verDetallesLibros();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Valor inválido, ingrese un número del 1 al 7");
                    break;
            }
        }
        while(opcion >= 1 && opcion <= 7);
    }
}