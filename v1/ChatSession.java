package chatbot.v1;

import chatbot.v1.Bot;

public class ChatSession {
	private String questionChat;

	public ChatSession(String questionChat) {
		this.questionChat=questionChat;
	}
	
	public String askQuestion(String questionUser) {
		return questionUser;
	}

	public String getAnswer(String questionUser){
		Bot bot = new Bot("Agrikolis");

		while (bot.toString() == "Agrikolis" && questionChat == "Que puis-je faire pour vous?") {
			if (questionUser == null || questionUser.length()<1) {
				return "Posez votre question"; 
			} else if (questionUser.contains("colis") || questionUser.contains("chercher") || questionUser.contains("livrer")) {
				return "Votre colis est arrivé!";
			} else if (questionUser.contains("rdv") || questionUser.contains("prendre") || questionUser.contains("changer") || questionUser.contains("rendez-vous")) {
				return "Votre rendez-vous est prévu le X jour à Y heure";
			} else if (questionUser.contains("adresse") || questionUser.contains("quand") || questionUser.contains("heure")) {
				return "Voici l'adresse de votre relais: .......";
			} else if (questionUser.contains("relais") || questionUser.contains("devenir")) {
				return "Accéder au formulaire d'inscription en cliquant sur le lien suivant: .......";
			}
		}
		return "question invalide";
	}
	
	public String toString() {
		return this.questionChat;
	}

}


