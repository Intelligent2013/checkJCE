
public class checkJCE {

	public static void main(String[] args) {
		try {
			int maxKeySize = javax.crypto.Cipher.getMaxAllowedKeyLength("AES");
			System.out.println("Maximum Key Size: " + maxKeySize);
		} catch (java.security.NoSuchAlgorithmException ex) {
			System.out.println(ex.toString());
		}
	}

}