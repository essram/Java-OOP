package com.eps03;
//methods

class Mahasiswa{
    //Data member
    String nama;
    String NIM;

    //constructor
    Mahasiswa(String inputNama, String inputNIM){
        nama = inputNama;
        NIM = inputNIM;
        
    }
}
public class main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("asep", "101");
        System.out.println(mahasiswa1.nama);
    }


}
