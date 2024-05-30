package ExemploPOO;

//Simulação do uso da classe MSNMessenger

public class ComputadorPedrinho {
	public static void main(String[] args) {
		//abrindo MSN Messenger
        System.out.println("MSN");

		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();

        System.out.println("FACBOOK");

        Facebookmessenger face = new Facebookmessenger();
		face.enviarMensagem();
		face.receberMensagem();

        System.out.println("TELEGRAM");

        Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();
	}
}