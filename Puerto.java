import java.util.*;
/**
 * Write a description of class Puerto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerto
{
    private ArrayList<Alquiler> alquileres;
    public static final int NUMERO_AMARRES = 4;
    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        alquileres = new ArrayList<Alquiler>();
    }

    /**
     * Metodo que aÃ±ade un alquiler al Array devuelve la posicion o -1 en caso de que ya estuviese lleno
     */
    public int addAlquiler(int numeroDias, Cliente cliente, Barco barco){
        int count = 0;
        int pos = 0;
        Alquiler compAlquiler = new Alquiler(0, null, null, -1);
        ArrayList<Alquiler> alquileresTemp = new ArrayList<Alquiler>();
        if(alquileres.size() != 4){
            while(count < alquileres.size()){                
                compAlquiler = alquileres.get(count);
                if(compAlquiler.getAmarre() != count){
                    alquileresTemp.add(compAlquiler);
                    alquileres.remove(count);
                }
                else{
                    count++;
                    pos = count;
                }
            }
            alquileres.add(new Alquiler(numeroDias, cliente, barco, pos));
            for(Alquiler alquiler: alquileresTemp){
                alquileres.add(alquiler);
            }
        }
        else{
            pos = -1;
        }
        return pos;
    }

    /**
     * Metodo imprime los amarres que estan alquilados y los que aun estan vacios
     */
    public void verEstadoAmarres(){
        if (alquileres.size() > 0){
            int count = 0;
            int cont = 0;
            while (count < NUMERO_AMARRES){
                if (cont < alquileres.size() && alquileres.get(cont).getAmarre() == count){
                    System.out.println("Amarre " + (count) 
                        + " esta ocupado, el valor de su alquiler en este momento es = " 
                        + alquileres.get(cont).getCosteAlquiler());                        
                    count++;
                    cont++;
                }
                else{
                    System.out.println("Amarre " + (count) + " esta vacio");
                    count++;
                }
            }
        }
        else{
            for(int count = 0; count < NUMERO_AMARRES;count++){
                System.out.println("Amarre " + (count) + " esta vacio");
            }
        }
    }

    /**
     * Metodo que liquida un alquiler y devuelve su coste
     */
    public float liquidarAlquiler(int posicion){       
        int count = 0;
        boolean encontrado = false;
        float liquid = -1;
        while(count < alquileres.size() && !encontrado){
            Alquiler compAlquiler = alquileres.get(count);
            if (compAlquiler.getAmarre() == posicion){
                liquid = compAlquiler.getCosteAlquiler();
                alquileres.remove(count);
                encontrado = true;
            }
            count++;
        }
        return liquid;
    }
}