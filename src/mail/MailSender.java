package mail;

import java.util.Hashtable;
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.*;

public class MailSender
{

    public MailSender()
    {
    }

    public int SendMail(String s)
    {
        int i = 0;
        String s1 = "smtp.gmail.com";
        String s2 = "form911@gmail.com";
        String s3 = "virt@123";
        String s4 = "test.txt";
        try
        {
            Properties properties = System.getProperties();
            properties.put("mail.smtp.gmail", s1);
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.host", s1);
            properties.put("mail.smtp.user", s2);
            properties.put("mail.smtp.password", s3);
            properties.put("mail.smtp.port", "25");
            properties.put("mail.smtp.auth", "true");
            Session session = Session.getInstance(properties, null);
            MimeMessage mimemessage = new MimeMessage(session);
            mimemessage.setFrom(new InternetAddress(s2));
            mimemessage.addRecipient(javax.mail.Message.RecipientType.TO, new InternetAddress(s));
            mimemessage.setSubject("Subject");
            MimeBodyPart mimebodypart = new MimeBodyPart();
            mimebodypart.setText("Content");
            MimeMultipart mimemultipart = new MimeMultipart();
            mimemultipart.addBodyPart(mimebodypart);
            mimebodypart = new MimeBodyPart();
            mimemessage.setContent(mimemultipart);
            Transport transport = session.getTransport("smtp");
            transport.connect(s1, s2, s3);
            transport.sendMessage(mimemessage, mimemessage.getAllRecipients());
            transport.close();
            i = 1;
        }
        catch(Exception exception) { 
        	exception.printStackTrace();
        }
        return i;
    }
    public static void main(String[] args) {
		new MailSender().SendMail("cokementos007@gmail.com");
		System.out.println("Sent");
	}
}
