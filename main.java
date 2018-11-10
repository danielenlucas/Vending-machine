import java.util.Scanner;

public class Main {


    public static void Main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //integers
        int drinken;
        drinken = 4;

        //String[]
        String[] commandos = {"ja",
                "nee",
                "help"};

        //strings
        String drink = "Hier is uw drinken";
        String drinken = "cola = 1", "666 energy = 2", "melk = 3", "fanta = 4";
        String drinkvraag = "Wilt u wat drinken?";
        String eet = "Wat wilt u eten?";
        String eten = "sandwich = 1", "ijsje = 2", "banaan = 3", "appel = 4", "snoepje = 5";
        String eetvraag = "Wilt u wat eten?";
        String begin = "Alstublieft! ik hoop dat de";
        String mid = "en de";
        String einde = "smaakt! :)";

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


        while (drinken == false) {

            System.out.println(drinkvraag);

            switch (drinken) {
                case 1

                    System.out.println(begin + case 1 + einde);
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
                            "  \"888888PP\"'        `8\"\"\"\"\"\"8   \"888PP'  `888P'  `88P\"88P\"8m\"\n")
                     drinken = true;
                    break;
            }

            }


        }
    }
}
