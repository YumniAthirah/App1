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

    class Inner2 {
        private String name;
        
        public Inner2(String name) {
            this.name = name;
        }
        
        public String getName() {
            return name;
        }
    }
}
