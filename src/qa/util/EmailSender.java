package qa.util;

import qa.util.reporting.Reporter;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.List;
import java.util.Properties;


public class EmailSender {
    static final String username = "jane@sprayable.co";
    static final String password = "Lt8PgRKs";

    public void sendMail(List<String> failedSites) {
        int index = 1;
        StringBuilder stringBuilder = new StringBuilder();
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });
        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("jane@sprayable.co"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("budimir@sprayable.co,dan@sprayable.co,jane@sprayable.co"));
            message.setSubject("URLs availability");
            stringBuilder.append("\n").append("List of sites which NOT AVAILABLE: ");
            for (String element : failedSites) {
                stringBuilder.append("\n").append(element);
                index++;
            }
            String s = new String(stringBuilder);
            message.setText(s);

            Transport.send(message);

            Reporter.log("mail successfully sent");

        } catch (MessagingException e) {
            Reporter.log("Exception in 'sendMail()' method " + e);
        }
    }
}
