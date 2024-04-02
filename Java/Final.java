 class Student
{
    int rollno,prnno;
    String name,course;
    float cgpa;
    Student(int rollno,int prnno,String name,String course)
    {
        this.rollno = rollno;
        this.prnno = prnno;
        this.name = name;
        this.course=course;
    }
    
    Student(int rollno,int prnno,String name,String course,float cgpa)
    {
        this(rollno,prnno,name,course);
        this.cgpa=cgpa;
    }

    void display()
    {
        System.out.println(rollno+" "+prnno+"  "+name+" "+course+" "+cgpa);
    } 

}
    class Final
    {
        public static void main(String args[])
        {  
        Student s1=new Student(11,2028,"Adveith Walke","Btech cse",9.9f);  
        Student s2=new Student(12,2123,"Sarwajeet Singh","Btech cse",9.99f);  
        Student s3=new Student(13,1684,"Anand Katariya","Btech cse",9.999f);  
        Student s4=new Student(13,1934,"Jay Bachan","Btech cse",9.9999f);
        Student s5=new Student(13,2143,"Priyanshu Dangre","Btech cse",0.9999f);

        s1.display();  
        s2.display(); 
        s3.display(); 
        s4.display(); 
        s5.display(); 

        }
    }

