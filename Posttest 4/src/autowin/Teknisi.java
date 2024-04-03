package autowin;

public class Teknisi extends Karyawan {
    private int jumlahProyek;

    public Teknisi(int id, String nama, int jumlahProyek) {
        super(id, nama, "Teknisi");
        this.jumlahProyek = jumlahProyek;
    }

    public int getJumlahProyek() {
        return jumlahProyek;
    }

    public void setJumlahProyek(int jumlahProyek) {
        this.jumlahProyek = jumlahProyek;
    }

    @Override
    public String toString() {
        return super.toString() + ", Jumlah Proyek: " + jumlahProyek;
    }
}