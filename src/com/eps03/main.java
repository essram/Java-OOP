package com.eps03;

class Mahasiswa{
    //data member
    String nama;
    String NIM;

    //contructor
    Mahasiswa(String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;
    }

    //method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM  : " + this.NIM);
    }

    //method tanpa return dan dengan parameter
    void setNama(String nama){
        this.nama = nama;
    }

    // method dengan return tapi tidak ada parameternya
    String getNama(){
        return this.nama;
    }
    String getNIM(){
        return this.NIM;
    }

    //method dengan return dan dengan parameter
    String sayHi(String message){
        return message + " juga, nama saya adalah "+ this.nama;
    }
}
public class main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("ram", "16722335");
        // method
        mahasiswa1.show();
        mahasiswa1.setNama("jala");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        String data = mahasiswa1.sayHi("halo");
        System.out.println(data);
    }
}
