public class Mathe{

    public static void main(String []args) {

double number = 3.1415;
double roundednumber = (int) (10 * number) / 10.0;
// 10 mal 3.1415 wird zu int    //   dann durch 10 geteilt und wieder als double ausgegeben


// Maximum Minimum selbst erstellt
double maximum = 0;
double minimum = 0;

double firstArgument = Double.parseDouble(args[0]);
double secondArgument = Double.parseDouble(args[1]);

if (firstArgument < secondArgument){
    firstArgument = minimum;
    secondArgument = maximum;
}
else {
    firstArgument = maximum;
    secondArgument = minimum;
}
System.out.println("Maximum ist" + maximum);
System.out.println("Minimum ist" + minimum);


        // Mathe Funktionen (mit double):
        // Math.max(10, 20) = Maximum also 20
        Math.min
        Math.abs(a) = Betrag von a
        Math.sin(theta) = Sinus von Bogenmaß
        Math.cos(theta) = Cosinus von Bogenmaß
        Math.pow(a, b) = Potenz a^b
        Math.random() = zufällige Zahl [0,1)
        Math.sqrt(a) = Quadratwurzel von a
        Math.E = Eulersche Zahl
        Math.PI = Pi




    }
}