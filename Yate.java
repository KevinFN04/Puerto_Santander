/**
 * Write a description of class Yate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yate extends EmbarcacionDeportiva
{
    // instance variables - replace the example below with your own
    private int camarotes;

    /**
     * Constructor for objects of class Yate
     */
    public Yate(int camarotes,int potencia,String matricula,float eslora,int anoFab)
    {
      super(potencia,matricula,eslora,anoFab);
      this.camarotes = camarotes;
    }

    /**
     * Devuelve el coeficiente de bernua del Yate 
     */
    public int getCoeficienteBernua(){
        return super.getCoeficienteBernua() + camarotes; 
    }
    
    /**
     * Devuelve los datos del Yate
     */
    public String toString(){
        String data = super.toString();
        data += "Camarotes: " + camarotes + "\n";
        return data;
    }
}