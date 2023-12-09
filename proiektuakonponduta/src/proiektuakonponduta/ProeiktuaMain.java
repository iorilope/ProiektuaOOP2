/**
 * 
 */
package proiektuakonponduta;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * 
 * @author Ioritz Lopetegi
 */
public class ProeiktuaMain {

	/**
	 * @param args
	 */


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);



		ArrayList<Autoak> Autozerrenda = new ArrayList<Autoak>();
		
		 //Auto batzuk sortu
        Autozerrenda.add(new Autoak("Mercedes", "Benz", 5, "Gasolina", 4, 10.5));
        Autozerrenda.add(new Autoak("BMW", "Marca2", 4, "Diesel", 2, 8.0));
        Autozerrenda.add(new Autoak("Toyota", "Serie 1", 7, "Hibrido", 5, 15.2));
		
		
		

		System.out.println("==================================================================");
		System.out.println("    Sartu zure aukera");
		System.out.println("    	1-Autoa gehitu");
		System.out.println("    	2-Autoak Kendu");
		System.out.println("    	3-Autoak ikusi");
		System.out.println("	4-Auto kop ikusi");
		System.out.println("==================================================================");

		int aukera;
		do {


			aukera = sc.nextInt();
			if (aukera != 1 && aukera != 2 && aukera != 3 && aukera != 4) {

				System.out.println("Autatutako zenbakiak ez du balio, sartu berriro (1-4)");
			}

		} while (aukera !=1 && aukera !=2  && aukera !=3  && aukera !=4);


		if (aukera == 1) {

			System.out.println("Autoa gehitu aukeratu duzu");

			System.out.println("Zenbat auto sartu nahi dituzu");
			int kopurua;
			kopurua = sc.nextInt();

			for (int i = 0; i < kopurua; i++) 
			{
				Autoak autoa = new Autoak();

				System.out.println("Sartu autoaren Marka");
				String markaString = sc.nextLine();
				sc.nextLine();
				autoa.SetMarka(markaString);


				System.out.println("Sartu autoaren Modeloa");
				String modeloaString = sc.nextLine();
				autoa.SetModeloa(modeloaString);

				System.out.println("Sartu Pertsona Kopurua");
				int pertsonakopurua = sc.nextInt();
				autoa.SetPertsonaKop(pertsonakopurua);

				System.out.println("Sartu Erregai Mota");
				String erregaiString = sc.nextLine();
				sc.nextLine();
				autoa.SetErregaiMota(erregaiString);

				System.out.println("Sartu Ate Kopurua");
				int atekopurua = sc.nextInt();
				autoa.SetAte_Kop(atekopurua);

				System.out.println("Sartu Kontsumoa L/100km");
				double kontsumoaa = sc.nextDouble();
				autoa.SetKontsumoa(kontsumoaa);

				Autozerrenda.add(autoa);
				autoa.autoberria();
				System.out.println("Autoa gehitu da");
				sc.close();
			}

		}


		else if (aukera == 2) {
			
			
			

			System.out.println("Autoa kendu aukeratu duzu");
			int index = 1;
			for (Autoak auto : Autozerrenda) {
			    System.out.println(index + ": " + auto);
			    index++;
			}
			
			 
			    System.out.print("Sartu kendu nahi duzun autoaren zenbakia : ");
			    int aukera2 = sc.nextInt();
			    
			    if (aukera2 > 0 && aukera2 <= Autozerrenda.size()) {
			       
			        Autozerrenda.remove(aukera2 - 1);
			        System.out.println("Auto ondo kendu da.");
			        int index2 = 1;
					for (Autoak auto : Autozerrenda) {
					    System.out.println(index2 + ": " + auto);
					    index2++;
					}
			    } else {
			        System.out.println("Gaizki aukeratu duzu. Ez da autorik kendu.");
			    }
			}

		else if (aukera == 3) {


			System.out.println("Autoak ikusi  aukeratu duzu");

		}

		else if (aukera == 4) {

			System.out.println("Autoak kop   aukeratu duzu");

		}
		else {
			System.out.println("Autatutako zenbakiak ez du balio");
		}






	}

}