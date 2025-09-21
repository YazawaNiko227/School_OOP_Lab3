/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @created 21 thg 9, 2025 15:35:16
 */
package iuh.fit.cs;

public class Ghe extends CoSoVatChat{
	private boolean coTuaGhe;
	
	public Ghe(String ma, ChatLieu chatLieu, KichCo kichCo, int soChan) {
		super(ma, chatLieu, kichCo, soChan);
		setCoTuaGhe(coTuaGhe);
	}

	public boolean isCoTuaGhe() {
		return coTuaGhe;
	}

	public void setCoTuaGhe(boolean coTuaGhe) {
		this.coTuaGhe = coTuaGhe;
	}

	@Override
	public double canNang() {
		return getSoChan() * 10 + (coTuaGhe ? 20 : 0);
	}
}
