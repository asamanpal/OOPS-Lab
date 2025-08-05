

// WAP to Compare 2 strings using compareTo(), == operator and .equals().



public class StringComparison {
    public static void main(String[] args) {

        String str1 = new String("Hello");
        String str2 = new String("Hello");

        int result = str1.compareTo(str2);
        if(result == 0) {
            System.out.println("compareTo(): Strings are equal.");
        } else if(result > 0) {
            System.out.println("compareTo(): str1 is greater than str2.");
        } else {
            System.out.println("compareTo(): str1 is less than str2.");
        }

        if(str1 == str2) {
            System.out.println("== operator: Strings are equal (same reference).");
        } else {
            System.out.println("== operator: Strings are NOT equal (different references).");
        }


        if(str1.equals(str2)) {
            System.out.println("equals(): Strings are equal in content.");
        } else {
            System.out.println("equals(): Strings are NOT equal in content.");
        }
    }
}


//OUTPUT
//
//compareTo(): Strings are equal.
//== operator: Strings are NOT equal (different references).
//equals(): Strings are equal in content.
