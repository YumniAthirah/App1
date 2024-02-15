package Quiz.quiz2.Test18;

class Student {
    String name;
    int age;
    
    Student(){
        //Student("James", 25);       //causes compilation error
        this("James", 25);      
    }

    

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}
