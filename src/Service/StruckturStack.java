package Tubes;

public class StrukturStack {
    
    protected Barang[] array;
    private int capacity, TOP;
    public final int MIN = -1;
    
    public StrukturStack(int capacity) {
        array = new Barang[capacity];
        this.capacity = capacity;
        TOP = MIN;
    }
    
    public boolean isEmpty() {
        return TOP == MIN;
    }
    
    public boolean isFull() {
        if (TOP >= capacity - 1) {
            return true;
        } else {
            return false;
        }
    }
    

    public void push(Barang data) {
        if (!isFull()) {
            TOP++;
            array[TOP] = data;
        }
    }
    
    public Barang pop() {
        if (isEmpty()) {
            System.out.println("Produk kosong! tidak ada produk sebelumnya!");
            return null;
        } else {
            Barang temp = array[TOP];
            TOP--;
            return temp;
        }
    }
    
    public Barang Top() {
        if (isEmpty()) {
            System.out.println("Produk kosong! tidak ada produk sebelumnya!");
            return null;
        } else {
            return array[TOP];
        }
    }
    
    public int ukuran() {
        return TOP + 1;
    }
    
    
    public void display() {
        System.out.println("\n=== RIWAYAT JAWABAN ===");
        System.out.println("ukuran stack : " + ukuran());
        System.out.println("Kosong ? " + isEmpty());
        System.out.println("Penuh ? " + isFull());
        // Display stack contents
        if (!isEmpty()) {
            System.out.println("Isi stack:");
            for (int i = TOP; i >= 0; i--) {
                System.out.println((i + 1) + ". " + array[i].toString());
            }
        }
        System.out.println("=========================");
    }
}