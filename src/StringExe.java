public class StringExe {
	public static void main (String args[]) {
		
		// We are going to write some strings
		String st1 = "This is the first string";
		String st2 = "You are reading the second string";
		String st3 = "   And this is the third   ";
		String st4 = "   and THIS is THE third   ";
		
		// We are going to start with length(). This command returns the length of a string.
		System.out.println("The length of this string is: " +st1.length());
		
		// Now substring(). This command returns a new string that is a substring of the string we choose.
		System.out.println("The substring is going to start from index 7: " +st1.substring(7));
		System.out.println("The substring is going to start from index 7 to 11: " +st1.substring(7,11));
		
		// It's the turn of trim(). This command returns a copy of the string, with leading and trailing whitespace omitted.
		System.out.println("The string without trim(): " +st3);
		System.out.println("The string with trim(): " +st3.trim());
		
		// We are going to continue with chatAt(). This command returns the char value at the specified index.
		char ch1 = st2.charAt(0);
		char ch2 = st2.charAt(5);
		char ch3 = st2.charAt(10);
		char ch4 = st2.charAt(15);
		char ch5 = st2.charAt(20);
		System.out.println("The character at 0, 5th, 10th, 15th & 20th index are: " +ch1 + " " +ch2 + " " +ch3 + " " +ch4 + " " +ch5);
		
		// Now, we continue with compareTo(). This command compares two strings lexicographically.
		int cmp1 = st1.compareTo(st2);
		System.out.println("st1 & st2 comparison is: " +cmp1);
		
		// compareToIgnoreCase() is similar to the compareTo() method. 
		// This command compares two strings lexicographically, ignoring case differences.
		int cmp2 = st3.compareToIgnoreCase(st4);
		System.out.println("st3 & st4 comparison is: " +cmp2);
		
		// The turn of index indexOf(). The method indexOf() is used for finding out 
		// the index of the specified character or substring in a particular String.
		System.out.println("Index of t in st1: "+st1.indexOf('t'));
	    System.out.println("Index of t in st1 after 10th char: "+st1.indexOf('t', 10));
	    System.out.println("Index of string st2 in st1: "+st1.indexOf(st2));
	    
	    // Time for lastIndexOf(). This command is used for finding out the index 
	    // of last occurrence of a char/sub-string in a particular String.
	    System.out.println("Last index of t in st1: "+st1.lastIndexOf('t'));
	    System.out.println("Last index of t in st1 before 10th char: "+st1.lastIndexOf('t', 10));
	    System.out.println("Last index of string st2 in st1: "+st1.lastIndexOf(st2));
	    
	    // And finally, we are going to finish with valueOf(). It returns the String representation 
	    // of the boolean, char, char array, int, long, float and double arguments.
	    int v1 = 5;
		float v2 = 7.820f;
		long v3 = 123L; 
		double v4 = 7777.77;
		char v5 = 'X';
		char v6[] = {'a', 'b', 'c'};
		String p1 = String.valueOf(v1);
		String p2 = String.valueOf(v2);
		String p3 = String.valueOf(v3);
		String p4 = String.valueOf(v4);
		String p5 = String.valueOf(v5);
		String p6 = String.valueOf(v6);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println(p6);
	}
}