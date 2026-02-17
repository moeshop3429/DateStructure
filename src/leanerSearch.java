//busqueda de un elemento en una lista

public class leanerSearch {
    public static int linearSearch (int [] a, int key) {
        for ( int i = 0; i < a.length ; i ++) {
            if ( a [i] == key) {
                return i;
            }
        }

    return -1;

}

    public static void main(String [] args) {
        int [] a = {4, 9, 2,10,7};
        int key = 10;
        linearSearch(a, key);
        System.out.println(linearSearch( a, key));
        
}

}