package ex011;

/*Let's take a break from classes, members, and methods... The String format method is a very useful
 * way to build strings quickly. It is quite similar to PYthon's .format function, and also similar
 * (and in fact derives from) how string formatting was done in C and C++
 * 
 * See https://alvinalexander.com/programming/printf-format-cheat-sheet/ for a decent quick reference.
 * 
 * Complete the following methods to return a String in the format as specified in the unit test
 * 
 */

public class StringFormatter {
  
  public static String formatCoordinate(int x, int y) {
	  return "(" + x + "," + y + ")";
  }
  
  public static String formatDollarAmount(double a) {
	  return "$ " + String.format("%.2f", a);
  }
  
  public static String formatProperties(String a, boolean x, boolean y) {
	  return "Class: " + a + "; accessible: " + x + "; mutable: " + y;
  }
  
  public static String formatTableRow(String b, double x, long y, int z) {
	  String outputB = String.format("%-21s", b);
	  String outputX = String.format("%9s", String.format("%.2f", x));
	  String outputY = String.format("%08d", y);
	  String outputZ = String.format("%-6d", z);
			  
	  return "| " + outputB + "|" + outputX + " | " + outputY + " | " + outputZ + "|";
  }
}
