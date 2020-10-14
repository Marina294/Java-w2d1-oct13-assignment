// I couldn't finish it


import java.util.Scanner;


public class orderThreeCities {
    public static void main (String[] args) {

        int count;
        String temp;
        
        // first city
        Scanner enterFirst = new Scanner(System.in);
        System.out.print("Enter the first city: ");

        count = enterFirst.nextInt();

        String str1[] = new String[count];

        // secound city
        Scanner enterSecound = new Scanner(System.in);
        System.out.print("Enter the secound city: ");
        // String secound = enterSecound.next();

        String str2[] = new String[count];

        // third city
        Scanner enterThird = new Scanner(System.in);
        System.out.print("Enter the third city: ");
        // String third = enterThird.next();

        String str3[] = new String[count];


       //User is entering the strings and they are stored in an array
     
       for(int i = 0; i < count; i++)
       {
           str[i] = enterThird.nextLine();
       }
       enterFirst.close();
       enterSecound.close();
       enterThird.close();

       //Sorting the strings
       for (int i = 0; i < count; i++) 
       {
           for (int j = i + 1; j < count; j++) { 
               if (str[i].compareTo(str[j])>0) 
               {
                   temp = str[i];
                   str[i] = str[j];
                   str[j] = temp;
               }
           }
       }
       
       System.out.print("The three city in alphabetical order are");
       for (int i = 0; i <= count - 1; i++) 
       {
           System.out.print(str[i] + ", ");
       }

    }
}    