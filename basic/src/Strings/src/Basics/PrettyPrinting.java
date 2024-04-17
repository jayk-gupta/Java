package Basics;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 453.12723f;
        System.out.printf("formatted number is %.2f\n", a);

        System.out.printf("My name is %s and I am %d years old\n", "jay", 22);

        System.out.println('a' + 'b');      //195
        System.out.println("a" + "b");                  //ab
        System.out.println('a' +2);                 //99
        System.out.println((char)('A' +2));      //c
        System.out.println('a' + a);
//        integer added with string
//        integer will be converted to Integer that will call toSting()
//        same as "a"+"23"
        System.out.println("a"+23);        //a23
    }
}
