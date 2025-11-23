import java.util.ArrayList;
import java.util.Collection;

public class Ejemplo3 {
    public ArrayList<objetoComparado> buscar(Criterio cc){
        ArrayList<objetoComparado> salida = new ArrayList<objetoComparado>();
        
        for(Elemento e:elementos){
            Elemento ee = e.buscar(cc);
            salida.addAll(ee);
        }
        //comparadorCompuesto comparador = new comparadorCompuesto(new comparadorNombre(), new comparadorEmail());
        comparadorCompuesto comparador;
        comparadorNombre cn = new comparadorNombre(); // Clases a crear tmb
        comparadorEmail ce = new comparadorEmail();
        comparador = new comparadorCompuesto(cn, ce);
        Collection.sort(salida,comparador);

        // para hacer esto salida debe ser uno
        // de los tipos que implementan comparable
        return salida;
    }
}
