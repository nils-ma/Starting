public class dice6 {

    public static void main(String []args) {

        double randomNumber = Math.random();  // inklusive 0 [0.0 , 1.0) exklusive 1
        double correctLength = randomNumber * 6;  // [0.0 , 6.0)
        double correctInterval = correctLength + 1;  // [1.0 , 7.0) exklusive 7
        int correctResult = (int) correctInterval;  // Ausgabe als int

        // Einfachere Option in 1 Zeile
        int result = (int) (6 * Math.random() + 1);


        // Zählen wie oft bis zur 6
        int resultNeu;
        int numberOfRolls = 0;

        do{
            int resultNeu = (int) (6 * Math.random() + 1);
            numberOfRolls = numberOfRolls + 1;
        } while(resultNeu != 6);


        System.out.println("Würfelergebnis ist " + correctResult);


    }
}