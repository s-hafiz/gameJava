package game;

public class SimpleDotCom {
	//Describing games pattern
	SimpleDotCom [] dotcom = new SimpleDotCom[1000];
	int numberOfHit=0;
	int x;
	int z;
	int s,s1,s2;
	private int y;
	int val=2;
	String msg;
	int m=100;
	
	
	public String setLocationCells(int loc){
		y=loc;
		s=y+3;
		if(y<s){
			while(y<s){
				dotcom[y]=new SimpleDotCom();
				dotcom[y].x=y;
				y=y+1;
			}
			y=loc;
		}
		return "@@@@-----GAME STARTING-----@@@@";
	}//setLocation ends here)
	
	
	public String checkYouself(int guess){
		numberOfHit=numberOfHit+1;
		z=guess;
		if(dotcom[y].x==z){
			if(val==0){
						System.out.println("kill");
						msg = "kill";
						return "kill";
				}else{
						System.out.println("Hit");
						val=val-1;
						dotcom[y].x=m;
						return "ok";
					}
				} //first if ends here
		
			s1=y+1;
		if(dotcom[s1].x==z){
			if(val==0){
					System.out.println("kill");
					msg="kill";
					return "kill";
				}else{
					System.out.println("Hit");
					val=val-1;
					dotcom[s1].x=m;
					return "ok";
				}
			} //second if ends here
		
		s2=y+2;
		if(dotcom[s2].x==z){
			if(val==0){
					System.out.println("kill");
					msg="kill";
					return "kill";
				}else{
					System.out.println("Hit");
					val=val-1;
					dotcom[s2].x=m;
					return "ok";
				}	
			} //Third if ends here
		
		
		if(z>s2 || z<y){
				System.out.println("miss");
				return "ok";
			} //extra if ends here
		
		if(dotcom[y].x==100 || dotcom[s1].x==100 || dotcom[s2].x==100){
			System.out.println("You already guessed that number !");
		}
		return "ok";
	}
//Checkyourself method ends here
}//Class ends here

