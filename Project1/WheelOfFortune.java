import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WheelOfFortune {

	private String[] answer;
	private String[] answerBlanks;
	private ArrayList<String> guessedList;
	private boolean GAME_RUNNING;
	
	public WheelOfFortune(String[] answerList) {
		this.answer = answerList;
		this.answerBlanks = new String[answerList.length];
		Arrays.fill(this.answerBlanks, "_");
		this.guessedList = new ArrayList<String>();
		this.GAME_RUNNING = false;
	}
	
	private void takeTurn() {
		
		
		
		
		// TODO: You must implement this method
		
		
		
		
	}
	
	private String getGuess() {
		Scanner s = null;
		String guess = null;
		try {
			s = new Scanner(System.in);
			System.out.print("Guess a letter: ");
			guess = s.nextLine();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (s != null) {
				s.close();
			}
		}
		return guess.toLowerCase();
	}
	
	public void startGame() {
		System.out.println("Starting game...");
		this.GAME_RUNNING = true;
		this.gameLoop();
	}
	
	public void endGame() {
		System.out.println("Ending game...");
		this.GAME_RUNNING = false;
	}
	
	private void gameLoop() {
		while (this.GAME_RUNNING) {
			this.takeTurn();
		}
	}
}
