public class Fibbonacci {

    private int count = 0;

    public int Fibbo(int a){

        if(a == 0 || a == 1){
            count++;
            return a;
        }

        return Fibbo(a-1)+Fibbo(a-2);
    }

    public int getCount(){
        return count;
    }

    public static void main(String[] args){

        Fibbonacci f = new Fibbonacci();
        System.out.println("Fibonacci: " +f.Fibbo(5));
        System.out.println("Numero de Chamadas: " + f.getCount());
    }
}
