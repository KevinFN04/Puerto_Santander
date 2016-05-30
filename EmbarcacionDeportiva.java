
/**
 * Write a description of class EmbarcacionDeportiva here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmbarcacionDeportiva extends Barco
{
    private int potencia;

    /**
     * Constructor for objects of class EmbarcacionDeportiva
     */
    public EmbarcacionDeportiva(int potencia, String matricula, float eslora, int anoFab)
    {
        super(matricula,eslora,anoFab);
        this.potencia = potencia;
    }

    /**
     * Devuelve el coeficiente de bernua del barco 
     */
    public int getCoeficienteBernua(){
       return potencia; 
    }
    
    /**
     * Imprime los datos por pantalla del VELERO
     */
     public String toString()
    {
        String data = super.toString();
        data += "Potencia: " + potencia + "\n";
        return data;
    }
}
