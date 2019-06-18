public class Student extends Person
 {
  private String grade;

  public Student( String n,int a, String g)
  {
    super(n,a);
    this.grade=grade;
  }
  public void setGrade(String grade)
  {
    this.grade=grade;
  }
  public String getGrade()
  {
    return grade;
  }
  public void printing()
  {
System.out.println("Name: Kleibert");
System.out.println("Age: 28");
System.out.println("Grade: A++");
  }
}
