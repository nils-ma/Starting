public class boolLeapYear {

    public static void main(String []args) {

        //   && = und (false    außer beides true, dann true)
        //   || = oder (true     außer beides false, dann false)
        //   ! = Nicht
        //   == Gleich
        //   != Ungleich

        //   do prüft erst nach 1. Ausführung ob noch weiter geht
        //   while prüft vor 1. Ausführung, kann also auch 0 mal laufen



        int year = Integer.parseInt(args[0]);

        // 1.Bedingung durch 4 teilbar --->
        boolean rule1 = year % 4 == 0;

        // 2.Bedingung ,außer durch 100 teilbar --->
        boolean rule2 = year % 100 == 0;

        //3. Bedingung ,außer ist auch wiederrum durch 400 teilbar --->
        boolean rule3 = year % 400 == 0;

        if(rule1 && !rule2 || rule1 && rule3) {
        System.out.println(args[0] +" ist Schaltjahr");
        }

        else{
        System.out.println(args[0] +" ist kein Schaltjahr");
        }




        //   Syntax = gültige Zeichenfolge bzw. "Grammatik" der Sprache  // Syntaxfehler = Compilezeitfehler
        //   Semantik = was bedeutet/macht ein Befehl
    }
}