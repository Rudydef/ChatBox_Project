package chatbot.v1;

public class Main {

	public static void main(String[] args) {
		String questionUser = null;

		Bot bot = new Bot("Agrikolis");
		ChatSession chat = new ChatSession("Que puis-je faire pour vous?");

		System.out.println("Nom: " + bot);

		System.out.println("Bot: " + chat);

		questionUser=chat.askQuestion("adresse");

		System.out.println("User: " + questionUser);

		System.out.println("Bot: " + chat.getAnswer(questionUser));	
	}

}
