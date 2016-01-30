package beispiel1_vier_gewinnt;

public class FourWins {

	private int sizeX;
	private int sizeY;
	private char [][] charArray;
	
	public FourWins(int sizeX, int sizeY) {
		charArray = new char [sizeX][sizeY];
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		
		for(int i = 0; i < sizeX; i++){
			for(int j = 0; j < sizeY; j++){
				this.charArray[i][j] = ' ';
			}
		}
	}
	
	public boolean playerA(int x, int y){
		boolean bool;
				if(this.charArray[x][y] == ' '){
					this.charArray[x][y] = 'A';
					return bool=true;
				}
				else{
					return bool=false;
				}
	}
	
	public boolean playerB(int x, int y){
		boolean bool;
				if(this.charArray[x][y] == ' '){
					this.charArray[x][y] = 'B';
					return bool=true;
				}
				else{
					return bool=false;
				}
	}
	
	private char fourInRow(){
		int countA=0;
		int countB=0;
		char player='-';
		for(int i = 0; i<this.charArray.length;i++){
			for(int j = 0; j<this.charArray.length;j++){
				if(this.charArray[i][j]=='A'){
					countA++;
				}
				else if(this.charArray[i][j]=='B'){
					countB++;
				}
			}
			if(countA == 4){
				player='A';
			}
			else if(countB == 4){
				player='B';
			}
			else{
				countA = 0;
				countB = 0;
			}
		}
		return player;
	}
	
	private char fourInColumn(){
		int countA=0;
		int countB=0;
		char player='-';
		for(int i = 0; i<this.charArray.length;i++){
			for(int j = 0; j<this.charArray.length;j++){
				if(this.charArray[j][i]=='A'){
					countA++;
				}
				else if(this.charArray[j][i]=='B'){
					countB++;
				}
			}
			if(countA == 4){
				player='A';
			}
			else if(countB == 4){
				player='B';
			}
			else{
				countA = 0;
				countB = 0;
			}
		}
		return player;
	}
	
	public char winner(){
		char winner = '-';
		if(this.fourInColumn() == 'A' || this.fourInRow() == 'A'){
		return winner = 'A';
		}
		else if (this.fourInColumn() == 'B' || this.fourInRow() == 'B'){
		return winner = 'B';
		}
		else{
			return winner = '-';
		}
	}
	
	public int getSizeX() {
		return sizeX;
	}


	public int getSizeY() {
		return sizeY;
	}



	
}
