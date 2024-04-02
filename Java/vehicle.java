public class vehicle
{
    void car()
    {
        System.out.println("This car company is Mercedes");
    }
}
class gWagon extends vehicle
{
    void suv()
    {
        System.out.println("This vehicle is SUV segment , Its name is Mercedes G - WAGON");
    }
}
class gla extends vehicle
{
    void gla()
    {
        System.out.println("This vehicle is Sedan segment , Its name is Mercedes Gla coupe");
    }
}
class Testinheritance
{
    public static void main(String args[])
    {
    gWagon G = new gWagon();
    gla l = new gla();
    G.suv();
    l.gla();
    }
}