public class AddTwoNumbers {
     public static void main(String[] args) {
          if (args.length < 2) {
              System.out.println("Please provide two numbers as arguments.");
              return;
          }
          // Parse the numbers from command-Line arguments
          int num1 = Integer.parseInt(args[0]);
          int num2 = Integer.parseInt(args[1]);

           // Calculate the sum
           int sum = num1 + num2;

           // Display the result

           System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

}
}
   
