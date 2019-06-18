import java.util.Scanner;

public class Example{

public static void main(String args[]){

Scanner sc = new Scanner (System.in);


String n;
int a;
String g;

n=sc.nextLine();
a=sc.nextInt();
g=sc.nextLine();

//System.out.println("Name: " + n );
//System.out.println("Age: " + a);
//System.out.println("Grade: " + g);

Student random1 = new Student(n, a, g);
random1.printing();
}




}
