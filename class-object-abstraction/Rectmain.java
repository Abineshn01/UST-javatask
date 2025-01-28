class Rectangle
{
    int height;
    int width;
    Rectangle(int h,int w)
    {
        this.height = h;
        this.width = w;
    }
    void area()
    {
        System.out.println(height*width);
    }
    void perimeter()
    {
        System.out.println(2*height+width);
    }
}

public class Rectmain {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 8);
        r.area();r.perimeter();
    }
}
