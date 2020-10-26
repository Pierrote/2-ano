public class Circle extends Shape{

    double raio;

    public Circle(){

        name = "Circle";
        raio = 0;

    }

    public Circle(double r){

        name = "Circle";
        raio = r;
        calc_area();

    }

    public void calc_area(){

        area = Math.PI*Math.pow(raio, 2);

    }



}
