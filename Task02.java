package GroupProject3;

public class Task02 {
    public static void main(String[] args) {
        A objA = new A(73,80,90);
        B objB = new B(45,23,78,56);
        System.out.println("Hello, student A! Your average mark is: " + objA.getPercentage());
        System.out.println("Hello, student B! Your average mark is: " + objB.getPercentage());
    }
}

abstract class Marks{
    abstract double getPercentage();
}

class A extends Marks{
    double mark1, mark2, mark3;

    A(double mark1, double mark2, double mark3){
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    @Override
    double getPercentage() {
        return (mark1+mark2+mark3)/3;
    }
}

class B extends Marks{
    double mark1, mark2, mark3, mark4;

    B(double mark1, double mark2, double mark3, double mark4){
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4=mark4;
    }

    @Override
    double getPercentage() {
        return (mark1+mark2+mark3+mark4)/4;
    }
}