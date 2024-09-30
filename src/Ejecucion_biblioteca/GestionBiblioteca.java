package Ejecucion_biblioteca;

public class GestionBiblioteca {
    public static void main(String[] args){

        // se crean los libros

        Libro libro1 = new Libro("Muchas vidas muchos sabios","Brian L Weiss", 176, 1995);
        Libro libro2 = new Libro("Romper el Circulo","Colleen Hoover", 400, 2021);
        Libro libro3 = new Libro("Aviadora","Virginia Llera", 496, 2024);

        System.out.println(" Informacion de los libros ");
        System.out.println("-------------------------------------------------- ");
        System.out.println("LIBRO 1 ");
        libro1.mostrarDatosLibros();
        System.out.println("                                                   ");
        System.out.println("-------------------------------------------------- ");


        libro1.setTitulo("Muchas vidas muchos sabios");
        libro1.setAutor("Brian L Weiss");
        libro1.setNumeroPaginas(181);
        libro1.setPublicacion(1999);
        System.out.println("                                                   ");
        System.out.println("-------------------------------------------------- ");
        System.out.println("ACTUALIZACION DE INFORMACION DEL LIBRO 1");
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Numero de paginas: " + libro1.getNumeroPaginas());
        System.out.println("Año de publicacion: " + libro1.getPublicacion());
        System.out.println("                                                   ");
        System.out.println("-------------------------------------------------- ");
        System.out.println("                                                   ");
        System.out.println("LIBRO 2 ");
        System.out.println("                                                   ");
        libro2.mostrarDatosLibros();
        System.out.println("                                                   ");
        System.out.println("                                                   ");
        System.out.println("-------------------------------------------------- ");
        System.out.println("LIBRO 3 ");
        System.out.println("                                                   ");
        libro3.mostrarDatosLibros();
        System.out.println("                                                   ");
        System.out.println("-------------------------------------------------- ");


    }
}
