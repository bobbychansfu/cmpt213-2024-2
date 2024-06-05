package relationships;

import java.util.ArrayList;
import java.util.List;

public class StrongAgg {
    class Tab {
        // ...
    }
    class Browser {
        private List<Tab> tabs = new ArrayList<>();
        public void newTab() {
            Tab newTab = new Tab();
            tabs.add(newTab);
        }
    }
}
