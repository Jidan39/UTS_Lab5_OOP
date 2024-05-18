import java.util.Scanner;

//Hewan sebagai Superclass
class Hewan {
    private String nama;
    private int umur;

    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setNama(int umur) {
        this.umur = umur;
    }

    public void buatSuara() {
        System.out.println("Rawr");
    }
}

class Kucing extends Hewan {
    private String ras;

    public Kucing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
    }

    @Override
    public void buatSuara() {
        System.out.println("Miaw Miaw Nigg");
    }

    public void buatSuara(String mood) {
        if (mood.equalsIgnoreCase("Senang")) {
            System.out.println("Lompat Lompat");
        } else {
            System.out.println("Bola Bali Nggo Dolanan:(");
        }
    }

    public String getRas() {
        return ras;
    }

    public void setKawin(String breed) {
        this.ras = ras;
    }
}

