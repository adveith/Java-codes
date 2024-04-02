class vehicle
{
    public  void wheel(int a)
    {
        System.out.println("This vehicle is 2 wheeler");
    }
    public  void wheel(int a, int b)
    {
        System.out.println("This vehicle is 3 wheeler");
    }
    public  void wheel(int a, int b,int c)
    {
        System.out.println("This vehicle is 4 wheeler");
    }
}
public class overlaoding
{
    public static void main(String[] args)
    {
        vehicle v =new vehicle();
        v.wheel(10);
    }
}
