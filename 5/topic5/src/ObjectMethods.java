import graded.FinalExam;
import graded.GradedActivity;
import graded.PassFailExam;

public class ObjectMethods {
    public static void main(String[] args) {
        GradedActivity exam1 = new PassFailExam(10,0);
        GradedActivity exam2 = new FinalExam(10,0);

        System.out.println(exam1);
        System.out.println(exam2);

        System.out.println(exam1.equals(exam2));

    }
}
