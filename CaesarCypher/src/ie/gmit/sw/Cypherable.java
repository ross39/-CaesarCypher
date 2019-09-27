package ie.gmit.sw;

//This interface deals with something that is Cypherable
//Anything that is cypherable will implement this interface
public interface Cypherable {
	
	String encrypt(String plainText) throws CypherException;

	byte[] encrypt(byte[] plainText) throws CypherException;

	String decrypt(String cypherText) throws CypherException;

	byte[] decrypt(byte[] cypherText) throws CypherException;

}
