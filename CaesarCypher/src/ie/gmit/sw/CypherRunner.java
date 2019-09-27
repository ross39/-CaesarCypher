package ie.gmit.sw;

public class CypherRunner {
	public static void main(String[] args) throws CypherException {
		Cypherable cc = new CaesarCypher(7);
		
		String s = "ATTACK THE CASTLE WALL AFTER DRINKS";
		String t = cc.encrypt(s);
		
		System.out.println(t);
		System.out.println(cc.decrypt(t));
	}
}
