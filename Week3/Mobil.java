public class Mobil {
    String merk;
    String warna;
    int tahunProduksi;
    float harga;

    public void menyala() {
        System.out.println("Mobil Merk " + merk + " menyala.");
    }

    void detail() {
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Harga: " + harga);
    }
}   