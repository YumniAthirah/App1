package lesson4.Q6InnerClass;

public class Outer {
    class Inner {
        private String name;
        
        public Inner(String name) {
            this.name = name;
        }
        
        public String getName() {
            return name;
        }
    }
}
