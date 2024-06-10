package relationships;

import java.util.ArrayList;
import java.util.List;

public class WeakAgg {
    class Instructor {
        // ...
    }
    class Faculty {
        List<Instructor> facultyMembers = new ArrayList<>();
        void addAsset(Instructor a) {
            facultyMembers.add(a);
        }
    }
}
