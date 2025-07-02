public class zwei {

public static void main(String []args) {

    //String = im Code definierter Text 
    //args = werden beim ausführen übergeben/geschrieben hinter dem Ausführbefehl
    //zu viele args werden ignoriert & zu wenige args sind Fehler
    System.out.println("Hello " + args[0] + "and " + args[1]);


    // Deklaration und Initialisierung einer Variable von Typ int
    int a = 1;

    // deklaration
    int b, c;

    // Initialisierung
    b = 99;

    c = a + b;

    // Überschreibt c mit neuem Wert
    c = c + 1;

    // Zahl als Arg übergeben bei Programm ausführen
    double x = Double.parseDouble(args[0]);
    double y = Double.parseDouble(args[1]);

    // double Zahlen als int zusammenrechnen (sonst Fehler)
    double z = (int) (x + y) ;

    System.out.print("C ergibt" + c);
}

//Variablennamen Kleinbuchstaben Anfang  // Klasse(Programm) Großbuchstaben Anfang  // Konstanten = ALLES GROSS

//Algo = Handlungsanweisung aus definierten, endlichen Schritten zum Lösen von Problem
//datentyp = int, String
//Identifier = Name mit dem Variablen, Methoden, Klassen, Schnittstellen angesprochen werden
//Schlüsselwörter= int, class, static, public, void etc

// % 3     Modulo Operator (Rest von Geteilt durch 3 Rechnung)
// double ist genauer als float (KommaPunktZahlen)
// Hexadezimal(1-9 A B C d E F) 0xAFFE = 45054

}