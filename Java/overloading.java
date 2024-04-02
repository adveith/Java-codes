class Area{
    public void shape(int a){
        System.out.println("Area of Square : "+(a*a));
    }
     public void shape(int a,int b){
        System.out.println("Area of Rectanlge : "+(a*b));
    }
     public void shape(int a,int b,int c){
        System.out.println("Area of Cube : "+(a+b+c));
    }
}

public class overloading {
    public static void main(String args[]){
        Area a = new Area();
        a.shape(10,20,10);
    }
}
