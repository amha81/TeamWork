
public class LabPoprawiamOdpowiedzi {
	public static void main(String[] args) {
		//tajemnica(1);
		//tajemnica(2);
		//tajemnica(3);
		
		/*bilans(10,25);
		bilans(10,15);
		bilans(10,10);
		bilans(10,5);*/
		
		zmieniaj(10);
	}
	
	//ZADANIE 1:
	//spr�buj zrozumie� co sprawdza ta metoda
	//podpowiedz w main wywo�aj metod� zadanie z r�nymi warto�ciami x
	//i zobacz dla jakich liczb zwracana jest warto�� true a dla jakich false
	private static boolean tajemnica(int x)
	{
		System.out.println(x+"%"+"2="+x%2);
		if (x%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}				
	}
	
	//ZADANIE 2:
	//Do tej metody wdar� si� b��d. Popraw j� tak, �eby:
	//je�li dochody s� wi�ksze od wydatk�w o 10 z� wy�wietl "super"
	//je�li dochody s� wi�ksze od wydatk�w o mniej ni� 10z� wy�wietl "ok"
	//je�li dochody s� r�wne wydatkom wy�wietl "hmm"
	//je�li dochody s� mniejsze od wydatk�w wy�wietl "huston mamy problem"
	private static void bilans(int wydatki, int dochody)
	{
		if (dochody-wydatki>10)
		{
			System.out.println("super");
		}
		else if (dochody>wydatki)
		{
			System.out.println("ok");
		}
		else if (dochody==wydatki)
		{
			System.out.println("hmm");
		}
		else
		{
			System.out.println("huston mamy problem");
		}
	}
	
	private static void zmieniaj(int dzien)
	{
		switch (dzien) {
			case 1:  System.out.println("poniedzia�ek");
				break;
			case 2:  System.out.println("wtorek");
				break;
			case 3:  System.out.println("�roda");
				break;
			case 4:  System.out.println("czwartek");
				break;
			case 5:  System.out.println("pi�tek");
	       		break;
			case 6:  System.out.println("sobota");
	         	break;
			case 7:  System.out.println("niedziela");
	       		break;
			default: System.out.println("z�e dane");
				break;
		}
	}
}
