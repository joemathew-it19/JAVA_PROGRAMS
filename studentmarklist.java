import java.util.Scanner;

public class studentmarklist
{
  int roll;
  String name;
  String email;
  int computer,DSA,DSD,French,maths;
  void  input_details()
{
   System.out.println("Enter the Student Marks");
   Scanner sc= new Scanner(System.in);
   System.out.println("enter the roll number ");
   roll=sc.nextInt();
   System.out.println("enter the name of student ");
   name=sc.next();
   System.out.println(" enter the email");
   email=sc.next();
   System.out.println(" enter the marks of computer ");
   computer=sc.nextInt();
   System.out.println("enter the marks of DSA ");
   DSA=sc.nextInt();
   System.out.println(" enter the marks of DSD ");;
   DSD=sc.nextInt();
   System.out.println(" enter the marks of French ");
   French=sc.nextInt();
   System.out.println("enter the marks of maths ");
   maths=sc.nextInt();
  }
  void show_reportcard(){
   System.out.println("\n\t\t\t**********STUDENT DETAILS*********");
   System.out.println("Rollnumber:\t"+roll);
   System.out.println("Name:\t"+name);
   System.out.println("Email:\t"+email);
   System.out.println("Computer Science:\t"+computer);
   System.out.println("Digital system design:\t"+DSA);
   System.out.println("Data structure and algorthim:\t"+DSD);
   System.out.println("French:\t"+French);
   System.out.println("Maths:\t"+maths );
   int total;
   total=computer+DSA+DSD+French+maths;
   System.out.println("Total marks=\t"+total+"/500");
    float avg;
    avg=(total/500f)*100;
    System.out.println("Average marks: \t"+avg);
    if(avg<33)
    {
     System.out.println(" REMARKS \tFAIL\nBetter luck next time");
    }
    while((avg>34)&&(avg<44))
    {
     System.out.println("REMARK\t Third\naverage");
     break;
    }
    while((avg>45)&&(avg<59))
    {
      System.out.println("REMARK\t Second\ngood");
      break;
    }
    while((avg>60)&&(avg<74))
    {
     System.out.println("REMARK\t First\nvery good");
     break;
    }
   while(avg>=75)
   {
	System.out.println("REMARK :\t OUTSTANDING");
	break;
   }
  
  }
 public static void main(String[] args) {
  studentmarklist s = new studentmarklist ();
  s.input_details();
  s.show_reportcard();
 }
}