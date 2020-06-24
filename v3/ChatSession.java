package chatbot.v3;

import java.util.Arrays;

import chatbot.v2.Bot;

public class ChatSession {
	private String questionBot;
	private String userWords[] = {"colis", "chercher", "livrer", "rdv", "rendez-vous", "prendre", "changer", "adresse", "quand", "heure", "relais", "devenir"};
	boolean found = false;
	
	public ChatSession(String questionBot) {
		this.questionBot=questionBot;
	}

	public String getAnswer(String questionUser){
		
		Bot bot = new Bot("Agrikolis");

		while (bot.toString() == "Agrikolis" && questionBot == "Bonjour, que puis-je faire pour vous?") {
			
			if (questionUser == null || questionUser.length()<1 || testValue(questionUser) == false) {
				return "Je n'ai pas compris, veuillez reformuler votre question"; 
			} else if (questionUser.contains(userWords[0]) || questionUser.contains(userWords[1]) || questionUser.contains(userWords[2])) {
				return "Votre colis est arrivé!";
			} else if (questionUser.contains(userWords[3]) || questionUser.contains("prendre") || questionUser.contains("changer") || questionUser.contains("rendez-vous")) {
				return "Votre rendez-vous est prévu le 2.2.2022 à 12h22";
			} else if (questionUser.contains("adresse") || questionUser.contains("quand") || questionUser.contains("heure")) {
				return "Voici l'adresse de votre relais: .......";
			} else if (questionUser.contains("relais") || questionUser.contains("devenir")) {
				return "Accéder au formulaire d'inscription en cliquant sur le lien suivant: .......";
			}
		}
		return "question invalide";
	}
	
	public boolean testValue(String questionUser) {
		
		for (int i = 0; i<userWords.length; i++) {
			if (questionUser.contains(userWords[i])) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		return this.questionBot;
	}

}
