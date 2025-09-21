/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @created 21 thg 9, 2025 15:30:13
 */
package iuh.fit.cs;

/**
 * 
 */
public class Ban extends CoSoVatChat{
	private double doDai;
	private double doRong;
	
	public Ban(String ma, ChatLieu chatLieu, KichCo kichCo, int soChan, double doDai, double doRong) {
		super(ma, chatLieu, kichCo, soChan);
		setDoDai(doDai);
		setDoRong(doRong);
	}

	public double getDoDai() {
		return doDai;
	}

	public void setDoDai(double doDai) {
		if(doDai <= 0) {
			throw new IllegalArgumentException("Do dai phai lon hon 0.");
		}
		this.doDai = doDai;
	}

	public double getDoRong() {
		return doRong;
	}

	public void setDoRong(double doRong) {
		if(doRong <= 0) {
			throw new IllegalArgumentException("Do rong phai lon hon 0.");
		}
		this.doRong = doRong;
	}

	@Override
	public double canNang() {
		return doDai * doRong * 10 + getSoChan() * 10;
	}
	
	@Override
    public String toString() {
        return String.format("Ban [doDai = %.1f, doRong = %.1f, canNang = %.1f]", doDai, doRong, canNang());
    }
}
