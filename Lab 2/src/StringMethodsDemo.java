//WAPp to check the different method of string class.



public class StringMethodsDemo {
    public static void main(String[] args) {
        // Sample strings
        String str1 = "Hello, World!";
        String str2 = "hello, world!";
        String str3 = "   Java Programming   ";

        // 1. length()
        System.out.println("Length of str1: " + str1.length());

        // 2. charAt()
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // 3. equals() and equalsIgnoreCase()
        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2));

        // 4. compareTo() and compareToIgnoreCase()
        System.out.println("compareTo: " + str1.compareTo(str2));
        System.out.println("compareToIgnoreCase: " + str1.compareToIgnoreCase(str2));

        // 5. toUpperCase() and toLowerCase()
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());

        // 6. substring()
        System.out.println("Substring (0, 5): " + str1.substring(0, 5));

        // 7. contains()
        System.out.println("Contains 'World': " + str1.contains("World"));

        // 8. indexOf() and lastIndexOf()
        System.out.println("Index of 'o': " + str1.indexOf('o'));
        System.out.println("Last index of 'o': " + str1.lastIndexOf('o'));

        // 9. replace()
        System.out.println("Replace 'World' with 'Java': " + str1.replace("World", "Java"));

        // 10. trim()
        System.out.println("Before trim: '" + str3 + "'");
        System.out.println("After trim: '" + str3.trim() + "'");

        // 11. startsWith() and endsWith()
        System.out.println("Starts with 'Hello': " + str1.startsWith("Hello"));
        System.out.println("Ends with '!': " + str1.endsWith("!"));

        // 12. split()
        String[] words = str1.split(", ");
        System.out.println("Split str1 by ', ':");
        for (String word : words) {
            System.out.println(word);
        }

        // 13. isEmpty()
        String emptyStr = "";
        System.out.println("Is emptyStr empty?: " + emptyStr.isEmpty());
    }
}



//OUTPUT
//
//
//Length of str1: 13
//Character at index 1 in str1: e
//str1 equals str2: false
//str1 equalsIgnoreCase str2: true
//compareTo: -32
//compareToIgnoreCase: 0
//Uppercase: HELLO, WORLD!
//Lowercase: hello, world!
//Substring (0, 5): Hello
//Contains 'World': true
//Index of 'o': 4
//Last index of 'o': 8
//Replace 'World' with 'Java': Hello, Java!
//Before trim: '   Java Programming   '
//After trim: 'Java Programming'
//Starts with 'Hello': true
//Ends with '!': true
//Split str1 by ', ':
//Hello
//World!
//Is emptyStr empty?: true