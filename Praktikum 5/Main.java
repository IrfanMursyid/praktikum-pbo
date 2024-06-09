package Tugas;

import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String str = "abc123";

        String regex = "^[a-zA-Z0-9]*$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(str);

        if (matcher.matches()) {
            System.out.println("String merupakan gabungan angka dan karakter.");
        } else {
            System.out.println("String tidak merupakan gabungan angka dan karakter.");
        }
    }
}
//Muhammad Irfan Mursyid
//24060122130046