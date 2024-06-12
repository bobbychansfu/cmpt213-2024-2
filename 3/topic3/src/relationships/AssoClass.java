package relationships;

public class AssoClass {
    class Student { }
    class CourseSection { }
    class Enroll {
        private Student s;
        private CourseSection cs;
        private boolean eligibility;
        private String grade;

    }
}
