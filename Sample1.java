class Student
{
int rollno=20;
String name="Shruti";

void display()
{
System.out.println("Roll No:"+rollno);
System.out.println("Name:"+name);

}

}
public class Sample1
{
                     
   public static void main(String args[])
   {
   
   Student s1;
   s1=new Student();
   s1.display();
   }

}