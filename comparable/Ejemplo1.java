import java.util.ArrayList;
import java.util.Collection;

public class Ejemplo1 {
    // sabemos que se puede usar comparable

    public ArrayList<objetoComparado> buscar(Criterio cc){
        ArrayList<objetoComparado> salida = new ArrayList<objetoComparado>();

        for(Elemento e:elementos){
            Elemento ee = e.buscar(cc);
            salida.addAll(ee);
        }

        //  SOLUCION IDEAL P/ COMPARABLE ; DEF EN VIDEO & USUARIO
        Collection.sort(salida);
        return salida;

        // video y usuario implementan comparable

        /** Video.java implements Comparable<Video>
         * 
         * public int compareTo(Video a){
         *     return autor.compareTo(a.getAutor());
         * }
         */

        /** Usuario.java o autor.java implement Comparable<Usuario>
         * 
         * public int compareTo(Usuario u){
         *   int result = nombre.compareTo(u.getNombre());
         *   if (result == 0){
         *      return email.compareTo(u.getEmail());
         *   } return result;
         * }
         */

    }
}
