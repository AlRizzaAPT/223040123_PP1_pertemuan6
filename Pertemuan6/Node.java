package Pertemuan6;

public class Node {
	    private double data; 
	    Node next;
	    // Konstruktor untuk membuat simpul dengan data tertentu
	    public Node(double data) {
	        this.data = data;
	    }
	    // Metode untuk mendapatkan data dari simpul
	    public double getData() {
	        return data;
	    }
	    // Metode untuk mengatur data dari simpul
	    public void setData(double data) {
	        this.data = data;
	    }
	    // Metode untuk mendapatkan simpul berikutnya dalam linked list
	    public Node getNext() {
	        return next;
	    }
	    // Metode untuk mengatur simpul berikutnya dalam linked list
	    public void setNext(Node next) {
	        this.next = next;
	    }
	}

