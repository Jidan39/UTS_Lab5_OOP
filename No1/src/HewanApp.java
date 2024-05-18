import java.util.Scanner;

public class HewanApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama kocheng: ");
        String namaKucing = scanner.nextLine();
        System.out.print("Masukkan umur kocheng: ");
        int umurKucing = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Masukkan ras kocheng: ");
        String rasKucing = scanner.nextLine();

        Kucing kucing = new Kucing(namaKucing, umurKucing, rasKucing);

        kucing.buatSuara();

        System.out.print("Masukkan Mood Kochingnya Wak(Senang/Sedih): ");
        String mood = scanner.nextLine();
        kucing.buatSuara(mood);

        System.out.println("Nama Koching Nya Yaitu: " + kucing.getNama());
        System.out.println("Umur Koching Nya Yaitu: " + kucing.getUmur());
        System.out.println("Ras Koching Nya Yaitu: " + kucing.getRas());

        System.out.print("Masukkan Nama Koching Yang Baru Wak: ");
        kucing.setNama(scanner.nextLine());
        System.out.println("Nama Koching Yang Baru Yaitu: " + kucing.getNama());

        scanner.close();
    }
}