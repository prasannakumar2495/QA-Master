package Lines;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;

public class Email 
{
	public static void main(String[] args) throws Exception 
	{

		try {
			SimpleEmail email = new SimpleEmail();
			email.setHostName("smtp.outlook.office.com");
			email.setSmtpPort(365);
			email.setAuthenticator(new DefaultAuthenticator("prasanna.anisetti@emids.com", "0818Apple"));
			email.setSSLOnConnect(true);
			email.setFrom("prasanna.anisetti@emids.com");
			email.setSubject("TestMail");
			email.setMsg("This is a test mail ... :-)");
			email.addTo("prasanna.anisetti@emids.com");
			email.send();
		}
		catch (Exception e)
		{
			System.out.println("Unable to send email");
			e.printStackTrace();
		}
	}

}
