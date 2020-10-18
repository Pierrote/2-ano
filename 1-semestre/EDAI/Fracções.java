public class Fracções implements Comparable<Fracções>{

    private int c,d;
    private int n1, n2, d1, d2;
    boolean s = false;

    public Fracções(){
        c = 0;
        d = 0;

    }

    public Fracções(int a){
        if(a<0){
            s = true;
        }
        c = a;
        d = 1;

    }

    public Fracções(int a, int b){

        this.c = a;
        this.d = b;

    }

    public void setFrac(int a, int b){
        this.c = a;
        this.d = b;

    }

    public void setNum(int a){
        this.c = a;
        
    }

    public void setDen(int a){
        this.d = a;
        
    }


    public int getNum(){
        return c;
    }

    public int getDen(){
        return d;
    }

    public String toString(){
        if(d == 1){
            return "O resultado é: " + c;
        }else{
            return "A fracção é: " + c + "/" + d; 
        }
        
    }

    public static int mdc(int dividendo, int divisor){

        if ((dividendo % divisor == 0 )){
            return divisor;
        }else{

            return mdc(divisor,(dividendo % divisor));
          } 
    }

    public static int mmc(int num1, int num2){
        int resto, a, b;
        a = num1;
        b = num2;
        do {
            resto = a % b;
    
            a = b;
            b = resto;
    
        } while (resto != 0);
    
        return (num1*num2)/a;
    
    }

    public void sum(Fracções f){
        
        n1 = getNum();
        d1 = getDen();
        n2 = f.getNum();
        d2 = f.getDen();
        
        if(d1 == d2){
            setFrac(n1+n2, d1);
        }else{
            int m1, m2;
            int mmc = mmc(d1,d2);
            m1 = mmc/d1;
            m2 = mmc/d2;
            setFrac((n1*m1)+(n2*m2), mmc);
        }
    }

    public void product(Fracções f){
        n1 = getNum();
        d1 = getDen();
        n2 = f.getNum();
        d2 = f.getDen();
        
        setFrac(n1*n2, d1*d2);
    }

    public void div(Fracções f){
        n1 = getNum();
        d1 = getDen();
        n2 = f.getNum();
        d2 = f.getDen();

        setFrac(n1*d2, n2*d1);

    }

    public void reduce(){

        int m = mdc(c,d);
        setNum(c/m);
        setDen(d/m);
        
    }

    public int compareTo(Fracções f){
       
        float x = (float) this.getNum()/this.getDen();
        float y = (float) f.getNum()/f.getDen();
        if (x<y){
            return -1;
        }else{
            if(x>y){
                return 1;
            }else{
                return 0;
            }
        }
    }

    public static void main(String[] agrs){
 
        Fracções f1 = new Fracções(3);
        Fracções f2 = new Fracções(1);
        
        System.out.println(f1.compareTo(f2));
    }

}