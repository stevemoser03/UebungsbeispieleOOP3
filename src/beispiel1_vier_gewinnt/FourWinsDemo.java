package beispiel1_vier_gewinnt;

public class FourWinsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FourWins four = new FourWins(6,6);
		
		System.out.println(four.playerA(1, 1));
		System.out.println(four.playerB(2, 2));
		System.out.println(four.playerA(1, 2));
		System.out.println(four.playerB(2, 4));
		System.out.println(four.playerA(1, 3));
		System.out.println(four.playerB(5, 5));
		System.out.println(four.playerA(1, 4));
		System.out.println(four.playerB(5, 3));
		System.out.println(four.winner());
	}

}
