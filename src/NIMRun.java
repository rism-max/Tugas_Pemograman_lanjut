import java.util.Scanner;
public class NIMRun {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=====SELAMAT DATANG DI PROGRAM KAMI=====");
        System.out.println("========================================");
        System.out.println("Untuk mengetahui informasi dari NIM Anda");
        System.out.print("\nSilahkan Masukkan NIM Anda =");
        String nim = input.nextLine();
        NIM objNim = new NIM();
        objNim.setNim(nim);
        System.out.println("Dari NIM Anda kami mengetahui bahwa :");
        System.out.println("Jenjang Pendidikan = "+objNim.getJenjang());
        System.out.println("Tahun Masuk        = "+objNim.getTahun());
        System.out.println("Fakultas           = "+objNim.getFakultas());
        System.out.println("Jurusan            = "+objNim.getJurusan());
        System.out.println("Jenis kelamin      = "+objNim.getJenisKelamin());
        System.out.println("Nomor Urut.        = "+objNim.getNomorUrut());


    }

}