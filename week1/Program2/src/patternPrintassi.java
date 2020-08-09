import java.util.Scanner;//util.Scanner is a class in the java API use to create a scanner object
public class patternPrintassi{
public static void main(String[] args){
System.out.println("Please fill number to print pattern");//show user to fill number to print star pattern
Scanner scanner = new Scanner(System.in);//to read user input
int myrows = scanner.nextInt();//the next token of input as a integer
System.out.println("The  pattern is... ");//to show output to user
for (int m = 1; m <= myrows; m++)// outer loop to print star pattern
{
for (int n = 1; n <= m; n++)//inner loop to print to print star pattern
{
System.out.print("*");//to print star
}
System.out.println();//to print space
}
}}