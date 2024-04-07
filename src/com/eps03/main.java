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
        System.out.println(nama);
        System.out.println(NIM);
    }
}
public class main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("asep", "101");
    }
}
