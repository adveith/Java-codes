class address{
String city,state,country;
public address(String city,String state,String country) 
{  
    this.city = city;  
    this.state = state;  
    this.country=country;  
}  
}
class Emp{
    int id;
    String name;
    address add;

     public Emp(int id,String name,address add)
    {
        this.id = id;
        this.name = name;
        this.add = add;
    }

    void display()
{  
System.out.println(id+" "+name);  
System.out.println(add.city+" "+add.state+" "+add.country);  
}
}

public class aggrecation{
public static void main(String[] args) 
{  
    address address1=new address("Pune","Maharastra","India");  
    address address2=new address("Solapur","Maharashtra","India");  
    Emp e=new Emp(111,"Adveith",address1);  
    Emp e2=new Emp(112,"Akash",address2);  
    e.display();  
    e2.display();  
}  
}