package bibliotecaemail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;

public class UsandoBibliotecaDeEmail {

	public static void main(String[] args) {
		String meuEmail = "jean.fasthelp@gmail.com";
		String minhaSenha = "x";
		
		SimpleEmail email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator(meuEmail, minhaSenha));
		email.setSSLOnConnect(true);
		
		try {
			email.setFrom(meuEmail);
			email.setSubject("Qualquer assunto aqui, ou variavel string");
			email.setMsg("Qualquer msg aqui, ou variavel string");
			email.addTo(meuEmail);
			email.send();
			System.out.println("Email enviado");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*
 * Vídeo YT: https://www.youtube.com/watch?v=xBZqr4Gdnck
*/
