package lesson4.Q4SingletonClass;

public class LoggerMain {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Hello, world!");
    }
}

// A Singleton class in Java is a class that allows only one instance of 
//itself to be created

// and provides a way to access that instance from anywhere in the program. 
//Singleton classes

// are appropriate when you want to ensure that there's only one instance of a 
//class throughout

// the entire application, such as logging, configuration settings, 
//database connections, etc.

//singleton class to do the connection