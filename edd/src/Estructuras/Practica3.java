package edd.src.Estructuras;
public class Practica3 {
    Lista<Integer> lista = new Lista<>();

    public static void sumaCercana(Lista lista, int N){
        //lista.add(N+1);
        System.out.println(lista);
        if(lista.contains(N)){
            System.out.println("n es un elemento en la lista");
        }else{
            lista.mergeSort(null);
            System.out.println(lista);
        }
        
    }
    
    /**
     * Metod que genera de forma recursiva todas las permutaciones de una cadena
     */
    public static void permutaciones(char[] letras, int indiceActual){
        if (indiceActual == letras.length-1)
            System.out.println(String.valueOf(letras));
        for(int i = indiceActual; i < letras.length; i++){
            swap(letras,indiceActual,i);
            permutaciones(letras,indiceActual+1);
            swap(letras,indiceActual,i);
        } 
    }

    /**
     * Metodo que intercambia dos elementos de un arreglo
     */
    public static void swap(char[] letras, int i, int j){
        char temp = letras[i];
        letras[i] = letras[j];
        letras[j] = temp;
    }
    
    public static void permutacionesCadena(String cadena){
        if(cadena == null || cadena.length() == 0){
            return;
         }
         permutaciones(cadena.toCharArray(), 0);
    }
    
    
    
    
    public static void primosQueSuman(int S, int P, int N){

    }

    /**
     * Metodo que resuelve el problema de las N reinas
     * @param tablero tablero donde se almacenan las reinas
     * @param columna columna en la que se va a colocar la reina
     * @param N numero de reinas
     */
    public static boolean resolverReinas(Integer tablero[][], int columna, int n){
        if(columna>=n) return true;
        for(int i=0;i<n;i++){
            if(esValido(tablero,i,columna,n)){
                tablero[i][columna]= 1;
                if(resolverReinas(tablero, columna + 1,n)) 
                return true;
                tablero[i][columna]= 0;
            }
        }
        return false;
    }

    /**
     * Metodo que verifica si una reina se puede colocar en una casilla
     * @param tablero tablero donde se almacenan las reinas
     * @param fila fila en la que se va a colocar la reina
     * @param columna columna en la que se va a colocar la reina
     * @param N numero de reinas
     */
    public static boolean esValido(Integer tablero[][], int fila, int columna, int n){
        int i,j;
        for(i=0;i<columna;i++){
            if(tablero[fila][i]==1) 
            return false;
        }
        for(i=fila,j=columna; i>=0 && j>=0;i--,j--){
            if(tablero[i][j]==1)
             return false;
        }
        for(i=fila,j=columna; i<n && j>=0;i++,j--){
            if(tablero[i][j]==1) 
            return false;
        }
        return true;
    }

    //Metodo que imprime el tablero resulto para N reinas 
    public static void tableroResuelto(Integer tablero[][], int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print(" "+tablero[i][j]+" ");
            System.out.println();
        }
    }

    public static void N_Reinas(int N){
        //Creamos nuestro tablero N * N e inicializamos cada una de sus casillas en 0
        // 0 significa que no hay ninguna reina en esa casilla
        // 1 significa que hay una reina en esa casilla
        Integer tablero[][]=new Integer [N][N];
        for(int i=0;i<N;i++)
            for(int j=0;j<N;j++)
                tablero[i][j] = 0;
        if(resolverReinas(tablero,0,N)) {
            tableroResuelto(tablero, N);
        } else{ System.out.println("No hay solucion para "+ String.valueOf(N) + " reinas");
        }
    }

    public static void main(String[] args) {
        //Puedes hacer tus pruebas aqui
        Lista<Integer> x = new Lista<>();
        
        for(int i = 10; i >= 0; i--){
            x.add(i);
        }
        

        //System.out.println(x);
        //sumaCercana(x, 22);
        permutacionesCadena("AB");
        N_Reinas(4);
    }

}
