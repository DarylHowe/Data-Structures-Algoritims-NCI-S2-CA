package partthree;

public class AddEvenDigitsObject {

    private int total = 0;
      
    public int addEvenDigits(int index, int studentNumber) {
        
        // Convert int to type String.
        String studentNumberString = Integer.toString(studentNumber);
        
        // Once we haven't reached past the last digit..
        if (index < studentNumberString.length()) {
            
            // Get the value of the current digit.
            int theDigit = Character.getNumericValue(studentNumberString.charAt(index));
            
            // If the digit is even..
            if (theDigit % 2 == 0) {

                // Add to digit's value to total.
                total += theDigit;
            }

            index++;
            
            // Recursive call - call the method again. 
            addEvenDigits(index, Integer.parseInt(studentNumberString));
        }
        
        // Return the total. 
        return total;
    }
    
    public void setTotal(int total){
        this.total = total;
    }
}
