package com.eps01;


//membuat class sebagai template
class Mahasiswa {
    String nama;
    String jurusan;
    double IPK;
    int umur;
}
public class main {
    public static void main(String[] args) {
        //instansiasi/membuat objek

        //object 1
         Mahasiswa mahasiswa1 = new Mahasiswa();
         mahasiswa1.nama = "asep";
         mahasiswa1.jurusan = "informatika";
         mahasiswa1.IPK = 3.5;
         mahasiswa1.umur = 20;

         System.out.println("Nama : " + mahasiswa1.nama);
         System.out.println("jurusan : " + mahasiswa1.jurusan);
         System.out.println("IPK : " + mahasiswa1.IPK);
         System.out.println("umur : " + mahasiswa1.umur);

         System.out.println();
         //object 2
         Mahasiswa mahasiswa2 = new Mahasiswa();
         mahasiswa2.nama = "dejavu";
         mahasiswa2.jurusan = "FK";
         mahasiswa2.IPK = 3.9;
         mahasiswa2.umur = 21;

         System.out.println("Nama : " + mahasiswa2.nama);
         System.out.println("jurusan : " + mahasiswa2.jurusan);
         System.out.println("IPK : " + mahasiswa2.IPK);
         System.out.println("umur : " + mahasiswa2.umur);
    }
}
