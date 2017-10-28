
/**
 * Write a description of class program here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class program
{
    public static void main(String[] args)
    {
        persona humano = new persona();
        humano.setNombre("Daniel");
        humano.setApellidos("Araya");
        humano.setEdad(45);
        
        System.out.println("mi nombre es :"+humano.getNombre());
        System.out.println("mi apellido es :"+humano.getApellidos());
        System.out.println("mi edad es :"+humano.getEdad());
        
    }
}
