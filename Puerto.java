/**
 * Write a description of class Puerto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerto
{
    private Alquiler[] alquileres;
    public static final int NUMERO_AMARRES = 4;
    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        alquileres = new Alquiler[NUMERO_AMARRES];
    }

    /**
     * Metodo que añade un alquiler al Array devuelve la posicion o -1 en caso de que ya estuviese lleno
     */
    public int addAlquiler(int numeroDias, Cliente cliente, Barco barco){
        int count = 0;
        int pos = 0;
        boolean amarreAlquilado = false;
        while(count < NUMERO_AMARRES && !amarreAlquilado){
            if(alquileres[count]== null){
                pos = count;
                alquileres[count] = new Alquiler(numeroDias, cliente, barco);
                amarreAlquilado = true;
            }
            count++;
        }
        return pos;
    }

    /**
     * Metodo imprime los amarres que estan alquilados y los que aun estan vacios
     */
    public void verEstadoAmarres(){
        for(int count = 0; count < NUMERO_AMARRES;count++){
            if(alquileres[count] == null)
                System.out.println("Amarre " + (count) + " esta vacio");
            else{
                System.out.println("Amarre " + (count) 
                    + " esta ocupado, el valor de su alquiler en este momento es = " + alquileres[count].getCosteAlquiler());
            }
        }
    }

    /**
     * Metodo que liquida un alquiler y devuelve su coste
     */
    public float liquidarAlquiler(int posicion)
    {
        float valor = -1;
        if(posicion < NUMERO_AMARRES && posicion >= 0){
            if(alquileres[posicion] != null){
                valor = alquileres[posicion].getCosteAlquiler();
                alquileres[posicion] = null;
            }
        }
        return valor;
    }
}