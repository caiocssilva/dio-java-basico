package ExemploPOO;

import apps.Facebookmessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

//Simulação do uso da classe MSNMessenger

public class ComputadorPedrinho {
	public static void main(String[] args) {	
		ServicoMensagemInstantanea smi = null;
		
        //Polimorfismo
		/*
		NÃO SE SABE QUAL APP 
		MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido="tlg"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fcb"))
			smi = new Facebookmessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
		smi.enviarMensagem();
		smi.receberMensagem();
        
        /* 
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
        */
	}
    
}