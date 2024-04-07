package com.eps02;
//constructor


//class tanpa contructor/class polos
class polos{
    String dataString;
    int dataInteger;
}

//class dengan constructor
class Mahasiswa{
    String nama;
    String jurusan;
    double IPK;

    //constructor dipanggil saat object pertama kali dibuat
    // Mahasiswa(){
    //     System.out.println("ini constructor");
    // }

    //constructor dengan parameter
    Mahasiswa(String inputNama, String inputJurusan, double inputIPK){
        nama = inputNama;
        jurusan = inputJurusan;
        IPK = inputIPK;

        System.out.println(nama);
        System.out.println(jurusan);
        System.out.println(IPK);
    }
}

public class main {
    public static void main(String[] args) {
        
        Mahasiswa mahasiswa1 = new Mahasiswa("asep", "informatika", 3.5);
        Mahasiswa mahasiswa2 = new Mahasiswa("dejavu", "FK", 3.9);




    // polos objectPolos = new polos();
    // objectPolos.dataString = "polos";
    // objectPolos.dataInteger = 100;

    // System.out.println(objectPolos.dataString);
    // System.out.println(objectPolos.dataInteger);
}
}
