package lab4_th;
import java.util.Scanner;
public class GiaoDich {
 public String magiaodich,ngaygiaodich;
 public float dientich;
 public long dongia;
 public String HoTen;
 public int MSSV;
 Scanner scanner = new Scanner(System.in);
	public GiaoDich() {
		// TODO Auto-generated constructor stub
	}
	public GiaoDich(String magiaodich, String ngaygiaodich, float dientich, long dongia, String hoTen, int mSSV,
			Scanner scanner) {
		super();
		this.magiaodich = magiaodich;
		this.ngaygiaodich = ngaygiaodich;
		this.dientich = dientich;
		this.dongia = dongia;
		HoTen = hoTen;
		MSSV = mSSV;
		this.scanner = scanner;
	
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public int getMSSV() {
		return MSSV;
	}
	public void setMSSV(int mSSV) {
		MSSV = mSSV;
	}
	public String getMagiaodich() {
		return magiaodich;
	}
	public void setMagiaodich(String magiaodich) {
		this.magiaodich = magiaodich;
	}
	public String getNgaygiaodich() {
		return ngaygiaodich;
	}
	public void setNgaygiaodich(String ngaygiaodich) {
		this.ngaygiaodich = ngaygiaodich;
	}

	public float getDientich() {
		return dientich;
	}
	public void setDientich(float dientich) {
		this.dientich = dientich;
	}
	public long getDongia() {
		return dongia;
	}
	public void setDongia(long dongia) {
		this.dongia = dongia;
	}
	public void nhap() {
        System.out.print("Nhập mã giao dịch: ");
        magiaodich = scanner.nextLine();
        System.out.print("Nhập ngày giao dịch (ngày/tháng/năm): ");
        ngaygiaodich = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        dongia = Long.parseLong(scanner.nextLine());
        System.out.print("Nhập diện tích: ");
        dientich = Float.parseFloat(scanner.nextLine());

    }
	@Override
    public String toString() {
        return "Mã giao dịch: " + this.magiaodich + ", ngày giao dịch: " + this.ngaygiaodich + 
            ", đơn giá: " + this.dongia + ", diện tích: " + this.dientich + "Họ Tên: "+ HoTen +"MSSV: "+ MSSV;
    }
}