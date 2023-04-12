package samples;
import java.util.Scanner;
class Student {
private int age;
public int getAge() {
return age;
}
public void setAge(int age) {
this.age = age;
}
public void display() {
System.out.println("age: "+getAge());
}
}
public class Location{
public static void main(String args[]) {
//Reading values from user
Scanner sc = new Scanner(System.in);
System.out.println("Enter the age of the student: ");
int age = sc.nextInt();
//Calling the setter and getter methods
Student obj = new Student();
obj.setAge(age);
obj.display();
}
}