
/**
 * Write a description of class persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class persona
{
    /**
     *  Las propiedades
     */
    
   private String nombres;
   private String apellidos;
   private int edad;
   
    /**
     * El Constructor
     */
    
    public persona()
    {
    }
    
    /**
     * Setters 
     */
    
    public void setNombre(String name)
    {
      this.nombres = name;
    }
    public void setApellidos(String last)
    {
     this.apellidos = last;
    }
    public void setEdad(int age)
    {
     this.edad = age;
    }
    
    /**
     * Getters
     */
    
    public String getNombre()
    {
        return(this.nombres);
    }
    public String getApellidos()
    {
        return(this.apellidos);
    }
    public int getEdad()
    {
        return(this.edad);
    }
}
