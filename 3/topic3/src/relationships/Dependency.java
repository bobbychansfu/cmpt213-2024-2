package relationships;

public class Dependency {
    class Report {
        public void editReport(/* ... */) {

        }
    }
    class Manager {
        void work() {
            // ...
            Report r = new Report();
            r.editReport();
            // ... uses the result of addReport
        }
    }
}
