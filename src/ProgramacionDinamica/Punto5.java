package ProgramacionDinamica;

public class Punto5 {

    public int recursivo(int n, int k){

        if(n == k || k == 0){
            return 1;
        }else if(0 < k && k < n){
            return recursivo(n-1, k-1) + recursivo(n-1, k);
        }else{
            return 0;
        }
        
    }
    
}
