import java.util.*;

public class Shape implements Comparable<Shape> {

    double area;
    String name;

    public Shape(){

        name = "";
        area = 0;

    }

    public int compareTo(Shape a) {

        if(this.area == a.area){
            return 0;
        }else if(this.area < a.area){
            return -1;
        }else{
            return 1;
        }
    }

    public double getArea(){
        return area;
    }

    public String toString(){
        return "I am a " + name + " and my area is: " + area;
    }

    public static double totalShape (Shape[] array){
        int n = array.length-1;
        float soma = 0;
        for(; n>=0; n--){
            soma += array[n].getArea();
        }

        return soma;
    }

    public static double totalShape2 (Collection<? extends Shape> col){

        //collection
        double f = 0;
        Iterator<? extends Shape> it = col.iterator();

        while(it.hasNext()){
            f += it.next().getArea();
        }

        //collection to array fds
        int m = col.size();
        Shape[] a = col.toArray(new Shape[m]);
        float soma = (float) Shape.totalShape(a);


        return f;

    }






}
