package Quiz.exam4.Test43;

public class Test43 {
    public static void main(String[] args) {
        Buyable [] arr = new Buyable[2];
        for(Buyable b : arr){
            System.out.println(b.salePercentage);
            //System.out.println(b.salePercentage());
            System.out.println(Buyable.salePercentage());
        }

        Book [] books = new Book[2];
        for(Book b : books){
            System.out.println(b.salePercentage);
            //System.out.println(b.salePercentage());
            System.out.println(Buyable.salePercentage());
        }
    }
}

// Correct and only way to access static method of an Interface is by using the [name of the interface],... 
// ...such as Buyable.salePercentage(). [Line n2] and [Line n4] cause compilation error.

// Reference variable of the interface: 
// Buyable obj1 = null; 
// System.out.println(obj1.salePercentage);

// Name of the implementer class: 
// System.out.println(Book.salePercentage);

// Reference variable of the implementer class: 
// Book obj2 = null; 
// System.out.println(obj2.salePercentage);

// Hence, [Line n1] and [Line n3] compile successfully.
