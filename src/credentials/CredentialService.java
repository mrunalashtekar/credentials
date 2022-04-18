package credentials;

public class CredentialService {
	
	public char[] generatePassword() {
		
		
		String capitalLetters= "ABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
		String smallletters="abcdefghijklmnopqrstuvwxyz" ;
		String numbers="0123456789" ;
		String specialCharacters="!@#$%^&*_=+/.?<>";
		String values = capitalLetters + smallletters + numbers + specialCharacters;
		
		Random random = new random() ;
		char []password =new char[8];
		
		for (int i=0;i<8;i++) {
			password[i]=values.charAt(random.nextInt(values.length()));
			
		}
		
		return password ;
	}
	
//Method to generate EmailAddress
	public String generateEmailAddress(String firstName,String lastName,String dept)
	{
		return firstname + lastName + "@" + dept + "abc.com" ; 
	}
	public void showCredentials(Emplo yee employee,String email,char []generatePassword) {
	}
	     System.out.println("Hi"+ employee.getFirstName () + " your generated");
}
