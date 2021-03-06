import java.util.*;

/* Reverse a number,Equal String.String Builder
public class Strings {
    public static void main(String[] args) {
        String str = "Swapnith Reddy";
        System.out.println(str);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter New String - yddeR htinpawS");
        String s1 = sc.nextLine();
        StringBuilder str1 = new StringBuilder();
        str1.append(str);
        System.out.println("New String after Using String Builder");
        System.out.println(str1);
        System.out.println("New String that is Compared with String reverse of Str1");
        System.out.println(s1);
        str1.reverse();
        System.out.println("Reversed String of " + str + " is : " + str1);
        if (str1.toString().equals(s1)) {
            System.out.println("Both " + str1 + " and " + s1 + " Strings are Equal");
        } else {
            System.out.println("Given Strings : " + str1 + " and " + s1 + " are not Equal");
        }
    }
}*/

/* Java Program to convert String to Char Array,Reverse String
public class Strings {
    public static void main(String[] args) {
        String str = "Swapnith Reddy - Swaps";
        char[] ch = str.toCharArray();
        int len = ch.length - 1;
        for (int i = len; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }
}*/

/* Java Program to count the total number of characters in a string

public class Strings {
    public static void main(String[] args) {
        // Enter Your Code Here
        String s = "Hello  i am Swapnith Reddy";
        int count = 0;
        // Count Each Char Except space
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ')
                count++;
        }
        System.out.println("Count of the String is : " + count);

    }

}*/

/* Java Program to count the total number of vowels and consonants in a string

public class Strings {
    public static void main(String[] args) {
        // Enter Your Code Here
        int vCount = 0, cCount = 0;
        String str = "Swapnith Reddy";
        System.out.println("Given String is : " + str);
        str = str.toLowerCase();
        System.out.println("Given String is Converted to Lower Case : " + str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                vCount++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                cCount++;
            }
        }
        System.out.println("Number of vowels: " + vCount);
        System.out.println("Number of consonants: " + cCount);

    }

}*/

/* Java Program to determine whether two strings are the anagram

public class Strings {
    public static void main(String[] args) {
        // Enter Your Code Here
        String s1 = "Silent";
        String s2 = "Listen";
        System.out.println("Original String of S1 : " + s1);
        System.out.println();
        System.out.println("Original String of S2 : " + s2);
        s1 = s1.toLowerCase();
        System.out.println("\nString S1 after Lowercase : " + s1);
        System.out.println();
        s2 = s2.toLowerCase();
        System.out.println("String S2 after Lowercase : " + s2);
        if (s1.length() != s2.length()) {
            System.out.println("\nGiven Strings : " + s1 + " and " + s2 + "are not Anagram as Length is not Equal\n");
        } else {
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            System.out.println("\nSorting of Arrays\n ");
            Arrays.sort(c1);
            Arrays.sort(c2);
            System.out.println("Arrays after Sorted");
            System.out.println("\n " + "String 1 : " + s1 + " and " + " String 2 : " + s2);
            if (Arrays.equals(c1, c2)) {
                System.out.println("Both the strings are anagram");
            } else {
                System.out.println("Both the strings are not anagram");
            }
        }
    }
}*/

/* Java Program to remove all the white spaces from a string

public class Strings {
    public static void main(String[] args) {
        // Enter Your Code Here
        String s = new String(" Swapnith- R e d d y");
        s = s.replaceAll("\\s","");
        System.out.println("String after removing all the white spaces : " + s);
    }
}*/

/* Java Program to replace lower-case characters with upper-case and vice-versa

public class Strings {
    public static void main(String[] args) {
        // Enter Your Code Here
        String str = "Swapnith Reddy";
        System.out.println("Given String : " + str);
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            } else if (Character.isUpperCase(str.charAt(i))) {
                sb.setCharAt(i, Character.toLowerCase(str.charAt(i)));
            }
        }

        System.out.println("Given String after converting uppercase to lowercase and lowercase to upper case : " + sb);

    }
}*/

/* Java Program to replace the spaces of a string with a specific character

public class Strings {
    public static void main(String[] args) {
        // Enter Your Code Here
        String string = "I am Swapnith Reddy";
        char ch = '-';
        string = string.replace(' ', ch);

        System.out.println("String after replacing spaces with given character: ");
        System.out.println(string);
    }

}*/

/* Java Program to determine whether a given string is palindrome
public class Strings {
    // Enter Your Methods Here
    public static void main(String[] args) {
        // Enter Your Code Here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = new String(sc.nextLine());
        System.out.println("Given String is : " + s);
        boolean flag = true;
        s = s.toLowerCase();
        System.out.println("\nGiven String after Converting is : " + s);
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println("\nGiven String : " + s + " is Palindrome");
        else
            System.out.println("\nGiven String : " + s + " is not Palindrome");
    }
}*/

// Java Program to find Reverse of the string 

public class Strings {
    // Enter Your Methods Here
    public static void main(String[] args) {
        // Enter Your Code Here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to Reverse");
        String s = new String(sc.nextLine());
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println("Reversed String is : " + rev);
        if (s.equals(rev)) {
            System.out.println("Reversed String is also a Palindrome");
        } else {
            System.out.println("Reversed String is Not Palindrome");
        }
    }
}
