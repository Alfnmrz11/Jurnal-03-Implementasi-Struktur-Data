package jurnal3;

public class Organisasi {
    private String nim;
    private String nama;
    private String prodi;

    public Organisasi(String nim, String nama, String kelas) {
        this.nim = nim; this.nama = nama; this.prodi = kelas;
    }

    public String getNim() {
        return nim;
    }

    @Override
    public String toString() {
        return	"Organisasi {nim='" + nim + '\'' + ", nama='" + nama + '\'' + ", prodi='" + prodi + '\'' + "}" ;
    }
}
