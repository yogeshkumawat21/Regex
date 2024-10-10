import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    static  void checkPattern(String ptrn,String input)
    {
        Pattern pattern =Pattern.compile(ptrn);
        Matcher matcher=pattern.matcher(input);
        boolean matches = matcher.matches();
        System.out.println(matches);
    }
    public static void main(String[] args)
    {
             //  checkPattern("[a-zA-Z]","a" );for single Character
               //   checkPattern("[a-zA-Z]+","aX" ); for multiple Characters
                //  checkPattern("[a-zA-Z0-9#]+","a4X" ); for numeric& special characters also



        // that Accept only 10 no
       // checkPattern("[0-9]{10}","1234567898" );


        //valid email
        checkPattern("^[a-zA-Z0-9#]+@[a-zA-Z0-9#]+\\.[a-zA-Z0-9#]{2,}$","ygoesh@gmail.com" );

    }
}