import static java.lang.Character.isLetter;
import static java.lang.Character.isLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

public class Main {

    public static void main(String[] args) {

        Helper helper = new Helper();

        if (! helper.isArgCorrect(args)){
            System.out.println("print the key next time");
            return;
        }

        /**
         * Приводим полученный ключ
         * к одному регистру(например, к нижнему)
         **/
        String key = toLowerCase(args[0]);

        String text = helper.getString();

        for(int i = 0, j = 0; i < text.length(); i++){
            if(isLetter(text.charAt(i))){
                if(isLowerCase(text.charAt(i))){
                    System.out.print((char) ('a' + ((text.charAt(i)-'a' + key.charAt(j % key.length())-'a') % 26)));
                }else{
                    System.out.print((char)('A' + ((text.charAt(i)-'A' + key.charAt(j % key.length())-'A') % 26)));
                }
                j++;
            }else{
                System.out.print(text.charAt(i));
            }
        }
        System.out.println();
    }
}
