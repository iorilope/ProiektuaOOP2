package Proiektua2;

import java.util.Scanner;
import java.util.ArrayList;

public class ProiektuNagusia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Autoak> Autozerrenda = new ArrayList<Autoak>();
        int aukera;
        int kopurua;

        do {
            System.out.println("==================================================================");
            System.out.println("    Sartu zure aukera");
            System.out.println("    	1-Autoa gehitu");
            System.out.println("    	2-Autoak Kendu");
            System.out.println("    	3-Autoak ikusi");
            System.out.println("	4-Autoak editatu");
            System.out.println("	5-Auto kopurua ikusi");
            System.out.println("	0-Amaitu");
            System.out.println("==================================================================");

            aukera = sc.nextInt();

            if (aukera != 1 && aukera != 2 && aukera != 3 && aukera != 4 && aukera != 5 && aukera != 0) {
                System.out.println("Autatutako zenbakiak ez du balio, sartu berriro (1-4. 0 Amaitzeko)");
                continue; 
            }//Aukerak kontrolatzeko

            switch (aukera) {
                case 1:
                    System.out.println("Autoa gehitu aukeratu duzu");
                    while (true) {
                        System.out.println("Zenbat auto sartu nahi dituzu");
                        try {
                           kopurua = sc.nextInt();
                            break; 
                        } catch (java.util.InputMismatchException e) {
                            System.out.println("Sartu duzun balioa ez da zenbaki bat. Mesedez, saiatu berriro.");
                            sc.next(); //Zenbaki bat sartzera behartzeko kontrola
                        }
                    }

                    for (int i = 0; i < kopurua; i++) {
                        Autoak autoa = new Autoak();

                        System.out.println("Sartu autoaren Marka");
                        sc.nextLine();
                        String markaString = sc.nextLine();
                        autoa.SetMarka(markaString);

                        System.out.println("Sartu autoaren Modeloa");
                        String modeloaString = sc.nextLine();
                        autoa.SetModeloa(modeloaString);

                        while (true) {
                            System.out.println("Sartu Pertsona Kopurua");
                            try {
                                int pertsonaKopurua = sc.nextInt();
                                autoa.setPertsonaKop(pertsonaKopurua);
                                break; 
                            } catch (java.util.InputMismatchException e) {
                                System.out.println("Sartu duzun balioa ez da zenbaki bat. Mesedez, saiatu berriro.");
                                sc.next();//Zenbaki bat sartzera behartzeko kontrola
                            }
                        }

                        System.out.println("Sartu Erregai Mota");
                        sc.nextLine();
                        String erregaiString = sc.nextLine();
                        autoa.SetErregaiMota(erregaiString);

                        while (true) {
                            System.out.println("Sartu Ate Kopurua");
                            try {
                                int ateKopurua = sc.nextInt();
                                autoa.SetAte_Kop(ateKopurua);
                                break;
                            } catch (java.util.InputMismatchException e) {
                                System.out.println("Sartu duzun balioa ez da zenbaki bat. Mesedez, saiatu berriro.");
                                sc.next();//Zenbaki bat sartzera behartzeko kontrola
                            }
                        }

                        while (true) {
                            System.out.println("Sartu Kontsumoa L/100km");
                            try {
                                double kontsumoa = sc.nextDouble();
                                autoa.setKontsumoa(kontsumoa);
                                break;
                            } catch (java.util.InputMismatchException e) {
                                System.out.println("Sartu duzun balioa ez da zenbaki bat. Mesedez, saiatu berriro.");
                                sc.next();//Zenbaki bat sartzera behartzeko kontrola
                            }
                        }

                        Autozerrenda.add(autoa);
                        Autoak.autoBerria();
                    }
                   
                    break;

                case 2:
                    System.out.println("Autoa kendu aukeratu duzu");
                    for (int i = 0; i < Autozerrenda.size(); i++) {
                        System.out.println((i + 1) + ": " + Autozerrenda.get(i).toString());
                    } //Lista bistaratzeko
                    int aukera2;
                    while (true) {
                        System.out.println("Zein auto kendu nahi duzu?");
                        try {
                            aukera2 = sc.nextInt();
                            break; 
                        } catch (java.util.InputMismatchException e) {
                            System.out.println("Sartu duzun balioa ez da zenbaki bat. Mesedez, saiatu berriro.");
                            sc.next();//Zenbaki bat sartzera behartzeko kontrola
                        }
                    }
                    if (aukera2 >= 1 && aukera2 <= Autozerrenda.size()) {
                        Autozerrenda.remove(aukera2 - 1);
                        Autoak.autoaKendu();
                    } else {
                        System.out.println("Zenbakia ez da baliozkoa");
                    }//Listan dagoen elementu bat aukeratzera behartzeko
                    break;

                case 3:
                    System.out.println("Autoak ikusi  aukeratu duzu");
                    for (Autoak auto : Autozerrenda) {
                        System.out.println(auto.toString());
                    } //Lista bistaratzeko
                    break;

                case 4:
                    int aukera3;
                    while (true) {
                        System.out.println("Zein auto editatu nahi duzu?");
                        for (int i = 0; i < Autozerrenda.size(); i++) {
                            System.out.println((i + 1) + ": " + Autozerrenda.get(i).toString());
                        }//Lista bistaratzeko
                        try {
                            aukera3 = sc.nextInt();
                            break; 
                        } catch (java.util.InputMismatchException e) {
                            System.out.println("Sartu duzun balioa ez da zenbaki bat. Mesedez, saiatu berriro.");
                            sc.next();//Zenbaki bat sartzera behartzeko kontrola
                        }
                    }
                    if (aukera3 >= 1 && aukera3 <= Autozerrenda.size()) {
                        Autoak Autoakeditatu = Autozerrenda.get(aukera3 - 1);
                        
                        System.out.println("Autoaren zein balio aldatu nahi duzu? (Marka/Modeloa/Ateak/Pertsonak/Erregaia/Kontsumoa)");
                        String editatu = sc.next();

                        switch (editatu.toLowerCase()) {
                            case "marka":
                                System.out.println("Sartu autoaren Marka");
                                sc.nextLine(); 
                                String markaString = sc.nextLine();
                                Autoakeditatu.SetMarka(markaString);
                                break;
                            case "modeloa":
                                System.out.println("Sartu autoaren Modeloa");
                                sc.nextLine(); 
                                String modeloaString = sc.nextLine();
                                Autoakeditatu.SetModeloa(modeloaString);
                                break;
                            case "ateak":
                                System.out.println("Sartu autoaren Ate Kopurua");
                                while (true) {
                                    try {
                                        int ateKopurua = sc.nextInt();
                                        Autoakeditatu.SetAte_Kop(ateKopurua);
                                        break;
                                    } catch (java.util.InputMismatchException e) {
                                        System.out.println("Sartu duzun balioa ez da zenbaki bat. Mesedez, saiatu berriro.");
                                        sc.next();//Zenbaki bat sartzera behartzeko kontrola
                                    }
                                }
                                break;
                            case "pertsonak":
                                System.out.println("Sartu autoaren Pertsona Kopurua");
                                while (true) {
                                    try {
                                        int pertsonaKopurua = sc.nextInt();
                                        Autoakeditatu.setPertsonaKop(pertsonaKopurua);
                                        break;
                                    } catch (java.util.InputMismatchException e) {
                                        System.out.println("Sartu duzun balioa ez da zenbaki bat. Mesedez, saiatu berriro.");
                                        sc.next();//Zenbaki bat sartzera behartzeko kontrola
                                    }
                                }
                                break;
                            case "erregaia":
                                System.out.println("Sartu autoaren Erregai Mota");
                                sc.nextLine(); 
                                String erregaiString = sc.nextLine();
                                Autoakeditatu.SetErregaiMota(erregaiString);
                                break;
                            case "kontsumoa":
                                System.out.println("Sartu autoaren Kontsumoa L/100km");
                                while (true) {
                                    try {
                                        double kontsumoa = sc.nextDouble();
                                        Autoakeditatu.setKontsumoa(kontsumoa);
                                        break;
                                    } catch (java.util.InputMismatchException e) {
                                        System.out.println("Sartu duzun balioa ez da zenbaki bat. Mesedez, saiatu berriro.");
                                        sc.next();//Zenbaki bat sartzera behartzeko kontrola
                                    }
                                }
                                break;
                            default:
                                System.out.println("Aukera ez da baliozkoa");
                                break;
                        }
                    } else {
                        System.out.println("Zenbakia ez da baliozkoa");
                    }
                    break;

                case 5:
                    Autoak.erakutsiAutoak();
                    break;

                case 0:
                    System.out.println("Exekuzioa amaitu da.");
                    break;
            }

        } while (aukera != 0);

        sc.close();
    }

}
