import java.util.Scanner;



public class vowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Letter: ");
        char letter = scanner.next().charAt(0);
        

        if (letter == 'a' || letter == 'i' || letter == 'u' || letter == 'e'|| letter == 'o' || letter == 'A' || letter == 'I' || letter == 'U' || letter == 'E' || letter == 'O' ) {
            System.out.println(letter + " is a vowel");

            } else if (Character.isLetter(letter)) {
              System.out.println(letter + " is a consonant");
            } else {
                System.out.println(letter + " is an invalid input");
            }
        
    }
}





// public class vowelOrConsonant {

// 	public static void main(String args[])
// 	{
// 		System.out.print("Vowel Or Consonant");
// 		System.out.println(" A is " + Character.isUpperCase('A') +
//                            ", a is " + Character.isUpperCase('a'));
// 	}
// }
			