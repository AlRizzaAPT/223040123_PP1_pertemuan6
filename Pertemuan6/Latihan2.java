package Pertemuan6;

public class Latihan2 {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        // Tambah elemen 5 di akhir list
        list.addHead(5);
        // Tambah elemen 4 di akhir list
        list.addMid(4,2);
        // Tambah elemen 6 di akhir list
        list.addTail(6);

        // Tampilkan elemen list
        list.displayElement(); 

        // mencari elemen nilai 6
        boolean found = list.find(6);
        System.out.println("");
        System.out.print(found); 
    }
}

