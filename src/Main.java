public class Main {
    public static void main(String[] args) {
        //char ch1='';                   // it is not right way to assign empty character.
       char ch=Character.MIN_VALUE;    //this is the right way to assign empty character.
        //or
       // char ch='\u0000'; //this is the right way to assign  empty character.
        //char ch='\0'; //this is the right way to assign empty character.


        System.out.println("empty charcter."+ch);// output =empty character.
       // System.out.println("print empty character"+ch1);//output error : empty character litral;
    }
}