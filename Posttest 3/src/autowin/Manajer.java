package autowin;

public class Manajer extends Karyawan {
    private String departemen;

    public Manajer(int id, String nama, String departemen) {
        super(id, nama, "Manajer");
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    @Override
    public String toString() {
        return super.toString() + ", Departemen: " + departemen;
    }
}
