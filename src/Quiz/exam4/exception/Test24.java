package Quiz.exam4.exception;

public class Test24 {
    public static void convert(String s)
    throws IllegalArgumentException, RuntimeException, Exception{
        if(s.length() == 0){
            throw new RuntimeException("LENGTH SHOULD BE GREATER THAN 0");
        }
    }
    public static void main(String[] args) {
        try {
            convert("");
        //} catch (IllegalArgumentException | RuntimeException | Exception e) {     //Line 14
        } catch (RuntimeException e) {                                          
            System.out.println(e.getMessage());                                     //Line 15
        }                                                                           //Line 16
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
// Replace Line 14 with 'catch(IllegalArgumentException | Exception e) {'
// Replace Line 14 with 'catch(IllegalArgumentException | RuntimeException e) {'
// Replace Line 14 with 'catch(RuntimeException | Exception e) {'
// Comment out Line 14, Line 15 and Line 16

// In multi-catch statement, classes with multi-level hierarchical relationship can't be used.

// [RuntimeException is subclass of Exception], [IllegalArgumentException is indirect subclass of Exception] and 
// [IllegalArgumentException is subclass of RuntimeException], hence these pairs can't be used in multi-catch statement.

// Commenting out [Line 14, Line 15 and Line 16] will resolve the compilation error but...
// ...it will print the whole stack trace rather than just printing the message.