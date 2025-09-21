/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @created 21 thg 9, 2025 15:40:27
 */
package iuh.fit.cs;

/**
 * 
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ban ban = new Ban("B01", ChatLieu.GO, KichCo.LON, 4, 2.0, 1.0);
        Ghe ghe = new Ghe("G01", ChatLieu.NHUA, KichCo.VUA, 4, true);

        System.out.println(ban);
        System.out.println(ghe);
	}

}
