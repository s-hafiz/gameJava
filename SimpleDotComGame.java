package game;
import java.util.*;
public class SimpleDotComGame {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);	//Creating scanner objects
		SimpleDotCom game = new SimpleDotCom();		//Creating DotCom objects
		
		String message=game.setLocationCells(700);
		String[] modifier={"st","nd","rd","th","th"};
		
		System.out.println("@----------This is a guessing game.You can guess only numbers.-----------@");
		System.out.println("Your goal is to sink the \'dotcom\' object.You will have only five chance.");
		System.out.println("\n\n");
		System.out.println(message+"\n\n");
		
		//Game starts here
		for(int i = 0;i<5;i++){
			System.out.print("Enter your "+(i+1)+modifier[i]+" guess ");
			int guess = scanner.nextInt();
			game.checkYouself(guess);
			if(game.msg=="kill"){
				System.out.println("You won !");
				break;
			}
			
			if(i==4 && game.msg!="kill"){
				System.out.println("You failed to sunk the dotcom object");
			}
			
		}//for ends here
		
		System.out.println("You took "+game.numberOfHit+" guesses");
		
	}//main ends here
}//class ends here
