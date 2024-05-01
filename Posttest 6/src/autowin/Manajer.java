package autowin;

public final class Manajer extends Karyawan {
    private String departemen;

    public Manajer(final int id, final String nama, final String departemen) {
        super(id, nama, "Manajer");
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(final String departemen) {
        this.departemen = departemen;
    }

    @Override
    public String toString() {
        return super.toString() + ", Departemen: " + departemen;
    }

    @Override
    public void perbaruiKaryawan(final String namaBaru, final String posisiBaru) {
        setNama(namaBaru);
        setPosisi(posisiBaru);
    }
}
