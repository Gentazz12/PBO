package autowin;

public final class Teknisi extends Karyawan {
    private int jumlahProyek;

    public Teknisi(final int id, final String nama, final int jumlahProyek) {
        super(id, nama, "Teknisi");
        this.jumlahProyek = jumlahProyek;
    }

    public int getJumlahProyek() {
        return jumlahProyek;
    }

    public void setJumlahProyek(final int jumlahProyek) {
        this.jumlahProyek = jumlahProyek;
    }

    @Override
    public String toString() {
        return super.toString() + ", Jumlah Proyek: " + jumlahProyek;
    }

    @Override
    public void perbaruiKaryawan(final String namaBaru, final String posisiBaru) {
        setNama(namaBaru);
        setPosisi(posisiBaru);
    }
}

