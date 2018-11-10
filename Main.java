import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        //strings
        String cijfer = "typ A.U.B het cijfer van het corresponderende product in";
        String vraag_1 = "Wilt u misschien wat drinken?";
        String drinkkeuze = "cola = 1, 666_energy = 2, melk = 3, fanta = 4";
        String drink = "Hier is uw drinken";
        String drinkvraag = "Wat wilt u drinken?";
        String eetvraag = "Wilt u nog wat eten?";
        String eet = "Wat wilt u eten?";
        String eetkeuze = "sandwich = 1, ijsje = 2, banaan = 3, appel = 4, snoepje = 5";
        String begin = "Alstublieft! ik hoop dat de";
        String mid = "en de";
        String einde = "smaakt! :)";
        String doei = "Mkayy, dan niet, tot de volgende keer bröther! vergeet de lööps niet..";
        String fout = "bröther! kies ja of nee";

        //drink strings
        String cola = "Coca Cola";
        String fanta = "Fanta";
        String energy = "666 Energy";
        String melk = "Melk";

        //eet strings
        String sandwich = "Sandwich";
        String ijs = "Ijsje";
        String banaan = "Banaan";
        String appel = "Appel";
        String snoep = "Snoepje";


            System.out.println(vraag_1);
            Scanner Scan = new Scanner(System.in);
            String Input = Scan.nextLine();

            switch (Input.toLowerCase()) {

                case "nee":
                    System.out.println(doei);
                    break;

                case "ja":
                    System.out.println(drinkvraag);
                    System.out.println(drinkkeuze);
                    System.out.println(cijfer);
                    Input = Scan.nextLine();

            }
                switch (Integer.parseInt(Input)){


                case 1:

                    System.out.println(begin + "\t" + cola + "\t" + einde);
                    System.out.println("    __                              ___   __        .ama     ,\n" +
                            "      ,d888a                          ,d88888888888ba.  ,88\"I)   d\n" +
                            "     a88']8i                         a88\".8\"8)   `\"8888:88  \" _a8'\n" +
                            "   .d8P' PP                        .d8P'.8  d)      \"8:88:baad8P'\n" +
                            "  ,d8P' ,ama,   .aa,  .ama.g ,mmm  d8P' 8  .8'        88):888P'\n" +
                            " ,d88' d8[ \"8..a8\"88 ,8I\"88[ I88' d88   ]IaI\"        d8[         \n" +
                            " a88' dP \"bm8mP8'(8'.8I  8[      d88'    `\"         .88          \n" +
                            ",88I ]8'  .d'.8     88' ,8' I[  ,88P ,ama    ,ama,  d8[  .ama.g\n" +
                            "[88' I8, .d' ]8,  ,88B ,d8 aI   (88',88\"8)  d8[ \"8. 88 ,8I\"88[\n" +
                            "]88  `888P'  `8888\" \"88P\"8m\"    I88 88[ 8[ dP \"bm8m88[.8I  8[\n" +
                            "]88,          _,,aaaaaa,_       I88 8\"  8 ]P'  .d' 88 88' ,8' I[\n" +
                            "`888a,.  ,aadd88888888888bma.   )88,  ,]I I8, .d' )88a8B ,d8 aI\n" +
                            "  \"888888PP\"'        `8\"\"\"\"\"\"8   \"888PP'  `888P'  `88P\"88P\"8m\"\n");
                    break;
                case 2:
                    System.out.println(begin + "\t" + energy + "\t" + einde);
                    System.out.println("   , ,, ,                              \n" +
                            "   | || |    ,/  _____  \\.             \n" +
                            "   \\_||_/    ||_/     \\_||             \n" +
                            "     ||       \\_| . . |_/              \n" +
                            "     ||         |  L  |                \n" +
                            "    ,||         |`==='|                \n" +
                            "    |>|      ___`>  -<'___             \n" +
                            "    |>|\\    /             \\            \n" +
                            "    \\>| \\  /  ,    .    .  |           \n" +
                            "     ||  \\/  /| .  |  . |  |           \n" +
                            "     ||\\  ` / | ___|___ |  |     (     \n" +
                            "  (( || `--'  | _______ |  |     ))  ( \n" +
                            "(  )\\|| (  )\\ | - --- - | -| (  ( \\  ))\n" +
                            "(\\/  || ))/ ( | -- - -- |  | )) )  \\(( \n" +
                            " ( ()||((( ())|         |  |( (( () )hjm");
                    break;

                case 3:
                    System.out.println(begin + "\t" + melk + "\t" + einde);
                    System.out.println("   _____\n" +
                            "           j_____j\n" +
                            "          /_____/_\\\n" +
                            "          |_(~)_| |\n" +
                            "          | )\"( | |\n" +
                            "          |(@_@)| |  hjw\n" +
                            "          |_____|,'");

                    break;
                case 4:
                    System.out.println(begin + "\t" + fanta + "\t" + einde);
                    System.out.println("\n" +
                            "───────────────────────────────────\n" +
                            "─────────█████████████████─────────\n" +
                            "──────████░░░░░░░░░░░░░░░████──────\n" +
                            "────███░░░░░░░░░░░░░░░░░░░░░███────\n" +
                            "───██░░░░░░░░░░░░░░░░░░░░░░░░░██───\n" +
                            "──██░░░░░░░░▄███▄░░░░░░░░░░░░░░██──\n" +
                            "─██░░░░░░░▄███████▄░░░░░▄▄░░░░░░██─\n" +
                            "██░░░░░▄▄███████████░░░▄██▄░░░░░░██\n" +
                            "█░░░░░░░▀████████▀░░░██████░███▄░░█\n" +
                            "█░░░▄██▄░░▀▀▀░░░░░░░░░▀███░░░███▄░█\n" +
                            "█░▄█████░░░░░▀██▄█████░░██░▄█████▌█\n" +
                            "█░███▀▀░▄██▄░░░██▀░░▀██░██░██░▀██▌█\n" +
                            "█▐███░░░▀████▄░██░░░░██░██░██░░██▌█\n" +
                            "█▐███▄░░░░████░██░░░░██░██░▀██▄▐█░█\n" +
                            "█▐█████░▄█████░██▌░░▐██░██░░░░░░░░█\n" +
                            "█▐███▀░▄██▀███░██▌░▄███░█░░░░░░░░░█\n" +
                            "█░███░░██░░▀██░███░▀██▀░░░░░░░░░░░█\n" +
                            "█░░██░░███▄░▀█░██▀░░░░░░░░░░░░░░░░█\n" +
                            "██░██░░▀████░▀░░░░░░░░░░░░░░░░░░░██\n" +
                            "─██░▀░░░░▀▀░░░░░░░░░░░░░░░░░░░░░██─\n" +
                            "──██░░░░░░░░░░░░░░░░░░░░░░░░░░░██──\n" +
                            "───██░░░░░░░░░░░░░░░░░░░░░░░░░██───\n" +
                            "────██░░░░░░░░░░░░░░░░░░░░░░░██────\n" +
                            "─────███░░░░░░░░░░░░░░░░░░░███─────\n" +
                            "───────████░░░░░░░░░░░░░████───────\n" +
                            "──────────███████████████──────────\n" +
                            "───────────────────────────────────");
                    break;
                default: System.out.println("typ een getal in alstublieft");
            }

        }
    }


