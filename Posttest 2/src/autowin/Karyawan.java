package autowin;

public class Karyawan {
    private int id;
    private String nama;
    private String posisi;

    public Karyawan(int id, String nama, String posisi) {
        this.id = id;
        this.nama = nama;
        this.posisi = posisi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nama: " + nama + ", Posisi: " + posisi;
    }

}
