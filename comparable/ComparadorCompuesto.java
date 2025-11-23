public class comparadorCompuesto implements Comparetor<objetoComparado>{
    // Solucion para cuanod necesitamos comparable 
    //  y pasamos `comparador` como parametro

    // p/ ejemplo 2 & 3

    // ademas cuando uso comparator 

    Comparetor<objetoComparado> c1; // estrategia 1 
    Comparetor<objetoComparado> c2; // estrategia 2 
    // c1 seria por nombre

    public comparadorCompuesto(Comparetor<objetoComparado> c1, Comparetor<objetoComparado> c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    public int compare(objetoComparado a1, objetoComparado a2){
        int result = c1.compare(a1, a2);
        if (result == 0){
            return c2.compare(a1, a2);
        }
        return result;
    }
}