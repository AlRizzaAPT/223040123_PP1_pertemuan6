package Pertemuan6;

public class Tugas {
	public static void main(String[] args) {
        StrukturList list = new StrukturList();

        // Tambah elemen sehingga elemen list berisi (4, 3, 7, 8, 1, 9)
        list.addTail(4);
        list.addTail(3);
        list.addTail(7);
        list.addTail(8);
        list.addTail(1);
        list.addTail(9);

        

        // Hapus semua elemen list
        list.removeAll();

        // Tampilkan elemen list setelah penghapusan
        list.displayElement();
    }
}

