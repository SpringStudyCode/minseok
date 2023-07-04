import java.util.ArrayList;

public class ExceptionExample {

    public static void main(String[] args) {

        // 예외 (Exceptions)

//        int a = 10;
//        int b = 0;
//
//        int c = a / b;

        ArrayList arraylist = new ArrayList(3);
        // arraylist.get(10);

        try{
            // arraylist.get(10);
            int a = 10;
            int b = 0;
            int c = a / b;
        } catch (IndexOutOfBoundsException ioe){
            // e.printStackTrace();
            System.out.println("IndexOutOfBoundsException 발생");
        } catch (IllegalArgumentException iae){
            System.out.println("IllegalArgumentException 발생");
        } catch(Exception e){
            System.out.println("Exception 발생");
        } finally{
            System.out.println("finally");
        }
    }
}
