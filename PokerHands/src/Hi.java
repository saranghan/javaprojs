
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Card implements Comparable<Card> {

	public int compareTo(Card o) {

		return Comparator.comparing(Card::getNumber).thenComparing(Card::getSuit).compare(this, o);
	}

	public enum Suits {
		C, D, H, S
	}

	public enum Number {
		TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, J, Q, K, A
	}

	private Suits suit;
	private Number number;

	public Card(Number number, Suits suit) {
		this.number = number;
		this.suit = suit;
	}
	
	public Card(String s){
		
			if(s.contains("2")) {
				this.number = Card.Number.TWO;
				
			}if(s.contains("3")) {
				this.number = Card.Number.THREE;
			}if(s.contains("4")) {
				this.number = Card.Number.FOUR;
			}if(s.contains("5")) {
				this.number = Card.Number.FIVE;
			}if(s.contains("6")) {
				this.number = Card.Number.SIX;
			}if(s.contains("7")) {
				this.number = Card.Number.SEVEN;
			}if(s.contains("8")) {
				this.number = Card.Number.EIGHT;
			}if(s.contains("9")) {
				this.number = Card.Number.NINE;
			}if(s.contains("J") || s.contains("10")) {
				this.number = Card.Number.J;
			}if(s.contains("Q") || s.contains("11")) {
				this.number = Card.Number.Q;
			}if(s.contains("K") || s.contains("13")) {
				this.number = Card.Number.K;
			}if(s.contains("A") || s.contentEquals("1D")|| s.contentEquals("1C")|| s.contentEquals("1H")|| s.contentEquals("1S")) {
				this.number = Card.Number.A;
			}
			
			if(s.contains("S")) {
				this.suit = Card.Suits.S;
			}if(s.contains("C")) {
				this.suit = Card.Suits.C;
			}if(s.contains("H")) {
				this.suit = Card.Suits.H;
			}if(s.contains("D")) {
				this.suit = Card.Suits.D;
			}
			
			
			
		
		
	}
	

	public Number getNumber() {
		return number;
	}

	public Suits getSuit() {
		return suit;
	}

	public String toString() {

		final StringBuilder sb = new StringBuilder();
		sb.append(number);
		sb.append(suit);
		// sb.append(' ');
		return sb.toString();
	}
}

public class PokerHands {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		String[] array = null;
		List<Card> testCard = new ArrayList<Card>();
		String line;
		String arrayTemp;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder str = new StringBuilder();

		try {
			while ((line = reader.readLine()) != null) {
				if (line.contentEquals("")) {
					break;
				}
				str.append(">");
				str.append(line);

			}
		} catch (IOException e) {

			e.printStackTrace();
		}

		arrayTemp = str.toString().replaceFirst(">", "");

		//System.out.println(arrayTemp);
		
		String[] array1 = arrayTemp.split(">");
		
		
		StringBuffer ANSf = new StringBuffer();
		 
		for(int i = 0; i < array1.length;i++) {
			testCard.clear();
			array = new String[0];
			
			
			
			if(array1[i].contains("/")) {
				String s = array1[i].toUpperCase();
				array = s.split("/");
				
			}
			if(array1[i].contains("-")) {
				String s = array1[i].toUpperCase();
				array = s.split("-");
			}else {
				String s = array1[i].toUpperCase();
				array= s.split(" ");
			}
			for(int n = 0; n < array.length;n++) {
				//System.out.println(array[n]);
				testCard.add(new Card(array[n]));
			}
			//System.out.println(testCard);
			Collections.sort(testCard);
			String fStr = (testCard.toString()).substring(1,testCard.toString().length()-1);
			
			//System.out.println(fStr);
			String[] change = fStr.split(", ");
			changeOutput(change);
			
			for(int x = 0 ; x< change.length;x++) {
				System.out.print(change[x]+ " ");
			}
			System.out.println("\n");
		}
		
	
		
}
	public static void changeOutput(String[] x) {
		for (int i = 0; i < x.length; i++) {
			StringBuilder s = new StringBuilder();
			if (x[i].length() > 2) {
				// s.append(" ");
				s.append(x[i].substring(x[i].length() - 1, x[i].length()));
				String sa = x[i].substring(0, x[i].length() - 1);
				if (sa.contains("TWO")) {
					sa = "2";
				}
				if (sa.contains("THREE")) {
					sa = "3";
				}
				if (sa.contains("FOUR")) {
					sa = "4";
				}
				if (sa.contains("FIVE")) {
					sa = "5";
				}
				if (sa.contains("SIX")) {
					sa = "6";
				}
				if (sa.contains("SEVEN")) {
					sa = "7";
				}
				if (sa.contains("EIGHT")) {
					sa = "8";
				}
				if (sa.contains("NINE")) {
					sa = "9";
				}
				if (sa.contains("TEN")) {
					sa = "10";
				}

				s.insert(0, sa);

				

				x[i] = s.toString();

				s.setLength(0);
			}
		}
	}
	
}
