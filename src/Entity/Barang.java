public class Barang {
	private String nama_barang, keterangan_kue, harga;
	
	public Barang(String nama_barang, String keterangan_kue, String harga) {
		this.nama_barang = nama_barang;
		this.keterangan_kue = keterangan_kue;
		this.harga = harga;
	
	}
	
	public String getNama_barang() {
		return nama_barang;
	}

	public void setNama_barang(String nama_barang) {
		this.nama_barang = nama_barang;
	}

	public String getketerangan_kue() {
		return keterangan_kue;
	}

	public void setketerangan_kue(String keterangan_kue) {
		this.keterangan_kue = keterangan_kue;
	}	
	
	public String getHarga() {
		return harga;
	}

	public void setHarga(String harga) {
		this.harga = harga;
	}
 

	public String toString() { 
		return "Nama Kue: " +nama_barang+"     Keterangan Kue: " +keterangan_kue+"     Harga: " +harga;
	}
}
