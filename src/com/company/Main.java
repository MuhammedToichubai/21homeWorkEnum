package com.company;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Кундорго enum тузунуз (Monday, Tuesday ...)
//        Бир кунду белгилениз консолдон.
//        Эгер Monday болсо - анда "Дуйшомбу куну жава окуйм" же
//        Tuesday болсо - анда "Шейшемби куну англис тили сабагын окуйм"
//        деп кунго жараша кайсы сабакты окуганынызды консольго чыгарыныз.
//        Жуманын кундорун кыргыз тилинде корсотунуз.
        System.out.println("Куш келдинниз Мухаммеддин жазган кодуна.\nКонсолдон бир кунду жазыныз(мисалы:'жума').Же болбосо башка кунду.");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        Day day = null;
        try {
            day = Day.valueOf(str.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException e) {
            System.out.println("YOU WRITE WRONG!//СИЗ КАТА ЖАЗЫП ЖАТАСЫЗ!");
        }

        if (day != null) {
            switch (day) {
                case ДУЙШОМБУ -> System.out.println("18:00 | Theory lesson | Space x.");
                case ШЕЙШЕМБИ -> System.out.println("15:30 | English lesson | Google.");
                case ШАРШЕМБИ -> System.out.println("18:00 | Theory lesson | Facebook.");
                case БЕЙШЕМБИ -> System.out.println("11:00 | Practice lesson | Facebook\n15:30 Soft skills lesson | Space x.");
                case ЖУМА -> System.out.println("18:00 | Theory lesson | Space x. ");
                case ИШЕМБИ -> System.out.println("No lessons for this day.");
                case ЖЕКШЕМБИ -> System.out.println("Rest please, sunday is a day off.");
            }
            System.out.println(day);
        }else {
            System.out.println("NO SUCH A DAY!//МЫНДАЙ КҮН ЖОК!");
        }




    }
}
