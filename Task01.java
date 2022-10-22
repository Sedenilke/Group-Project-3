package GroupProject3;

public class Task01 {
    public static void main(String[] args) {
        Circle circleObj = new Circle(5);
        System.out.println(" The area of your circle is " + circleObj.calculatedArea());
        System.out.println(" The perimeter of your circle is " +    circleObj.calculatedPerimeter());
        System.out.println("----------------");
        Square squareObj = new Square(10);
        System.out.println(" The area of your square is " + squareObj.calculatedArea());
        System.out.println(" The perimeter of your square is " + squareObj.calculatedPerimeter());
    }
}

interface Shape {
    double calculatedArea();
    double calculatedPerimeter();
}

class Circle implements Shape {
double radius;

Circle(double radius) {
    this.radius = radius;
}
    @Override
    public double calculatedArea(){
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double calculatedPerimeter() {
        return 2*Math.PI*radius;
    }
}

class Square implements Shape {
    double sidelength;

    Square(double sidelength) {
        this.sidelength = sidelength;
    }
    @Override
    public double calculatedArea(){
        return Math.pow(sidelength,2);
    }

    @Override
    public double calculatedPerimeter() {
        return 4*sidelength;
    }
}