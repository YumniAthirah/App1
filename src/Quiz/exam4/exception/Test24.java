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
        //} catch (IllegalArgumentException | RuntimeException | Exception e) {
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
