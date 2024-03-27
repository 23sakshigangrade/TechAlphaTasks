public class RemoveLeadingZeros {
    public static void main(String[] args) {
        String input = "00000123789";
        
        // Remove leading zeros
        String output = input.replaceFirst("^0+", "");
        
        // Print the output
        System.out.println("Input : " + input);
        System.out.println("Output: " + output);
    }
}
