abstract class Shapes
{
    abstract void calculatePerimeter();
    abstract void calculateArea();
}

class Triangle extends Shapes{
    int side1,side2,side3,height;
    Triangle(int a,int b,int c,int d)
    {
        this.side1 = a;
        this.side2 = b;
        this.side3 = c;
        this.height = d;
    }
    void calculatePerimeter()
    {
        System.out.println(side1+side2+side3);
    }
    void calculateArea()
    {
        System.out.println(0.5*(side2*height));
    }
}

class Circle extends Shapes
{
    int radius;
    Circle(int r)
    {
        this.radius = r;
    }
    void calculatePerimeter()
    {
        System.out.println(2*3.14*radius);
    }
    void calculateArea()
    {
        System.out.println(3.14*radius*radius);
    }
}

public class Shape{
    public static void main(String[] args)
    {
        Shapes s1 = new Triangle(3,4,5,4);
        Shapes s2 = new Circle(3);
        s1.calculateArea();s1.calculatePerimeter();
        s2.calculateArea();s2.calculatePerimeter();
    }
}
