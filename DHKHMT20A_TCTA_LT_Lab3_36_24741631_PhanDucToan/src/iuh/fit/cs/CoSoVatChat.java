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
		this.ma = ma;
		this.chatLieu = chatLieu;
		this.kichCo = kichCo;
		this.soChan = soChan;
	}
	
	
}
