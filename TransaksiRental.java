public class TransaksiRental {
    int kodeTransaksi, lamaPinjam;
    String namaPeminjam;
    Double totalBiaya;
    BarangRental br;

    public TransaksiRental(int kodeTransaksi, String namaPeminjam, int lamaPinjam, Double totalBiaya, BarangRental br) {
        this.kodeTransaksi = kodeTransaksi;
        this.namaPeminjam = namaPeminjam;
        this.lamaPinjam = lamaPinjam;
        this.totalBiaya = totalBiaya;
        this.br = br;
    }

    
}