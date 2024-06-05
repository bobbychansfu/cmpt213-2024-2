package relationships;

import java.util.ArrayList;
import java.util.List;

public class WeakAgg {
    class Instructor {
        // ...
    }
    class Manager {
        List<Instructor> facultyMembers = new ArrayList<>();
        void addAsset(Instructor a) {
            facultyMembers.add(a);
        }
    }
}
