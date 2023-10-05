import java.util.ArrayList;

class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    // Constructor para inicializar los atributos del libro.
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // Método getter para obtener el título del libro.
    public String getTitulo() {
        return titulo;
    }

    // Método setter para establecer el título del libro.
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Método getter para obtener el autor del libro.
    public String getAutor() {
        return autor;
    }

    // Método setter para establecer el autor del libro.
    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Método getter para obtener el número de páginas del libro.
    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    // Método setter para establecer el número de páginas del libro.
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}

class Biblioteca {
    private ArrayList<Libro> librosDisponibles = new ArrayList<>();

    // Método para registrar un libro en la biblioteca.
    public void registrarLibro(Libro libro) {
        librosDisponibles.add(libro);
    }

    // Método para buscar un libro por título.
    // Parámetros:
    // - titulo: El título del libro que se desea buscar.
    // Devuelve el libro si se encuentra, o null si no se encuentra.
    public Libro buscarLibro(String titulo) {
        for (Libro libro : librosDisponibles) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null; // Si no se encuentra el libro, devuelve null.
    }

    // Método para mostrar los libros disponibles en la biblioteca.
    public void mostrarLibrosDisponibles() {
        System.out.println("Libros disponibles en la biblioteca:");
        for (Libro libro : librosDisponibles) {
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Número de páginas: " + libro.getNumeroPaginas());
            System.out.println("-----------------------------");
        }
    }
}
