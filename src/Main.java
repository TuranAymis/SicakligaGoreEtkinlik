import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Sıcaklık 5'den küçük ise "Kayak" yapmayı öner.
        //Sıcaklık 5 ve 15 arasında ise "Tiyatro" etkinliğini öner.
        //Sıcaklık 15 ve 25 arasında ise "Mangal" etkinliğini öner.
        //Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

        Scanner scan = new Scanner(System.in);
        double temperature;
        String event;

        System.out.print("Sıcaklık değerini giriniz(C°): ");
        temperature = scan.nextDouble();

        if (temperature < 5){
            event = "Kayak yapmak.";
        } else if (temperature < 15 ) {
            event = "Tiyatroya gitmek.";
        } else if (temperature <= 25 ) {
            event = "Mangal yapmak.";
        } else {
            event = "Yüzmeye gitmek.";
        }
        System.out.println("Önerilen etkinlik: " + event);
    }
}