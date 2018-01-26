import org.apache.commons.codec.binary.Base64;

public class Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String  orignal_pass="rudrashashi2";
	 byte[] encoded = Base64.encodeBase64(orignal_pass.getBytes()); 
	 System.out.println("Original String: " +  orignal_pass);
     System.out.println("Base64 Encoded String : " + new String(encoded));
   
     //decoding byte array into base64
     byte[] decoded = Base64.decodeBase64(encoded);      
     System.out.println("Base 64 Decoded  String : " + new String(decoded));
	
	
	
	
	
	
	
	}

}
