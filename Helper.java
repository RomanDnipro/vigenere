import java.util.Scanner;
import static java.lang.Character.isLetter;

/**
 * Created by Роман on 15.03.2017.
 */
class Helper {

    /**
     * Проверяем аргумент-ключ
     */
    boolean isArgCorrect(String[] args){
        if (args.length != 1){
            return false;
        }
        for (int i = 0; i < args[0].length(); i++){
            if (!isLetter(args[0].charAt(i))){
                return false;
            }
        }
        return true;
    }

    /**
     * Cчитывает всю введенную строку(включая пробелы)
     */
    String getString(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
