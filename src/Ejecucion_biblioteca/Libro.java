package Ejecucion_biblioteca;

//clase
public class Libro {
    private String titulo;
    private String autor;
   private int numeroPaginas;
   private int publicacion;

   //se crea el constructor
    public Libro(String titulo, String autor, int numeroPaginas, int publicacion){

        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.publicacion = publicacion;
    }

    //se crea el metodo getter
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public int getPublicacion() {
        return publicacion;
    }

    // se crea el metodo setter

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setPublicacion(int publicacion) {
        this.publicacion = publicacion;
    }
    //Metodo para mostrar la informacion del libro
    public void mostrarDatosLibros(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de paginas: " + numeroPaginas);
        System.out.println("Publicacion: " + publicacion);

    }
}
