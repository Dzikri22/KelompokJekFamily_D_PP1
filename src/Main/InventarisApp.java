import java.util.Scanner;

public class InventarisApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InventarisStack stack = new InventarisStack(3);
        int pilihan;

        do {
            System.out.println("=== Menu Inventaris Produk Kue Lebabaran ===");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Hapus Produk Terbaru");
            System.out.println("3. Lihat Produk Terbaru");
            System.out.println("4. Tampilkan Semua Produk");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            

            pilihan = getValidMenuChoice(scanner);

            switch (pilihan) {
                case 1:
                	
                    System.out.print("Masukkan nama kue: ");
                    String nama_barang = scanner.nextLine();
                    
                    System.out.print("Keterangan Kue: ");
                    String keterangan_kue = scanner.nextLine();
                    
                    System.out.print("Harga: ");
                    String harga = scanner.nextLine();


                    if (stack.isFull()) {
                        System.out.println("Produk kue penuh! tidak bisa menambahkan produk kue");
                    } else {

                        Barang barang = new Barang(nama_barang, keterangan_kue,harga);
                        stack.push(barang);
                        System.out.println("Produk kue berhasil ditambahkan!");
                    }
                    break;

                case 2:
                    Barang removed = stack.pop();
                    if (removed != null) {
                        System.out.println("Produk kue yang dihapus: " + removed);
                    }
                    break;

                case 3:
                    Barang top = stack.Top();
                    if (top != null) {
                        System.out.println("Produk kue teratas: " + top);
                    }
                    break;

                case 4:
                	stack.display(); // dari StrukturStack → atas ke bawah
                	stack.displayStack("Tampilan dari bawah ke atas:"); // dari InventarisStack
                    break;

                case 5:
                    System.out.println("Terima kasih.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 5);

        scanner.close();
    }


    private static int getValidMenuChoice(Scanner scanner) {
        while (true) {
            try {
                String input = scanner.nextLine().trim();
                

                if (input.isEmpty()) {
                    System.out.print("Input tidak boleh kosong! Pilih menu (1-5): ");
                    continue;
                }
                
                int choice = Integer.parseInt(input);
                

                if (choice >= 1 && choice <= 5) {
                    return choice;
                } else {
                    System.out.print("Pilihan harus antara 1-5! Pilih menu (1-5): ");
                }
                
            } catch (NumberFormatException e) {
                System.out.print("Input tidak valid! Masukkan angka 1-5: ");
            }
        }
    }
    
}

