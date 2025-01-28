class Add
{
    void add(int a,int b)
    {
        System.out.println(a+b);
    }
    void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
}


public class Addmain {
    public static void main(String[] args)
    {
        Add a = new Add();
        a.add(5,4);
        a.add(3,4,5);
    }
}
