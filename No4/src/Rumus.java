public class Rumus {
    private double sisi1;
    private double sisi2;
    private double tinggi;

    // Constructor dengan tiga parameter
    public Rumus(double sisi1, double sisi2, double tinggi) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.tinggi = tinggi;
    }

    // Method untuk menghitung luas trapesium
    public double hitungLuas() {
        return 0.5 * (sisi1 + sisi2) * tinggi;
    }

    // Method untuk menghitung keliling trapesium (overloading)
    public double hitungKeliling() {
        return sisi1 + sisi2 + 2 * Math.sqrt(Math.pow((sisi1 - sisi2) / 2, 2) + Math.pow(tinggi, 2));
    }

    public static void main(String[] args) {
        Rumus TrapesiumRawr = new Rumus(6, 9, 6);
        double luasCuy = TrapesiumRawr.hitungLuas();
        double kelilingCuy = TrapesiumRawr.hitungKeliling();
        System.out.println("Luas trapesium: " + luasCuy);
        System.out.println("Keliling trapesium: " + kelilingCuy);
    }
}
