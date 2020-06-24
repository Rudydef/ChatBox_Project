package chatbot.v3;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		String reponse = "";
		String answerUser = "";
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
		


		//		System.out.println("Bot: Désirez-vous autre chose?");
		//		System.out.print("User:> ");
		//		String answerUser = reader.readLine(); 
		//
		//
		//		if (answerUser.contains("oui")) {
		//			System.out.println("Bot: Posez moi une nouvelle question ");
		//			System.out.print("User:> ");
		//			String newQuestionUser = reader.readLine();
		//			System.out.println("Bot: " + chat.getAnswer(newQuestionUser));
		//			System.out.println("Bot: Désirez-vous autre chose?");
		//			System.out.print("User:> ");
		//
		//
		//		} else if (answerUser.contains("non")) {
		//			System.out.println("Bot: Aurevoir!");
		//			System.exit(0);
		//		}
		//
		//		String NewAnswerUser = reader.readLine();
		//
		//		do {  
		//
		//			if (NewAnswerUser.contains("oui")) {
		//				System.out.println("Bot: Désirez-vous autre chose?");
		//				System.out.print("User:> ");
		//				String newQuestionUser = reader.readLine();
		//				System.out.println("Bot: " + chat.getAnswer(newQuestionUser));
		//			} else if(NewAnswerUser.contains("non")){
		//				System.out.println("Bot: Aurevoir!");
		//				System.exit(0);	
		//			}
		//		}  while (NewAnswerUser.contains("oui"));
		//
	}


}




