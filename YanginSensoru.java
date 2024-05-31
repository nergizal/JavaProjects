
import java.util.Scanner;

public class YanginSensoru {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yangın Sensörü Simülasyonu");

        // Sıcaklık değerini al
        System.out.print("Sıcaklık Değerini Girin (C°): ");
        
        double sicaklik = scanner.nextDouble();

        // Duman yoğunluğunu al
        System.out.print("Duman Yoğunluğunu Girin (%): ");
        
            System.out.print("Duman Yoğunluğunu Girin (%): ");
        
        double dumanYogunlugu = scanner.nextDouble();

        // Yangın durumunu kontrol et
        kontrolEtYanginDurumu(sicaklik, dumanYogunlugu);

        scanner.close();
    }

    private static void kontrolEtYanginDurumu(double sicaklik, double dumanYogunlugu) {
        if (sicaklik >= 50 && dumanYogunlugu >= 50) {
            System.out.println("Yangın algılandı! Acil durum ekiplerine haber veriliyor.");
        } else if (sicaklik >= 50) {
            System.out.println("Yüksek sıcaklık algılandı. Yangın riski olabilir.");
        } else if (dumanYogunlugu >= 50) {
            System.out.println("Yüksek duman yoğunluğu algılandı. Yangın riski olabilir.");
        } else {
            System.out.println("Herhangi bir yangın belirtisi algılanmadı.");
        }
    }
}
