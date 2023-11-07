// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// Press Alt+Enter with your caret at the highlighted text to see how
// IntelliJ IDEA suggests fixing it.
// Press Shift+F10 or click the green arrow button in the gutter to run the code.
// Press Shift+F9 to start debugging your code. We have set one breakpoint
// for you, but you can always add more by pressing Ctrl+F8.
import java.util.Scanner;
import currency.*;
public class Main {
    public static void main(String[] args) {
        USDConverter usdConverter = new USDConverter();
        GBPConverter gbpConverter = new GBPConverter();
        YENConverter yenConverter = new YENConverter();
        RUPConverter rupConverter = new RUPConverter();
        CHYConverter chyConverter = new CHYConverter();
        EURConverter eurConverter = new EURConverter();
        Scanner input = new Scanner(System.in);

        System.out.println("""
                Enter the currency you would like to start with:
                Type out the currency code (GBP, USD ect)
                
                GBP £
                USD $
                EUR €
                JPY ¥
                RUP ₹
                CHY ¥
                --------------------------------------------------
                """);
        String Code1 = input.next().toUpperCase();
        System.out.println("""
                Please enter how much of this currency you would like to convert below
                -----------------------------------------------------------------------
                """);
        double amount = input.nextDouble();
        String Code2;
        switch (Code1){
            case "GBP":
                System.out.println("""
                Enter the currency you would like to convert with:
                Type out the currency code (GBP, USD ect)
                --------------------------------------------------
                USD $
                EUR €
                JPY ¥
                RUP ₹
                CHY ¥
                """);
                Code2 = input.next().toUpperCase();
                switch (Code2){
                    case "USD":
                        System.out.println("$" + gbpConverter.GBPtoUSD(amount));
                        break;
                    case "EUR":
                        System.out.println("€" + gbpConverter.GBPtoEUR(amount));
                        break;
                    case "JPY":
                        System.out.println("¥" + gbpConverter.GBPtoJPY(amount));
                        break;
                    case "RUP":
                        System.out.println("₹" + gbpConverter.GBPtoRUP(amount));
                        break;
                    case "CHY":
                        System.out.println("¥" + gbpConverter.GBPtoCHY(amount));
                        break;
                    default:
                        System.out.println("Enter a valid currency code");
                }
            case "USD":
                System.out.println("""
                Enter the currency you would like to convert with:
                Type out the currency code (GBP, USD ect)
                --------------------------------------------------
                GBP £
                EUR €
                JPY ¥
                RUP ₹
                CHY ¥
                """);
                Code2 = input.next().toUpperCase();
                switch (Code2){
                    case "GBP":
                        System.out.println("£" + usdConverter.USDtoGBP(amount));
                        break;
                    case "EUR":
                        System.out.println("€" + usdConverter.USDtoEUR(amount));
                        break;
                    case "JPY":
                        System.out.println("¥" + usdConverter.USDtoJPY(amount));
                        break;
                    case "RUP":
                        System.out.println("₹" + usdConverter.USDtoRUP(amount));
                        break;
                    case "CHY":
                        System.out.println("¥" + usdConverter.USDtoCHY(amount));
                        break;
                    default:
                        System.out.println("Enter a valid currency code");
                }
            case "EUR":
                System.out.println("""
                Enter the currency you would like to convert with:
                Type out the currency code (GBP, USD ect)
                --------------------------------------------------
                USD $
                GBP £
                JPY ¥
                RUP ₹
                CHY ¥
                """);
                Code2 = input.next().toUpperCase();
                switch (Code2){
                    case "USD":
                        System.out.println("$" + eurConverter.EURtoUSD(amount));
                        break;
                    case "GBP":
                        System.out.println("£" + eurConverter.EURtoGBP(amount));
                        break;
                    case "JPY":
                        System.out.println("¥" + eurConverter.EURtoJPY(amount));
                        break;
                    case "RUP":
                        System.out.println("₹" + eurConverter.EURtoRUP(amount));
                        break;
                    case "CHY":
                        System.out.println("¥" + eurConverter.EURtoCHY(amount));
                        break;
                    default:
                        System.out.println("Enter a valid currency code");
                }
            case "RUP":
                System.out.println("""
                Enter the currency you would like to convert with:
                Type out the currency code (GBP, USD ect)
                --------------------------------------------------
                USD $
                EUR €
                GBP £
                JPY ¥
                CHY ¥
                """);
                Code2 = input.next().toUpperCase();
                switch (Code2){
                    case "USD":
                        System.out.println("$" + rupConverter.RUPtoUSD(amount));
                        break;
                    case "EUR":
                        System.out.println("€" + rupConverter.RUPtoEUR(amount));
                        break;
                    case "GBP":
                        System.out.println("£" + rupConverter.RUPtoGBP(amount));
                        break;
                    case "JPY":
                        System.out.println("₹" + rupConverter.RUPtoJPY(amount));
                        break;
                    case "CHY":
                        System.out.println("¥" + rupConverter.RUPtoCHY(amount));
                        break;
                    default:
                        System.out.println("Enter a valid currency code");
                }
            case "JPY":
                System.out.println("""
                Enter the currency you would like to convert with:
                Type out the currency code (GBP, USD ect)
                --------------------------------------------------
                USD $
                EUR €
                GBP £
                RUP ₹
                CHY ¥
                """);
                Code2 = input.next().toUpperCase();
                switch (Code2){
                    case "USD":
                        System.out.println("$" + yenConverter.JPYtoUSD(amount));
                        break;
                    case "EUR":
                        System.out.println("€" + yenConverter.JPYtoEUR(amount));
                        break;
                    case "GBP":
                        System.out.println("£" + yenConverter.JPYtoGBP(amount));
                        break;
                    case "RUP":
                        System.out.println("₹" + yenConverter.JPYtoRUP(amount));
                        break;
                    case "CHY":
                        System.out.println("¥" + yenConverter.JPYtoCHY(amount));
                        break;
                    default:
                        System.out.println("Enter a valid currency code");
                }
            case "CHY":
                System.out.println("""
                Enter the currency you would like to convert with:
                Type out the currency code (GBP, USD ect)
                --------------------------------------------------
                USD $
                EUR €
                GBP £
                RUP ₹
                JPY ¥
                """);
                Code2 = input.next().toUpperCase();
                switch (Code2){
                    case "USD":
                        System.out.println("$" + chyConverter.CHYtoUSD(amount));
                        break;
                    case "EUR":
                        System.out.println("€" + chyConverter.CHYtoEUR(amount));
                        break;
                    case "GBP":
                        System.out.println("£" + chyConverter.CHYtoGBP(amount));
                        break;
                    case "RUP":
                        System.out.println("₹" + chyConverter.CHYtoRUP(amount));
                        break;
                    case "CHY":
                        System.out.println("¥" + chyConverter.CHYtoJPY(amount));
                        break;
                    default:
                        System.out.println("Enter a valid currency code");
                }
                break;
            default:
                System.out.println("Enter a valid currency code");
        }



        // create different currencies as classes
        // create different conversion rates between them all
        //
    }
}