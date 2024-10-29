
package Sesion53SolorzanoED_pila2;

public class Libro { //inicia clase
    //Atributos libro
    private String autor;
    private String titulos;
    private int anio;
    private String editorial;
    
    //Constructor vacio
    public Libro() {
        this.autor="";
        this.titulos="";
        this.anio=0;
        this.editorial="";
    }
    
    //Constructor pasa paramentros
    public Libro(String autor, String titulos, int anio, String editorial) {
        this.autor = autor;
        this.titulos = titulos;
        this.anio = anio;
        this.editorial = editorial;
    }//Termina constructor que pasa parametros
    
    //Getter & Setter

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    
    
    
    
    
    
    
} //Termina clase
