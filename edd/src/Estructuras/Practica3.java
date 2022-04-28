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
    public static void permutacionesCadena(String cadena){

    }
    public static void primosQueSuman(int S, int P, int N){

    }
    public static void N_Reinas(int N){

    }

    public static void main(String[] args) {
        //Puedes hacer tus pruebas aqui
        Lista<Integer> x = new Lista<>();
        
        for(int i = 10; i >= 0; i--){
            x.add(i);
        }
        

        System.out.println(x);
        sumaCercana(x, 22);
    }

}
