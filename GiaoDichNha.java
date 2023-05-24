package lab4_th;

public class GiaoDichNha extends GiaoDich {
public String loainha, diachi;
public int choose;
	public GiaoDichNha() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiaoDichNha(String loainha, String diachi) {
		super();
		this.loainha = loainha;
		this.diachi = diachi;
	}
	public String getLoainha() {
		return loainha;
	}

	public void setLoainha(String loainha) {
		this.loainha = loainha;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public void nhap() {
        super.nhap();
        System.out.print("Nhập địa chỉ: ");
        diachi = scanner.nextLine();
        System.out.print("Nhập loại nhà (0: cao cấp, 1: thường): ");
        choose = scanner.nextInt();
        switch (choose) {
            case 0:
                loainha = "cao cấp";
                break;
            case 1: 
                loainha = "thường";
                break;
            default:
                System.out.println("Chọn số không hợp lệ.");
                break;
        }
    }
     
    @Override
    public String toString() {
        return super.toString() + ", loại nhà: " + this.loainha + ", địa chỉ: " + this.diachi;
    }
}

