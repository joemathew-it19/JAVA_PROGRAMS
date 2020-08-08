public class Exercise_04_09 {
public static void main(String[] args) {
// Display pattern
System.out.println("Pattern ");
for (int rows = 0; rows < 6; rows++) { //Print rows
for (int ws = 0; ws < rows; ws++) {
// Print white space
System.out.print(" ");
}
for (int col = 0; col < 6 - rows; col++) { // Print numbers
System.out.print((col + 1) + " ");
}
System.out.println(); // Print newline
}
}
}