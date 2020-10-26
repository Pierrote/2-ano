

public class F{

    int n;
    int count = 0;


    public int fibo(int n){

        if(n == 0 || n == 1){
            count++;
            return n;

        }

        return fibo(n-1)+fibo(n-2);


    }

    public int count(){

        return count;

    }

    public static void main(String[] args){
        F f = new F();
        System.out.println("Fibonacci: " + f.fibo(4));
        System.out.println("Chamadas de Função: " +f.count());
    }


}