public class Main {
    public static void main(String[] args) {
        //char ch='';                   // it is not right way to print empty character.
        char ch=Character.MIN_VALUE;    //this is the right way to print empty character.
        //or
       // char ch='\u0000'; //this is the right way to print empty character.
        //char ch='\0'; //this is the right way to print empty character.


        System.out.println("empty charcter!"+ch);
    }
}