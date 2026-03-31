public class Post {
    private String titulo;
    private String mensaje;

    //Creamos el constructor con parametros

    public Post(String titulo, String mensaje) {
        this.titulo = titulo;
        this.mensaje = mensaje;
    }

    //Crear los getter and setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    //Creamos el toString

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", mensaje: " + mensaje + '\n' ;
    }

}
