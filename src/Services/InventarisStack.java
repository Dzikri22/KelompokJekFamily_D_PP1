package Services;

public class InventarisStack extends StrukturStack {
	protected Barang[] array;
    public InventarisStack(int capacity) {
        super(capacity);
    }

    public void displayStack(String keterangan) {
        System.out.println(keterangan);
        System.out.println("Inventaris (bawah --> atas):");
        for (int i = 0; i < ukuran(); i++) {
            System.out.println(" - " + peekN(i));
        }
        System.out.println();
    }
    
    private String peekN(int i) {
        if (i >= 0 && i < ukuran()) {
            return super.array[i].toString();
        } else {
            return "Index tidak valid";
        }
    }

}


