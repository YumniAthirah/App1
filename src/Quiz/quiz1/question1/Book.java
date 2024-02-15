package Quiz.quiz1.question1;

public class Book {
    private String name;
    private String author;

    Book(){}

    Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    String getName() {
        return name;
    }

    String getAuthor() {
        return author;
    }
}
