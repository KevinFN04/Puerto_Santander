
/**
 * Write a description of class Alquiler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alquiler
{    
    private int numeroDias;
    private Cliente cliente;
    private Barco barco;
    private static int VALOR_FIJO_ALQUILER = 300;
    private static int MULTIPLICADOR_ESLORA = 10;
    private int amarre;

    /**
     * Constructor for objects of class Alquiler
     */
    public Alquiler(int dias, Cliente cliente, Barco barco, int amarre)
    {
        numeroDias = dias;
        this.cliente = cliente;
        this.barco = barco;
        this.amarre = amarre;
    }

    /**
     * Devuelve el precio del alquiler. [numeroDias * (barco.getEslora() * MULTIPLICADOR_ESLORA) + (VALOR_FIJO_ALQUILER * barco.getCoeficienteBernua())]
     */
    public float getCosteAlquiler()
    {
        return numeroDias * (barco.getEslora() * MULTIPLICADOR_ESLORA) + (VALOR_FIJO_ALQUILER * barco.getCoeficienteBernua());
    }
    
    /**
     * Devuelve los datos del VELERO
     */
    public String toString(){
        return "Numero de dias: " + numeroDias + "\nCliente: " + cliente.toString() + "\nBarco: " + barco.toString();
    }
    
     /**
     * Devuelve el amarre asignado al alquiler.
     */
    public int getAmarre()
    {
        return amarre;
    }
}
