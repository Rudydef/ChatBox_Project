package chatbot.v3;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	//*********************************************************************
	//AJOUTER UNE FONCTION RECUSRIVE QUI PERMETTRAIT DE REPOSER LA QUESTION 
	//LORSQUE L'UTILISATEUR SOUHAITERA POSER UNE NOUVELLE QUESTION
	//*********************************************************************
	
	

	public static void main(String[] args) throws IOException {
		String reponse = "";
		String answerBot = "";

		ChatSession chat = new ChatSession("Bonjour, que puis-je faire pour vous?");
		Bot bot = new Bot("Agrikolis");
		System.out.println("Nom: " + bot);
		System.out.println("Bot: " + chat);

		Scanner sc = new Scanner(System.in);
		System.out.println("Bot: Entrer votre question ");
		System.out.print("User:> ");

		String questionUser = sc.nextLine();

		answerBot=chat.getAnswer(questionUser);

		System.out.println("Bot: " + answerBot);

		do {
			if (answerBot.contains("veuillez")) {
				System.out.print("User:> ");
				reponse=sc.nextLine();
				System.out.println("Bot: " + chat.getAnswer(reponse));
			}

		} while (answerBot.contains("veuillez"));
		
		System.out.println("Bot: Voulez-vous poser une autre question?");
		System.out.print("User:> ");
		reponse=sc.nextLine();
		
		do {
			if (reponse.contains("oui")) {
				System.out.println("Bot: Que puis-je faire pour vous?");
				System.out.print("User:> ");
				reponse=sc.nextLine();
				System.out.println("Bot: " + chat.getAnswer(reponse));
			} else if (reponse.contains("non")) {
				System.out.println("Bot: Trés bien. Aurevoir!");
				sc.close();
			}

		} while (reponse.contains("oui"));
		
	}


}




