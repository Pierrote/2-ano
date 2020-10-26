import java.util.*;
import java.lang.*;

public class Teste{

    public static void main(String[] args){

        Circle c1 = new Circle(3.5);
        Circle c2 = new Circle(8);
        Square s1 = new Square(6);
        Square s2 = new Square(1.5);

        Shape[] arr1 = {new Square(3), new Square(2), new Circle(2), new Circle(5)};
        Circle[] arr2 = {new Circle(3), new Circle(1), new Circle(4), new Circle(2.5)};
        Square[] arr3 = {new Square(2), new Square(3), new Square(4)};

        Collection<Shape> col1 = new ArrayList<Shape>();
        col1.add(new Square(2));
        col1.add(new Square(3));
        col1.add(new Circle(2));
        col1.add(new Circle(5));

        Collection<Circle> col2 = new ArrayList<Circle>();
        col2.add(new Circle(1));
        col2.add(new Circle(4));
        col2.add(new Circle(2.5));
        col2.add(new Circle(1));


        Collection<Square> col3 = new ArrayList<Square>();
        col3.add(new Square(2));
        col3.add(new Square(3));
        col3.add(new Square(4));

        Fracções[] s = {new Fracções(3,2), new Fracções(1,2), new Fracções(3)};

        //outra forma de fazer a shete
        //List<Shape> list = new ArrayList<>();
        //list.add(new Square(2));


        System.out.println(maior(arr2));
        //list.forEach(System.out::println);

    }

    public static < Shape extends Comparable <? super Shape>> Shape maior(Shape[] array){

        int n = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i].compareTo(array[n]) > 0){
                n = i;
            }
        }

        return array[n];
    }


}
