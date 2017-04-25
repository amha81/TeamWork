
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
	//spróbuj zrozumieæ co sprawdza ta metoda
	//podpowiedz w main wywo³aj metodê zadanie z ró¿nymi wartoœciami x
	//i zobacz dla jakich liczb zwracana jest wartoœæ true a dla jakich false
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
	//Do tej metody wdar³ siê b³¹d. Popraw j¹ tak, ¿eby:
	//jeœli dochody s¹ wiêksze od wydatków o 10 z³ wyœwietl "super"
	//jeœli dochody s¹ wiêksze od wydatków o mniej ni¿ 10z³ wyœwietl "ok"
	//jeœli dochody s¹ równe wydatkom wyœwietl "hmm"
	//jeœli dochody s¹ mniejsze od wydatków wyœwietl "huston mamy problem"
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
			case 1:  System.out.println("poniedzia³ek");
				break;
			case 2:  System.out.println("wtorek");
				break;
			case 3:  System.out.println("œroda");
				break;
			case 4:  System.out.println("czwartek");
				break;
			case 5:  System.out.println("pi¹tek");
	       		break;
			case 6:  System.out.println("sobota");
	         	break;
			case 7:  System.out.println("niedziela");
	       		break;
			default: System.out.println("z³e dane");
				break;
		}
	}
}
