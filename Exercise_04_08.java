public class Exercise_04_08 {
public static void main(String[] args) {
// Display pattern
int numberOfLines = 6;
System.out.println("Pattern ");
for (int rows = 1; rows <= numberOfLines; rows++) {
for (int s = numberOfLines - rows; s >= 1; s--) {
System.out.print(" ");
}
for (int col = rows; col >= 1; col--) {
System.out.print(col + " ");
}
System.out.println();
}
}
}