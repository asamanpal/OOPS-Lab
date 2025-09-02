// wap in java to replace a word.



import java.util.Scanner;

public class WordReplace_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        System.out.println("Enter the word to replace:");
        String oldWord = sc.nextLine();

        System.out.println("Enter the new word:");
        String newWord = sc.nextLine();

        String updatedSentence = sentence.replace(oldWord, newWord);

        System.out.println("Updated sentence:");
        System.out.println(updatedSentence);

        sc.close();
    }
}

