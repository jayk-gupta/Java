package Basics;

public class Syntax {
    public static void main(String[] args) {
//        Collection of characters
//Datatype ref.variable = object
//        String Pool: separate memory struc. inside heap,
//        all the similar values of the string are not re-created
//       Immutability: You cannot change the STRING Object
        String name = "jay";;
//        == checks if ref. var. are pointing to the same object
        System.out.println(name);
//        Creating new objects
        String a = new String("apple");
        String b = new String("apple");
        System.out.println(a==b);
//        When we need to check only the value use .EQUALS Method
        System.out.println(a.equals(b));
//        Printing char of string
        System.out.println(a.charAt(0));
        System.out.println(a.charAt(1));
        System.out.println("The length of string is: "+ a.length());
        System.out.println(a.charAt(a.length()-1));
    }
}
