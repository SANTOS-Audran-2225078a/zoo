package lasauce;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import lasauce.animaux.*;
import lasauce.Employee.*;
import lasauce.Enclos.Enclos;

import java.util.Collections;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class game {
	public static void clearScreen() {  
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
	   }
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Bienvenue dans le Zoo La Sauce\n\n---------------------------\n");
		boolean isPlaying = false;
		String animal = "";
		List<Dragon> allDrag = new ArrayList<Dragon>();
		List<Dragon> allDragDie = new ArrayList<Dragon>();
		List<Kraken> allKraken = new ArrayList<Kraken>();
		List<Licorne> allLicorne = new ArrayList<Licorne>();
	    List<Lycanthrope> allLycan = new ArrayList<Lycanthrope>();
		List<Megalodon> allMega = new ArrayList<Megalodon>();
		List<Nymphe> allNym = new ArrayList<Nymphe>();
	    List<Phoenix> allPho = new ArrayList<Phoenix>();
	    List<Sirene> allSi = new ArrayList<Sirene>();

		Dragon myDragonH = new Dragon("Drogon le Dragon","male", 1700, 700, 4);
		Dragon myDragonF = new Dragon("Syrax le Dragon","femelle", 1500, 600, 4);
		allDrag.add(myDragonF);
		allDrag.add(myDragonH);

		Kraken myKrakenF = new Kraken("Schlingue le Kraken", "femelle", 60, 165, 21);
		Kraken myKrakenH = new Kraken("Arya le Kraken", "male", 40, 160, 12);
		allKraken.add(myKrakenF);
		allKraken.add(myKrakenH);

		Licorne myLicorneF = new Licorne("Ygritte la Licorne", "femelle", 80, 185, 20);
		Licorne myLicorneH = new Licorne("Audran la Licorne", "male", 60, 165, 25);
		allLicorne.add(myLicorneF);
		allLicorne.add(myLicorneH);

		Lycanthrope myLycanF = new Lycanthrope("Ned Stark le Lycanthrope", "male", 90, 175, 49);
		Lycanthrope myLycanH = new Lycanthrope("Lupin le Lycanthrope", "femelle", 90, 215, 39);
		Lycanthrope myLycanF2 = new Lycanthrope("Loup garou furieux", "Femelle", 150, 300, 30);
		Lycanthrope myLycanH2 = new Lycanthrope("Loup garou Kawaiine", "Male", 110, 200, 10);
		Lycanthrope myLycanF3 = new Lycanthrope("Loup garou miaou", "Femelle", 110, 370, 25);
		Lycanthrope myLycanH3 = new Lycanthrope("Loup garou Audran", "Male", 110, 100, 2);
		allLycan.add(myLycanF);	
		allLycan.add(myLycanH);
		allLycan.add(myLycanF2);	
		allLycan.add(myLycanH2);
		allLycan.add(myLycanF3);	
		allLycan.add(myLycanH3);

		Megalodon myMegaloF = new Megalodon("Cersei Lanister le Mégalodon", "femelle", 70, 180, 30);
		Megalodon myMegaloH = new Megalodon("Florence le Mégalodon", "male", 110, 190, 20);
		allMega.add(myMegaloF);
		allMega.add(myMegaloH);

		Nymphe myNympheF = new Nymphe("Sansa Stark la Nymphe", "femelle", 65, 170, 16);
		Nymphe myNympheH = new Nymphe("Thierrons la Nymphe", "male",55, 130, 28);
		allNym.add(myNympheF);
		allNym.add(myNympheH);

		Phoenix myPhoenixH = new Phoenix("John Snow le Phoenix", "male", 90, 180, 23);
		Phoenix myPhoenixF = new Phoenix("Dumbledore le Phoenix", "femelle", 60, 180, 170);
		allPho.add(myPhoenixF);
		allPho.add(myPhoenixH);

		Sirene mySireneF = new Sirene("Melisandre la Sirene", "femelle", 50, 160, 250);
	    Sirene mySireneH = new Sirene("Freeze Corleone la Sirene", "male", 60, 180, 25);
		allSi.add(mySireneF);
		allSi.add(mySireneH);

		Maitre directeur = new Maitre("Ugo le maitre");
		
		List<String> enclosOrdre = new ArrayList<String>();
		enclosOrdre.add("Dragon");
		enclosOrdre.add("Kraken");
		enclosOrdre.add("Licorne");
		enclosOrdre.add("Lycanthrope");
		enclosOrdre.add("Megalodon");
		enclosOrdre.add("Nymphe");
		enclosOrdre.add("Phoenix");
		enclosOrdre.add("Sirene");

		Enclos dragEnclos = new Enclos( 150, 30, allDrag.size(), "Bon", "Dragon");

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez choisir un animal entre : \n 'Dragon','Kraken','Licorne', 'Lycanthrope', 'Megalodon','Nymphe', 'Phoenix', 'Sirene'\n\n");
		String firstAnimal = sc.nextLine();
		animal = firstAnimal;
		isPlaying = true;

		int compteurAge = 0;

	
		while(isPlaying == true) {
			System.out.print("Vous êtes dans l'enclos numéro ");
			System.out.print(enclosOrdre.indexOf(animal) + 1);
			System.out.println(" contenant " + animal);

			switch(animal) {
			case "Dragon":
			    System.out.println("-----------------------------------------");
				System.out.println("Veuillez faire une action entre : (manger, son, soin, dormir, courrir, pond, renaitre, nager, voler,  )");
				System.out.println("-----------------------------------------");
				System.out.println("Ou à l'enclos");
				System.out.println("modif enclos, nettoyerEnclos, donnee enclos, changer enclos");
				System.out.println("-----------------------------------------");
				break;
			case "Kraken":
				System.out.println("-----------------------------------------");
				System.out.println("Veuillez faire une action entre : (manger, son, soin, dormir, pond, nager, )");
				System.out.println("-----------------------------------------");
				System.out.println("Ou à l'enclos");
				System.out.println("modif enclos, nettoyerEnclos, donnee enclos, changer enclos");
				System.out.println("-----------------------------------------");
				break;
			case "Licorne":
				System.out.println("-----------------------------------------");
				System.out.println("Veuillez faire une action entre : (manger, son, soin, dormir, courrir, accoucher )");
				System.out.println("-----------------------------------------");
				System.out.println("Ou à l'enclos");
				System.out.println("modif enclos, nettoyerEnclos, donnee enclos, changer enclos");
				System.out.println("-----------------------------------------");
				break;
			case "Lycanthrope":
				System.out.println("-----------------------------------------");
				System.out.println("Veuillez faire une action entre : (manger, son, soin, dormir, courrir, accoucher )");
				System.out.println("-----------------------------------------");
				System.out.println("Ou à l'enclos");
				System.out.println("modif enclos, nettoyerEnclos, donnee enclos, changer enclos");
				System.out.println("-----------------------------------------");
				break;
			case "Megalodon":
				System.out.println("-----------------------------------------");
				System.out.println("Veuillez faire une action entre : (manger, son, soin, dormir, pond, nager, )");
				System.out.println("-----------------------------------------");
				System.out.println("Ou à l'enclos");
				System.out.println("modif enclos, nettoyerEnclos, donnee enclos, changer enclos");
				System.out.println("-----------------------------------------");
				break;
			case "Nymphe":
				System.out.println("-----------------------------------------");
				System.out.println("Veuillez faire une action entre : (manger, son, soin, dormir, renaitre, accoucher )");
				System.out.println("-----------------------------------------");
				System.out.println("Ou à l'enclos");
				System.out.println("modif enclos, nettoyerEnclos, donnee enclos, changer enclos");
				System.out.println("-----------------------------------------");
				break;
			case "Phoenix":
				System.out.println("-----------------------------------------");
				System.out.println("Veuillez faire une action entre : (manger, son, soin, dormir, pond, renaitre, voler, )");
				System.out.println("-----------------------------------------");
				System.out.println("Ou à l'enclos");
				System.out.println("modif enclos, nettoyerEnclos, donnee enclos, changer enclos");
				System.out.println("-----------------------------------------");
				break;
			case "Sirene":
				System.out.println("-----------------------------------------");
				System.out.println("Veuillez faire une action entre : (manger, son, soin, dormir, nager, accoucher )");
				System.out.println("-----------------------------------------");
				System.out.println("Ou à l'enclos");
				System.out.println("modif enclos, nettoyerEnclos, donnee enclos, changer enclos");
				System.out.println("-----------------------------------------");
				break;
			}
			System.out.println(myDragonF.getSante());
			Scanner inp = new Scanner(System.in);
		    String action = inp.nextLine();
			clearScreen();
			switch(action) {
				case "changer enclos":
					System.out.println("-----------------------------------------");
				    System.out.println("Veuillez choisir un animal entre : \n 'Dragon','Kraken','Licorne', 'Lycanthrope', 'Megalodon','Nymphe', 'Phoenix', 'Sirene'\n\n");
					System.out.println("-----------------------------------------");
					Scanner inp4 = new Scanner(System.in);
		    		String newAnimal = inp4.nextLine();
					animal = newAnimal;
					break;
				case "modif enclos":
					System.out.println("Voici l'ordre des animaux actuels ( écrire les 2 noms d'animaux à changer ) : ");
					    for(String elem : enclosOrdre) {
						    System.out.println(elem);
				    	}
					System.out.println("------------------");
					System.out.println("Entrez le premier animal à changer d'enclos");

					Scanner inp1 = new Scanner(System.in);
			        String animaux1 = inp1.nextLine();

					System.out.println("------------------");
					System.out.println("Entrez le deuxième animal à changer d'enclos");

					Scanner inp2 = new Scanner(System.in);
			        String animaux2 = inp2.nextLine();

					directeur.changerEnclos(enclosOrdre, animaux1, animaux2);
				    break;
				case "donnee enclos":
					System.out.println("-------------------------");
				    System.out.println("Quel enclos voulez vous voir ? ");
					System.out.println("-------------------------");
				    Scanner inp3 = new Scanner(System.in);
			        String aniEncl = inp3.nextLine();
					switch(aniEncl) {
						case "Dragon":
						    dragEnclos.getDonneeEnclos();
					}
					break;
				case "nettoyer enclos":
				    System.out.println("-------------------------");
				    dragEnclos.nettoyerEnclos();
					System.out.println("-------------------------");
					break;

			}
			switch(animal) {
				case "Dragon":
				  switch(action) {
					case "manger":
						for(Dragon dragToEat : allDrag)  {
							dragToEat.manger(dragToEat.getNomEspece());
						}
						break;
					case "son":
				    	for(Dragon dragToSound : allDrag) {
							dragToSound.son();
							dragToSound.setSante(dragToSound.getSante()-5);
						}
						break;
					case "soin":
				    	for(Dragon dragToHealth : allDrag) {
							dragToHealth.soin();
						}
						break;
					case "dormir":
				    	for(Dragon dragToSleep : allDrag) {
							dragToSleep.dormir();
						}
						break;
					case "courrir":
				    	for(Dragon dragToRun : allDrag) {
							dragToRun.courrir(dragToRun.getNomEspece());
						}
						break;
					case "nager":
				    	for(Dragon dragToSwim : allDrag) {
							dragToSwim.nager();
							dragToSwim.setSante(dragToSwim.getSante() -20);
						}
				}
				break;
				case "Lycanthrope":
				    switch(action) {

					}
			}
			compteurAge += 1;
			System.out.println(compteurAge);
			if(compteurAge == 3) {
				compteurAge = 0;
				System.out.println("Une année s'est écoulée, tout les animaux prennent 1 an  et perdent de la vie.");
				System.out.println(" ");

				for(Dragon drag : allDrag) {drag.vieillir(drag.getNomEspece());}
				for(Kraken kra : allKraken) {kra.vieillir(kra.getNomEspece());}
				for(Licorne lic : allLicorne) {lic.vieillir(lic.getNomEspece());}
				for(Lycanthrope lyc : allLycan) {lyc.vieillir();}
				for(Megalodon meg : allMega) {meg.vieillir();}
				for(Nymphe nym : allNym) {nym.vieillir();}
				for(Phoenix p : allPho) {p.vieillir();}
				for(Sirene si : allSi) {si.vieillir();}
				dragEnclos.degradation();
			}
			for(Dragon testDragSleep : allDrag) {
				if(testDragSleep.getSante() < 5) {
					System.out.println(testDragSleep.getNomEspece() + " s'est mit a dormir pour récupérer de la vie");
					System.out.println(" ");
					testDragSleep.dormir();
					try {
						TimeUnit.SECONDS.sleep(5);
						System.out.println(testDragSleep.getNomEspece() + " a fini de dormir et a récupéré sa vie");
					} catch (InterruptedException e) {
						System.err.format("IOException: %s%n", e);
					}
				}
			}
			int n = (int)(Math.random() * 20);
			if(n == 4) {

			int i = (int)(Math.random() * allLycan.size()-1);
			System.out.println("\n\n\n\n-------------------------");
			System.out.println(allLycan.get(i).getNomEspece() + " est malade mskn");
			System.out.println("-------------------------\n\n\n");
			try {
				TimeUnit.SECONDS.sleep(5);
				System.out.println("-------------------------");
				System.out.println("Il est vraiment très malade, il a perdu 50 points de vies...");
				System.out.println("-------------------------");
				try {
						TimeUnit.SECONDS.sleep(5);
						System.out.println("Allez dans son enclos puis soignez le, si vous le voulez pas qu'il meurt ...");
						System.out.println("-------------------------");
						try {
							TimeUnit.SECONDS.sleep(5);
							System.out.println("\n\n\n");
						} catch (InterruptedException e) {
							System.err.format("IOException: %s%n", e);
						}
					} catch (InterruptedException e) {
						System.err.format("IOException: %s%n", e);
					}
				
			} catch (InterruptedException e) {
				System.err.format("IOException: %s%n", e);
			}
		}
		}
	}
}
