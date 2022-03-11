package jurnal3;

import java.util.*;

public class Main {
    public static void main(String[] args) { SinglyLinked<Organisasi> linkedList = new SinglyLinked<>();
        Scanner input = new Scanner(System.in);

        String inputNim, inputNama, inputProdi, opsi;
        int beranda=0;
        int opsiHapus=0;

        while(beranda!=4){
            System.out.println("Pilih Masukkan:");
            System.out.println("1. Input data");
            System.out.println("2. Hapus data");
            System.out.println("3. Cek list anggota");
            System.out.println("4. Keluar");
            beranda=input.nextInt();

            if(beranda==1){
                System.out.println("Masukkan data anggota organisasi");
                System.out.println("Tuliskan nim, nama dan Prodi mahasiswa");
                inputNim=input.next();
                inputNama=input.next();
                inputProdi=input.next();

                System.out.println("Tambahkan sebuah data di awal list? (y/n))");
                opsi=input.next();
                if(opsi.equals("y")){
                    linkedList.insertAtFront(new Organisasi(inputNim, inputNama, inputProdi));
                }
                if(opsi.equals("n")){
                    linkedList.insertAtBack(new Organisasi(inputNim, inputNama, inputProdi));
                }
            }
            else if(beranda==2){
                System.out.println("Pilih opsi data yang akan dihapus:");
                System.out.println("1. Data Awal");
                System.out.println("2. Data Akhir");
                opsiHapus=input.nextInt();
                if(opsiHapus==1){
                    linkedList.removeFromFront();
                    linkedList.print();
                }
                else if(opsiHapus==2){
                    linkedList.removeFromBack();
                    linkedList.print();
                }
            }
            else if(beranda==3){
                linkedList.print();
            }
        }
    }
}