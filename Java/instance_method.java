public class instance_method
{
       public static void main(String [] args)  
        {    
            instance_method obj = new instance_method();   
            System.out.println("The sum is: "+obj.add(12, 13));
        }  
        int s;  
        public int add(int a, int b)  
        {  
        s = a+b;  
        return s;  
        }  
         
}
