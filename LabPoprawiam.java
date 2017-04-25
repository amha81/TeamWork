
public class LabPoprawiam {
	public static void main(String[] args) {

		
	}
	
	//ZADANIE 5a:
	//spróbuj zrozumieæ co sprawdza ta metoda
	//podpowiedz w main wywo³aj metodê zadanie z ró¿nymi wartoœciami x
	//i zobacz dla jakich liczb zwracana jest wartoœæ true a dla jakich false
	private static boolean tajemnica(int x)
	{
		if (x%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}				
	}
	
	//ZADANIE 5b:
	//Do tej metody wdar³ siê b³¹d. Popraw j¹ tak, ¿eby:
	//jeœli dochody s¹ wiêksze od wydatków o 10 z³ wyœwietl "super"
	//jeœli dochody s¹ wiêksze od wydatków o mniej ni¿ 10z³ wyœwietl "ok"
	//jeœli dochody s¹ równe wydatkom wyœwietl "hmm"
	//jeœli dochody s¹ mniejsze od wydatków wyœwietl "huston mamy problem"
	private static void bilans(int wydatki, int dochody)
	{
		if (dochody+wydatki>10)
		{
			System.out.println("super");
		}
		else if (dochody>0)
		{
			System.out.println("ok");
		}
		else if (wydatki>0)
		{
			System.out.println("hmm");
		}
		else
		{
			System.out.println("huston mamy problem");
		}
	}
}
