import java.util.ArrayList;
import java.util.Collection;

// Este codigo deberia ser implmentado en clase Elemento.java
public class Ejemplo2 {

    // DEBO PASAR EL COMPARADOR COMPUESTO X PARAMETRO

    // ABSTRAER ARRIBA EN ELEMENTO, Y DEFINIRLO EN CADA SUBCLASE
    //      CON EL COMPARADOR LO HAGO TEMPLATE, LO IMPORTO Y LO USO COMO ARGUMENTO
    
    // NO LO HAGO ABSTRACT A LA FUNCION, LA DEFINO INSITU
    public ArrayList<objetoComparado> buscar(Criterio cc, comparadorCompuesto c1){
        ArrayList<objetoComparado> salida = this.buscar(cc);
        Collection.sort(salida,c1);
        return salida;  
    }
    // hay limitaciones que no entiendo bien aun

    public ArrayList<objetoComparado> buscar(Criterio cc, comparadorCompuesto comparador){
        ArrayList<objetoComparado> salida = new ArrayList<objetoComparado>();
        if (cc.cumple(this)){
            salida.add(this);
        }

        Collection.sort(salida,comparador);
        // pasar x parametro los comparadores  & abstracto arriba
        // o crearlos adentro de la funcion


        // para hacer esto salida debe ser uno
        // de los tipos que implementan comparable
        return salida;

        // video y usuario implementan comparable
    }
}