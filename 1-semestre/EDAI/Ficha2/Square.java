public class Square extends Shape{

    double lado;

    public Square(){

        name = "Square";
        lado = 0;

    }

    public Square(double l){

        name = "Square";
        lado = l;
        calc_area();

    }

    public void calc_area(){

        area = Math.pow(lado, 2);

    }

}
