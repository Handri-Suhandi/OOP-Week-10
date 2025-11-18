package Upcasting;

public class Main {
    public static void main(String[] args) {

        Pekerja pekerja = new Pekerja();
        pekerja.tanyaIndentitas();

        pekerja = new CEO();
        pekerja.tanyaIndentitas();

        Karyawan karyawan = new Karyawan();
        pekerja = (Pekerja)karyawan;
        pekerja.tanyaIndentitas();
    }
}
