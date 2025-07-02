public class dice6 {

    public static void main(String []args) {

        double randomNumber = Math.random();  // inklusive 0 [0.0 , 1.0) exklusive 1
        double correctLength = randomNumber * 6;  // [0.0 , 6.0)
        double correctInterval = correctLength + 1;  // [1.0 , 7.0)
        int correctResult = (int) correctInterval;

        System.out.println("Würfelergebnis ist " + correctResult);


    }
}