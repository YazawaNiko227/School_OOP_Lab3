/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @created 21 thg 9, 2025 15:08:44
 */
package iuh.fit.cs;

public abstract class CoSoVatChat {
	private String ma;
	private ChatLieu chatLieu;
	private KichCo kichCo;
	private int soChan;
	
	public CoSoVatChat(String ma, ChatLieu chatLieu, KichCo kichCo, int soChan) {
		setMa(ma);
		this.chatLieu = chatLieu;
		this.kichCo = kichCo;
		setSoChan(soChan);
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		if(ma == null || ma.isEmpty()) {
			throw new IllegalArgumentException("Ma khong duoc trong.");
		}
		this.ma = ma;
	}

	public ChatLieu getChatLieu() {
		return chatLieu;
	}

	public void setChatLieu(ChatLieu chatLieu) {
		this.chatLieu = chatLieu;
	}

	public KichCo getKichCo() {
		return kichCo;
	}

	public void setKichCo(KichCo kichCo) {
		this.kichCo = kichCo;
	}

	public int getSoChan() {
		return soChan;
	}

	public void setSoChan(int soChan) {
		if(soChan <= 0) {
			throw new IllegalArgumentException("So chan phai lon hon 0.");
		}
		this.soChan = soChan;
	}
	
	public abstract double canNang();
}
