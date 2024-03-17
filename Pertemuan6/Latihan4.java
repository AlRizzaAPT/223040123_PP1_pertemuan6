package Pertemuan6;

public class Latihan4 {
	 public static void main(String[] args) {
	        StrukturList list = new StrukturList();

	        // elemen list berisi (7, 6, 4, 2, 3)
	        list.addHead(7);
	        list.addMid(6,2);
	        list.addMid(4,3);
	        list.addTail(2);
	        list.addTail(3);

	        // Tampilan elemen list
	        list.displayElement(); 

	        // Tampilan size elemen list
	        int size = list.size();
	        System.out.println();
	        
	        System.out.println(size); 
	    }
	

	
}


