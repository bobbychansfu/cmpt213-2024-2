

import graded.FinalExam;
import graded.GradedActivity;
import graded.PassFailExam;

/**
   This program demonstrates polymorphic behavior.
*/

public class Polymorphic
{
   public static void main(String[] args)
   {
      GradedActivity[] tests = new GradedActivity[3];
      


      for (int i = 0; i < tests.length; i++) {
         System.out.println("Test " + (i + 1) + ": " +
                  " " + tests[i].getClass().getSimpleName() + ": " +
                    "score " + tests[i].getScore() +
                    ", grade " + tests[i].getGrade());
      }
   
   }
}
