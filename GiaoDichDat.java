package lab4_th;

public class GiaoDichDat extends GiaoDich {
public String loaidat;
	public GiaoDichDat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiaoDichDat(String loaidat) {
		super();
		this.loaidat = loaidat;
	}

	public String getLoaidat() {
		return loaidat;
	}

	public void setLoaidat(String loaidat) {
		this.loaidat = loaidat;
	}
	 public void nhap() {
	        super.nhap();
	        System.out.print("Nhập loại đất (A/B/C): ");
	        loaidat = scanner.nextLine();
	    }
	 
	    @Override
	    public String toString() {
	        return super.toString() + ", loại đất: " + this.loaidat;
	    }
	}