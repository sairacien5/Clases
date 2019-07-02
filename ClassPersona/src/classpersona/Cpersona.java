package classpersona;
/* @author Saira Ma. Urbina Cienfuegos */
public class Cpersona {

    private int Edad;
    private String Nombre;
    private char Genero;

    public Cpersona(int Edad, String Nombre, char Genero) {
        this.Edad = Edad;
        this.Nombre = Nombre;
        this.Genero = Genero;
    }
    
    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public char getGenero() {
        return Genero;
    }

    public void setGenero(char Genero) {
        this.Genero = Genero;
    }
   
    public void CategoriaEdad()
    {
        if(getEdad()>18)
            System.out.println("Persona mayor de edad");
        else
            System.out.println("Persona menor de edad");
    }
}
    
    

