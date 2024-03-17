package Pertemuan6;

public class StrukturList {

    private Node HEAD; // Node yang menunjukkan kepala dari linked list

    public StrukturList(Node HEAD) {
        this.HEAD = HEAD; // Menginisialisasi kepala linked list
    }

    public StrukturList() {
		// TODO Auto-generated constructor stub
	}

	// Menambahkan elemen di akhir linked list
    public void addTail(double data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            HEAD = newNode; // Jika linked list kosong, elemen baru menjadi kepala
        } else {
            Node posNode = null;
            Node curNode = HEAD;

            // Menemukan posisi terakhir dalam linked list
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }

            // Menambahkan elemen baru di akhir linked list
            posNode.setNext(newNode);
        }
    }
    
    // Menambahkan elemen di awal linked list
    public void addHead(double data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode; // Jika linked list kosong, elemen baru menjadi kepala
        } else {
            newNode.next = HEAD;
            HEAD = newNode; // Mengubah kepala linked list menjadi elemen baru
        }
    }

    // Menambahkan elemen di tengah linked list pada posisi tertentu
    public void addMid(double data, int position) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode; // Jika linked list kosong, elemen baru menjadi kepala
        } else {
            Node posNode = null;
            Node curNode = HEAD;
            int i = 1;
            if (position == 1) { // Jika memasukkan di awal
                newNode.next = curNode;
                HEAD = newNode;
            } else {
                // Menemukan posisi yang dimaksud
                while (curNode != null && i < position) {
                    posNode = curNode;
                    curNode = curNode.next;
                    i++;
                }
                // Menambahkan elemen baru di posisi yang dimaksud
                posNode.next = newNode;
                newNode.next = curNode;
            }
        }
    }

    // Mengecek apakah linked list kosong
    private boolean isEmpty() {
        return HEAD == null;
    }
    
    // Menampilkan semua elemen dalam linked list
    public void displayElement() {
        Node curNode = HEAD;

        while (curNode != null) {
            System.out.print(curNode.getData() + " "); // Menampilkan data dari setiap elemen
            curNode = curNode.getNext(); // Pindah ke elemen berikutnya
        }
    }  
    
    // Metode untuk menghapus elemen di depan list
    public void removeHead() {
        // Periksa apakah list kosong
        if (isEmpty()) {
            System.out.println("List Kosong"); // Jika iya, tampilkan pesan bahwa list kosong
        } else {
            HEAD = HEAD.getNext(); // Jika tidak, atur HEAD menjadi elemen berikutnya dari HEAD
        }
    }

    // Metode untuk menghapus elemen di akhir list
    public void removeTail() {
        Node preNode = null; // Node sebelum node terakhir
        Node lastNode = null; // Node terakhir

        if (HEAD != null) { // Periksa apakah list tidak kosong
            if (HEAD.getNext() == null) { // Jika hanya ada satu elemen di list
                HEAD = null; // Atur HEAD menjadi null
            } else {
                lastNode = HEAD;
                while (lastNode.getNext() != null) { // Loop untuk mencari node terakhir
                    preNode = lastNode;
                    lastNode = lastNode.getNext();
                }
                preNode.setNext(null); // Hapus referensi ke node terakhir dari node sebelumnya
                lastNode.setNext(null); // Atur referensi node terakhir menjadi null
                lastNode = null; // Kosongkan node terakhir
            }
        }
    }

    // Metode untuk menghapus elemen di tengah list berdasarkan nilai yang diberikan
    public void removeMid(int e) {
        Node preNode = new Node(0); // Node sebelum node yang akan dihapus
        Node tempNode; // Node sementara untuk traversal
        int i; // Variabel untuk indeks elemen yang ditemukan
        boolean ketemu; // Variabel penanda apakah elemen ditemukan atau tidak

        if (isEmpty()) { // Periksa apakah list kosong
            System.out.println("Elemen list kosong"); // Jika iya, tampilkan pesan bahwa list kosong
        } else {
            ketemu = false; // Atur ketemu menjadi false
            i = 1; // Atur nilai awal indeks menjadi 1
            tempNode = HEAD; // Mulai traversal dari HEAD

            // Loop untuk mencari elemen yang akan dihapus
            while (tempNode.getNext() != null && !ketemu) {
                if (tempNode.getData() == e) { // Jika elemen ditemukan
                    ketemu = true; // Atur ketemu menjadi true
                } else {
                    preNode = tempNode; // Geser preNode menjadi tempNode
                    tempNode = tempNode.getNext(); // Geser tempNode ke node berikutnya
                    i++; // Tingkatkan nilai indeks
                }
            }

            // Jika elemen ditemukan
            if (ketemu == true) {
                if (i == 1) { // Jika elemen yang ditemukan adalah elemen pertama
                    HEAD = null; // Atur HEAD menjadi null
                } else {
                    preNode.setNext(tempNode.getNext()); // Atur referensi dari preNode ke node setelah tempNode
                }
            }
        }
    }

    //menampilkan isi linked list
    public void displayElement1() {
        Node curNode = HEAD;

        while(curNode != null) {
            System.out.print(curNode.getData()+ " ");
            curNode = curNode.getNext();
        }
    }

    // method find
    public boolean find(int x) {
        Node curNode = HEAD;
        boolean ketemu = false;
        
        while (curNode != null && !ketemu) {
            if (curNode.getData() == x)
                ketemu = true;
            else
                curNode = curNode.getNext();
        }
        return ketemu;
    }

    	//method size
public int size() {
    Node curNode = HEAD;
    int jumlah = 0;
    while (curNode != null) {
        jumlah++;
        curNode = curNode.getNext();
    }
    return jumlah;
}
		//method removeAll
public void removeAll() {
    Node curNode = HEAD;
    while (curNode != null) {
        Node nextNode = curNode.getNext();
        curNode = null;
        curNode = nextNode;
    }
    HEAD = null;
    if (isEmpty()) {
        System.out.println("List Kosong");
    }
}


}




