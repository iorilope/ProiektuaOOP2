package Proiektua2;

public class Autoak {

    private String Modeloa;
    private String Marka;
    private int Pertsona_kop;
    private static int Auto_Kop;
    private String ErregaiMota;
    private int Ate_Kop;
    private double kontsumoa;

    /**
     * Auto berri bat sartzean, auto kopurua igoko da
     */
    public static void autoBerria() {
        Auto_Kop++;
    }

    /**
     * Auto bat kentzean, auto kopurua jetsiko da
     */
    public static void autoaKendu() {
        Auto_Kop--;
    }

    /**
     * Parametro gabeko objetua
     */
    Autoak() {
        Modeloa = "Benz";
        Marka = "Mercedes";
        Pertsona_kop = 5;
        ErregaiMota = "Gasolina";
        Ate_Kop = 4;
        kontsumoa = 8.6;
        
    }

    /**
     * Paramterodu objetua
     * @param Model = modeloa
     * @param Brand = Marka
     * @param PeopleAmount = Pertsona kopurua
     * @param Fuel = erregai mota
     * @param Door_Amount = ate kopurua
     * @param consumption = kontsumoa
     */
    Autoak(String Model, String Brand, int PeopleAmount, String Fuel, int Door_Amount, double consumption) {
        Modeloa = Model;
        Marka = Brand;
        Pertsona_kop = PeopleAmount;
        ErregaiMota = Fuel;
        Ate_Kop = Door_Amount;
        kontsumoa = consumption;
    }

    /**
     * Marka ezarteko metodoa
     * @param Brand = Marka
     */
    public void SetMarka(String Brand) {
        this.Marka = Brand;
    }

    /**
     * Modeloa ezartzeko metodoa
     * @param Model = Modeloa
     */
    public void SetModeloa(String Model) {
        this.Modeloa = Model;
    }

    /**
     * Pertsona kopurua ezartzeko metodoa
     * @param peopleAmount = pertsona kopurua
     */
    public void setPertsonaKop(int peopleAmount) {
        if (peopleAmount >= 0) {
            this.Pertsona_kop = peopleAmount;
        } else {
            System.out.println("Errorea: Pertsona kopurua ezin da negatiboa izan.");
        }
    }

    /**
     * erregai mota ezartzeko metodoa
     * @param Fuel = erregai mota
     */
    public void SetErregaiMota(String Fuel) {
        this.ErregaiMota = Fuel;
    }

    /**
     * Ate kopurua sartzeko metodoa
     * @param Door_Amount = ate kopurua
     */
    public void SetAte_Kop(int Door_Amount) {
        if (Door_Amount >= 1) {
            this.Ate_Kop = Door_Amount;
        } else {
            System.out.println("Errorea: Autoak gutxienez ate bat izan behar du.");
        }
    }

    /**
     * Kontsumoa ezartzeko metodoa
     * @param consumption = kontsumoa
     */
    public void setKontsumoa(double consumption) {
        if (consumption >= 0) {
            this.kontsumoa = consumption;
        } else {
            System.out.println("Errorea: Kontsumoa ezin da negatiboa izan.");
        }
    }

    /**
     * Metodoa
     * @return Marka
     */
    public String GetMarka(String Brand) {
        return this.Marka;
    }

    /**
     * Metodoa
     * @return
     */
    public String GetModeloa(String Model) {
        return this.Modeloa;
    }

    /**
     * Metodoa
     * @return Pertsoan kopurua
     */
    public int GetPertsonaKop(int PeopleAmount) {
        return this.Pertsona_kop;
    }

    /**
     * Metodoa
     * @return errgai mota
     */
    public String GetErregaiMota(String Fuel) {
        return this.ErregaiMota;
    }

    /**
     * Metodoa
     * @return Ate kopurua
     */
    public int GetAte_Kop(int Door_Amount) {
        return this.Ate_Kop;
    }

    /**
     * Metodoa
     * @return Kontsumoa
     */
    public double GetKontsumoa(Double consumption) {
        return this.kontsumoa;
    }

    /**
     * Autoak erakusteko metodoa
     */
    public static void erakutsiAutoak() {
        if (Auto_Kop == 1)
            System.out.println("Auto " + Auto_Kop + " dago.");
        else
            System.out.println(Auto_Kop + " auto daude.");
    }

    /**
     * Autoen balioak String abtera pasatzen dituen metodoa.
     */
    public String toString() {
        return Marka + " " + Modeloa + ", Pertsona kopurua:" + Pertsona_kop + ", Erregai mota: " + ErregaiMota
                + ", Ate Kopurua: " + Ate_Kop + ", Kontsumoa: " + kontsumoa;
    }
}
