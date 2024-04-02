class Employee{  
 float salary=40000f;  
}  
class inhweritance1 extends Employee{  
 int bonus=10000;  
 public static void main(String args[]){  
   inhweritance1 p=new inhweritance1();  
   System.out.println("Programmer salary is:"+p.salary);  
   System.out.println("Bonus of Programmer is:"+p.bonus);  
}  
}  