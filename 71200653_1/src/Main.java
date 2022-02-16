import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String jenis,mesin;
        Scanner inp = new Scanner(System.in);
        System.out.println("kode lampu lalu lintas saat ini: ");
        int kodeLampu = inp.nextInt();

        if (kodeLampu == 1) {
            System.out.println("Hijau");
        }
        if (kodeLampu == 2) {
            System.out.println("Kuning");
        }
        if (kodeLampu == 3) {
            System.out.println("Merah");
        }
    }
}
