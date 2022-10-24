package GroupExercise2;

public class Task2 {
    /*
    We have to calculate the average of marks
obtained in three subjects by student A and by
student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning
the average percentage of marks. Provide
implementation of abstract method in classes
'A' and 'B'. The constructor of student A takes the
marks in three subjects as its parameters and
the marks in four subjects as its parameters for
student B. Test your code
     */
    public static void main(String[] args) {
        A a=new A(55,75,80);
        double s1=a.getPercentage();
        System.out.println("Percentage of student A : " + s1);

        B b=new B(52,88,90,99);
        double s2=b.getPercentage();
        System.out.println("Percentage of student B : " + s2);
    }
}
abstract class Marks1 {
    abstract double getPercentage();
}
class A extends Marks1 {
    double subject1;
    double subject2;
    double subject3;
    A(double subject1,double subject2, double subject3){
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
    }
    @Override
    double getPercentage() {
        return (subject1+subject2+subject3)/300*100;
    }}
class B extends Marks1 {
    double subject1;
    double subject2;
    double subject3;
    double subject4;
    B(double subject1,double subject2, double subject3,double subject4){
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
        this.subject4=subject4;
    }
    @Override
    double getPercentage() {
        return (subject1+subject2+subject3+subject4)/400*100;
    }}

