public class Nodeuas {
    BarangRental data;
    Nodeuas prev, next;

    Nodeuas(Nodeuas prev, BarangRental data, Nodeuas next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}