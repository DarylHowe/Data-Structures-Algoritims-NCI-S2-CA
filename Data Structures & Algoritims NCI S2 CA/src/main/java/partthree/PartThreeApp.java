package partthree;

public class PartThreeApp {

    public static void main(String args[]) {
        
        // Create the object. 
        AddEvenDigitsObject addEvenDigits = new AddEvenDigitsObject();
           
        // Test various inputs. 
        
        System.out.println("");
        System.out.println("Test01");
        System.out.println("Input: 12345678");
        System.out.println("Expected answer: 20");
        System.out.println("Actual answer: " + addEvenDigits.addEvenDigits(0, 12345678));
        
        System.out.println("");
        System.out.println("Test02");
        System.out.println("Input: 222 - only even digits.");
        System.out.println("Expected answer: 6");
        addEvenDigits.setTotal(0);
        System.out.println("Actual answer: " + addEvenDigits.addEvenDigits(0, 222));

        System.out.println("");
        System.out.println("Test03 - no even digits input.");
        System.out.println("Input: 111");
        System.out.println("Expected answer: 0");
        addEvenDigits.setTotal(0);
        System.out.println("Actual answer: " + addEvenDigits.addEvenDigits(0, 111));

        System.out.println("");
        System.out.println("Test04 -  both even and odd digits.");
        System.out.println("Input: 22449900");
        System.out.println("Expected answer: 12");
        addEvenDigits.setTotal(0);
        System.out.println("Actual answer: " + addEvenDigits.addEvenDigits(0, 22449900));

        System.out.println("");
        System.out.println("Test04 -  only 0 entered");
        System.out.println("Input: 0000");
        System.out.println("Expected answer: 0");
        addEvenDigits.setTotal(0);
        System.out.println("Actual answer: " + addEvenDigits.addEvenDigits(0, 0000));
        
        // Student ID Test 

        System.out.println("");
        System.out.println("********* MY ACTUAL STUDENT NUMBER *********");
        System.out.println("Input: 19211848");
        System.out.println("Expected answer: 22");
        addEvenDigits.setTotal(0);
        System.out.println("Actual answer: " + addEvenDigits.addEvenDigits(0, 19211848));
    }
}
