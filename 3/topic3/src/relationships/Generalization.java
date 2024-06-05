package relationships;

public class Generalization {
    class Doctor {
        String name;
        void register(){
            // method is shared with subclasses
        }
    }

    class FamilyDoctor extends Doctor {
        int numPatients;

        void acceptNewPatient() {

        }
    }

    class Surgeon extends Doctor {
        void performSurgery() {
            // ...
        }
    }
}
