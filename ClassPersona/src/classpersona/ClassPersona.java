/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classpersona;

/**
 *
 * @author Tecnico1
 */
public class ClassPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Cpersona[] p= new Cpersona[3];
      p[0]=new Cpersona(20,"Ana", 'F');
      p[1]=new Cpersona(22,"Juan", 'M');
      p[2]=new Cpersona(25,"Sofia", 'F');
      
      for(int i=0; i<p.length; i++)
      {
          System.out.println(p[i].getNombre()+" "+
                             p[i].getGenero()+" "+
                             p[i].getEdad());
          p[i].CategoriaEdad();
      }
    }
    
}
