
/**
 * Write a description of class Barco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Barco
{
    // instance variables - replace the example below with your own
    private String matricula;
    private float eslora;
    private int anoFabricacion;

    /**
     * Constructor for objects of class Barco
     */
    public Barco(String matricula, float eslora, int anoFab)
    {
        this.matricula = matricula;
        this.eslora = eslora;
        anoFabricacion = anoFab;
    }

    /**
     * Devuelve la matricula del barco.
     */
    public String getMatricula()
    {
        return matricula;
    }
    
    /**
     * Devuelve la eslora del barco.
     */
    public float getEslora()
    {
        return eslora;
    }
    
    /**
     * Devuelve el año de fabricación del barco.
     */
    public int getAnoFabricacion()
    {
        return anoFabricacion;
    }
    
    /**
     * Devuelve el coeficiente de bernua del barco.
     */
    public abstract int getCoeficienteBernua();
    
    /**
     * Devuelve todos los datos del barco.
     */
    @Override
    public String toString(){
        String datos = "Matricula: " + matricula + "\n";
        datos += "Eslora: " + eslora + "\n";
        datos += "Año de fabricación: " + anoFabricacion + "\n";
        return datos;
    }
}
