/*
 * 2023(e)ko aza. 29(a)
 * Ioritz Lopetegi
 */
package proiektuakonponduta;

/**
 * The Class Autoak.
 */
public class Autoak {
	
	/**  Modeloa. */
	public String Modeloa;
	
	/**  Marka. */
	public String Marka;
	
	/**  Pertsona kop. */
	public int Pertsona_kop;
	
	/**  Auto kop. */
	public static int Auto_Kop;
	
	/**  Erregai mota. */
	public String ErregaiMota;
	
	/**  Ate kop. */
	public int Ate_Kop;
	
	/**  kontsumoa. */  //100km-ro gastatutako L- kopurua
	public double kontsumoa;
	
	/**
	 * Autoberriak Zenbatu.
	 */
	 void autoberria() {
		Auto_Kop++;
	};
	
	/**
	 * Instantiates a new autoak.
	 */
	Autoak () {

		Modeloa = "Benz";
		Marka= "Mercedes";
		Pertsona_kop= 5;
		ErregaiMota = "Gasolina";
		Ate_Kop= 4;
		kontsumoa =8.6;
		autoberria();
	}
	
	/**
	 * Instantiates a new autoak.
	 *
	 * @param Model the modeloa
	 * @param Brand the marka
	 * @param PeopleAmount the Pertsona_Kop
	 * @param Fuel the ErregaiMota
	 * @param Door_Amount the Ate_Kop
	 * @param consumption the Kontsumoa
	 */
	Autoak (String Model,String Brand,int PeopleAmount,String Fuel,int Door_Amount,double consumption) {
		Marka = Brand;
		Modeloa = Model;
		Pertsona_kop=PeopleAmount;
		ErregaiMota=Fuel;
		Ate_Kop=Door_Amount;
		kontsumoa=consumption;
		autoberria();
	}
	
	public String toString() {
	    return "Autoak{" +
	            "Modeloa='" + Modeloa + '\'' +
	            ", Marka='" + Marka + '\'' +
	            ", Pertsona_kop=" + Pertsona_kop +
	            ", ErregaiMota='" + ErregaiMota + '\'' +
	            ", Ate_Kop=" + Ate_Kop +
	            ", kontsumoa=" + kontsumoa +
	            '}';
	}
	
/**
 * Sets the marka.
 *
 * @param Brand the marka
 */
public void SetMarka (String Brand) {
		
		this.Marka= Brand;
	}


	
/**
 * Sets the modeloa.
 *
 * @param Model the Modeloa
 */
public void SetModeloa (String Model) {
		
		this.Modeloa= Model;
	}

/**
 * Sets the pertsona kop.
 *
 * @param PeopleAmount the pertsona kop.
 */
public void SetPertsonaKop (int PeopleAmount) {
	
	this.Pertsona_kop= PeopleAmount;
}

/**
 * Sets the erregai mota.
 *
 * @param Fuel the erregai mota
 */
public void SetErregaiMota (String Fuel) {
	
	this.ErregaiMota= Fuel;
}

/**
 * Sets the ate kop.
 *
 * @param Door_Amount ate kop.
 */
public void SetAte_Kop (int Door_Amount) {
	
	this.Ate_Kop= Door_Amount;
}

/**
 * Sets the kontsumoa.
 *
 * @param consumption the  kontsumoa.
 */
public void SetKontsumoa (Double consumption) {
	
	this.kontsumoa= consumption;
}



/**
 * Gets the marka.
 *
 * @param Brand the marka.
 * @return the string
 */
public String GetMarka (String Brand) {
	
	return this.Marka;
}

/**
 * Gets the modeloa.
 *
 * @param Model the modeloa
 * @return the string
 */
public String GetModeloa (String Model) {
	
	 return this.Modeloa;
}

/**
 * Gets the pertsona kop.
 *
 * @param PeopleAmount the pertsona kop.
 * @return the int
 */
public int GetPertsonaKop (int PeopleAmount) {

 return this.Pertsona_kop;
 
}

/**
 * Gets the erregai mota.
 *
 * @param Fuel the fuel
 * @return the string
 */
public String GetErregaiMota (String Fuel) {

	 return this.ErregaiMota;
	 
	}

/**
 * Gets the ate kop.
 *
 * @param Door_Amount the door amount
 * @return the int
 */
public int GetAte_Kop (int Door_Amount) {

	 return this.Ate_Kop;
	 
	}

/**
 * Gets the kontsumoa.
 *
 * @param consumption the consumption
 * @return the double
 */
public double GetKontsumoa (Double consumption) {

	 return this.kontsumoa;
	 
	}

/**
 * Erakutsi auto kop.
 */
static void erakutsiAutoak() {
	
	System.out.println (Auto_Kop);
}











	

}