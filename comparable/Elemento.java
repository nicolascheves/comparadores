import java.util.ArrayList;
import java.util.Collection;

public abstract class Elemento {
    // Esto solo se puede usar si se sabe que el criterio es compatible con el elemento (q es un archivo)
    // un sistema separado para buscar y ordenar

    // ejemplo 1
    public abstract ArrayList<objetoComparado> buscar(Criterio cc);

    // ejemplo 2 (pasar comparador x parametro, comparadores se definen en subclases, no abstracto, )
    // o buscar(Criterio cc, Comparetor<objeroComparado> c1)
    public ArrayList<objetoComparado> buscar(Criterio cc, comparadorCompuesto c1){

        ArrayList<objetoComparado> salida = this.buscar(cc);
        Collection.sort(salida,c1);
        return salida;  
    }     

    // ejemplo 3 (combinacion de comparadores, clase compuesta)
    public abstract ArrayList<objeroComparado> buscar(Criterio cc);

}
