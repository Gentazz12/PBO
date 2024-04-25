package autowin;

public abstract class Karyawan {
    private int id;
    private String nama;
    private String posisi;

    public Karyawan(final int id, final String nama, final String posisi) {
        this.id = id;
        this.nama = nama;
        this.posisi = posisi;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(final String nama) {
        this.nama = nama;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(final String posisi) {
        this.posisi = posisi;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nama: " + nama + ", Posisi: " + posisi;
    }

    public abstract void perbaruiKaryawan(String namaBaru, String posisiBaru);
}
