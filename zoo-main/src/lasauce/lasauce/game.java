package lasauce;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import lasauce.animaux.*;
import lasauce.Employee.*;
import lasauce.Enclos.Enclos;
import lasauce.Loup.*;

import java.util.Collections;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class game {
	public static void clearScreen() {  
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
	   }
	public static void timeOut(String nomEspece, String text, int seconde) {
		try {
			TimeUnit.SECONDS.sleep(seconde);
			System.out.println(nomEspece + " " + text);
	    } catch (InterruptedException e) {
			System.err.format("IOException: %s%n", e);
		}
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String alpha = "a";
    	String beta = "b";
    	String gamma = "c";
    	String delta = "d";
    	String epsilon = "e";
    	String zeta = "f";

    	int alphaPower = 30;
   	 	int betaPower = 29;
    	int gammaPower = 28;
    	int deltaPower = 27;
    	int epsilonPower = 26;
    	int zetaPower = 25;
		
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

		// liste mort 
		List<Lycanthrope> allLycanDead = new ArrayList<Lycanthrope>();

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

		Lycanthrope myLycanF = new Lycanthrope("Ned Stark le Lycanthrope", "male", 90, 175, 19, alpha, alphaPower);
		Lycanthrope myLycanH = new Lycanthrope("Lupin le Lycanthrope", "femelle", 90, 215, 19, alpha, alphaPower);
		Lycanthrope myLycanF2 = new Lycanthrope("Loup garou furieux", "Femelle", 150, 300, 19, beta, betaPower);
		Lycanthrope myLycanH2 = new Lycanthrope("Loup garou Kawaiine", "Male", 110, 200, 19, gamma, gammaPower);
		Lycanthrope myLycanF3 = new Lycanthrope("Loup garou miaou", "Femelle", 110, 370, 19, delta, deltaPower);
		Lycanthrope myLycanH3 = new Lycanthrope("Loup garou Audran", "Male", 110, 100, 19, epsilon, epsilonPower);
		Lycanthrope myLycan7 = new Lycanthrope("Loup garou de la Lune", "male", 95, 180, 19, beta, betaPower);
		Lycanthrope myLycan8 = new Lycanthrope("Loup garou Sylvestre", "femelle", 100, 170, 19, gamma, gammaPower);
		Lycanthrope myLycan9 = new Lycanthrope("Loup garou des Montagnes", "male", 105, 190, 19, delta, deltaPower);
		Lycanthrope myLycan10 = new Lycanthrope("Loup garou de la Forêt", "femelle", 110, 160, 19, epsilon, epsilonPower);
		Lycanthrope myLycan11 = new Lycanthrope("Loup garou de la Vallée", "male", 115, 200, 19, zeta, zetaPower);
		Lycanthrope myLycan12 = new Lycanthrope("Loup garou de la Rivière", "femelle", 90, 165, 19, alpha, alphaPower);
		Lycanthrope myLycan13 = new Lycanthrope("Loup garou du Désert", "male", 120, 175, 19, beta, betaPower);
		Lycanthrope myLycan14 = new Lycanthrope("Loup garou des Neiges", "femelle", 85, 185, 19, gamma, gammaPower);
		Lycanthrope myLycan15 = new Lycanthrope("Loup garou de l'Océan", "male", 130, 195, 19, delta, deltaPower);
		Lycanthrope myLycan16 = new Lycanthrope("Loup garou de la Colline", "femelle", 95, 180, 19, epsilon, epsilonPower);
		allLycan.add(myLycanF);	
		allLycan.add(myLycanH);
		allLycan.add(myLycanF2);	
		allLycan.add(myLycanH2);
		allLycan.add(myLycanF3);	
		allLycan.add(myLycanH3);
		allLycan.add(myLycan7);
		allLycan.add(myLycan8);
		allLycan.add(myLycan9);
		allLycan.add(myLycan10);
		allLycan.add(myLycan11);
		allLycan.add(myLycan12);
		allLycan.add(myLycan13);
		allLycan.add(myLycan14);
		allLycan.add(myLycan15);
		allLycan.add(myLycan16);


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

		

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez choisir un animal entre : \n 'Dragon','Kraken','Licorne', 'Lycanthrope', 'Megalodon','Nymphe', 'Phoenix', 'Sirene'\n\n");
		String firstAnimal = sc.nextLine();
		animal = firstAnimal;
		isPlaying = true;

		int compteurAge = 0;

	
		while(isPlaying == true) {
			Enclos dragEnclos = new Enclos( 1500, 30, allDrag.size(), "Bon", "Dragon");
			Enclos krakEnclos = new Enclos( 330, 10, allKraken.size(), "Bon", "Kraken");
			Enclos LicEnclos = new Enclos( 1050, 15, allLicorne.size(), "Bon", "Licorne");
			Enclos LycanEnclos = new Enclos( 10050, 100, allLycan.size(), "Bon", "Lycanthrope");
			Enclos MegEnclos = new Enclos( 1500, 6, allMega.size(), "Bon", "Megalodon");
			Enclos NymEnclos = new Enclos( 1500, 20, allNym.size(), "Bon", "Nymphe");
			Enclos PhoenixEnclos = new Enclos( 7000, 30, allPho.size(), "Bon", "Phoenix");
			Enclos SireneEnclos = new Enclos( 6000, 30, allSi.size(), "Bon", "Sirene");
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
				System.out.println("Veuillez faire une action entre : (manger, son, soin, dormir, pondre, nager )");
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
				System.out.println("Veuillez faire une action entre : (manger, son, soin, dormir, courrir, accoucher, infoLoup, dominer, combatMort, interragir)");
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
							dragToSound.son(dragToSound.getNomEspece());
							dragToSound.setSante(dragToSound.getSante()-5);
						}
						break;
					case "soin":
				    	for(Dragon dragToHealth : allDrag) {
							dragToHealth.soin(dragToHealth.getNomEspece());
						}
						break;
					case "dormir":
				    	for(Dragon dragToSleep : allDrag) {
							dragToSleep.dormir(dragToSleep.getNomEspece());
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
				case "Kraken":
				    switch(action) {
						case "manger":
						    for(Kraken krakToEat : allKraken) {krakToEat.manger(krakToEat.getNomEspece());};
							break;
						case "son":
						    for(Kraken krakToSon : allKraken) {krakToSon.son(krakToSon.getNomEspece());};
							break;
						case "soin":
						    for(Kraken krakToHealth : allKraken) {krakToHealth.soin(krakToHealth.getNomEspece());};
							break;
						case "dormir":
						    for(Kraken krakToSleep : allKraken) {krakToSleep.dormir(krakToSleep.getNomEspece());};
							break;
						case "nager":
						    for(Kraken krakToSwim : allKraken) {krakToSwim.nager(krakToSwim.getNomEspece());};
							break;
						case "pondre":
						    System.out.println("Voici la liste des Kraken : ");
							for(Kraken krakToFuck : allKraken) {System.out.println(krakToFuck.getNomEspece()+ "  "+ krakToFuck.getSexe());}
							System.out.println("Choisissez une, femelle : ");
							Scanner inpB = new Scanner(System.in);
		                    String femelle = inpB.nextLine();
							System.out.println("Choisissez un male dominant : ");
							Scanner inpF = new Scanner(System.in);
		                    String male = inpF.nextLine();
							System.out.println("Bien... Kraken compatible à se reproduire.");
							try {
			    				TimeUnit.SECONDS.sleep(5);
								System.out.println(femelle + " " + male + " se reproduisent...");
								try {
			    					TimeUnit.SECONDS.sleep(5);
									System.out.println("Wow... l'enfant a éclos ! Choisissez un nom : ");
									Scanner t = new Scanner(System.in);
		                            String enfant = t.nextLine();
									allKraken.add(new Kraken(enfant, "male", 15, 150, 0));
									System.out.println("Voici la liste de kraken : ");
									for(Kraken krak : allKraken) {System.out.println(krak.getNomEspece());}
	 					    	} catch (InterruptedException e) {
									System.err.format("IOException: %s%n", e);
								}
	 					    } catch (InterruptedException e) {
								System.err.format("IOException: %s%n", e);
							}
							break;
							
					}
					break;
				case "Licorne": // (manger, son, soin, dormir, courrir, accoucher )
				    switch(action){
						case "manger":
						    for(Licorne liToEat : allLicorne) {liToEat.manger(liToEat.getNomEspece());}
							break;
						case "son":
						    for(Licorne liToSound : allLicorne) {liToSound.son(liToSound.getNomEspece());}
							break;
						case "soin":
						    for(Licorne liToHealth : allLicorne) {liToHealth.soin(liToHealth.getNomEspece());}
							break;
						case "dormir":
						    for(Licorne liToSleep : allLicorne) { liToSleep.dormir(liToSleep.getNomEspece());}
							break;
						case "accoucher":
						     System.out.println("Voici la liste des Licornes : ");
							for(Licorne liToFuck : allLicorne) {System.out.println(liToFuck.getNomEspece()+ "  "+ liToFuck.getSexe());}
							System.out.println("Choisissez une, femelle : ");
							Scanner inpB = new Scanner(System.in);
		                    String femelle = inpB.nextLine();
							System.out.println("Choisissez un male dominant : ");
							Scanner inpF = new Scanner(System.in);
		                    String male = inpF.nextLine();
							System.out.println("Bien... Licorne compatible à se reproduire.");
							try {
			    				TimeUnit.SECONDS.sleep(5);
								System.out.println(femelle + " " + male + " se reproduisent...");
								try {
			    					TimeUnit.SECONDS.sleep(5);
									System.out.println("Wow... l'enfant a né ! Choisissez un nom : ");
									Scanner t = new Scanner(System.in);
		                            String enfant = t.nextLine();
									allLicorne.add(new Licorne(enfant, "male", 15, 50, 0));
									System.out.println("Voici la liste de Licorne : ");
									for(Licorne li : allLicorne) {System.out.println(li.getNomEspece());}
	 					    	} catch (InterruptedException e) {
									System.err.format("IOException: %s%n", e);
								}
	 					    } catch (InterruptedException e) {
								System.err.format("IOException: %s%n", e);
							}
							break;
					}
					break;
					case "Megalodon": // (manger, son, soin, dormir, pond, nager)
						switch(action){
							case "manger":
						    	for(Megalodon MegaToEat : allMega) {MegaToEat.manger(MegaToEat.getNomEspece());}
								break;
							case "son":
						    	for(Megalodon MegaToSound : allMega) {MegaToSound.son(MegaToSound.getNomEspece());}
								break;
							case "soin":
						    	for(Megalodon MegaToHealth : allMega) {MegaToHealth.soin(MegaToHealth.getNomEspece());}
								break;
							case "dormir":
						    	for(Megalodon MegaToSleep : allMega) { MegaToSleep.dormir(MegaToSleep.getNomEspece());}
								break;
							case "pond":
						    	System.out.println("Voici la liste des Megalodon : ");
								for(Megalodon MegaToFuck : allMega) {System.out.println(MegaToFuck.getNomEspece()+ "  "+ MegaToFuck.getSexe());}
								System.out.println("Choisissez une, femelle : ");
								Scanner inpB = new Scanner(System.in);
		                    	String femelle = inpB.nextLine();
								System.out.println("Choisissez un male dominant : ");
								Scanner inpF = new Scanner(System.in);
		                    	String male = inpF.nextLine();
								System.out.println("Bien... Megalodon compatible à se reproduire.");
								try {
			    					TimeUnit.SECONDS.sleep(5);
									System.out.println(femelle + " " + male + " se reproduisent...");
									try {
			    						TimeUnit.SECONDS.sleep(5);
										System.out.println("Wow... l'enfant a né ! Choisissez un nom : ");
										Scanner t = new Scanner(System.in);
		                         		String enfant = t.nextLine();
										allMega.add(new Megalodon(enfant, "male", 15, 50, 0));
										System.out.println("Voici la liste de Megalodon : ");
										for(Megalodon Mega : allMega) {System.out.println(Mega.getNomEspece());}
	 					    		} catch (InterruptedException e) {
										System.err.format("IOException: %s%n", e);
									}
	 					    	} catch (InterruptedException e) {
									System.err.format("IOException: %s%n", e);
								}
							break;
							case "nager":
						    	for(Megalodon MegToSwim : allMega) { MegToSwim.nager(MegToSwim.getNomEspece());}
								break;
						}
						break;

					case "Nymphe": //(manger, son, soin, dormir, renaitre, accoucher)
				    	switch(action) {
							case "manger":
						    	for(Nymphe NymToEat : allNym) {NymToEat.manger(NymToEat.getNomEspece());};
								break;
							case "son":
						    	for(Nymphe NymToSon : allNym) {NymToSon.son(NymToSon.getNomEspece());};
								break;
							case "soin":
						    	for(Nymphe NymToHealth : allNym) {NymToHealth.soin(NymToHealth.getNomEspece());};
								break;
							case "dormir":
						    	for(Nymphe NymToSleep : allNym) {NymToSleep.dormir(NymToSleep.getNomEspece());};
								break;
							case "renaitre":
						    	for(Nymphe NymToRespawn : allNym) {NymToRespawn.dormir(NymToRespawn.getNomEspece());};
								break;
							case "accoucher":
						    	System.out.println("Voici la liste des Nymphes : ");
								for(Nymphe NymToFuck : allNym) {System.out.println(NymToFuck.getNomEspece()+ "  "+ NymToFuck.getSexe());}
								System.out.println("Choisissez une, femelle : ");
								Scanner inpB = new Scanner(System.in);
		                    	String femelle = inpB.nextLine();
								System.out.println("Choisissez un male dominant : ");
								Scanner inpF = new Scanner(System.in);
		                    	String male = inpF.nextLine();
								System.out.println("Bien... Nymphe compatible à se reproduire.");
								try {
			    					TimeUnit.SECONDS.sleep(5);
									System.out.println(femelle + " " + male + " se reproduisent...");
									try {
			    						TimeUnit.SECONDS.sleep(5);
										System.out.println("Wow... l'enfant a éclos ! Choisissez un nom : ");
										Scanner t = new Scanner(System.in);
		                    	        String enfant = t.nextLine();
										allNym.add(new Nymphe(enfant, "male", 15, 150, 0));
										System.out.println("Voici la liste de Nymphe : ");
										for(Nymphe Nym : allNym) {System.out.println(Nym.getNomEspece());}
	 					    		} catch (InterruptedException e) {
										System.err.format("IOException: %s%n", e);
									}
	 					   	 } catch (InterruptedException e) {
									System.err.format("IOException: %s%n", e);
								}
								break;
							
						}
						break;
					case "Phoenix": //(manger, son, soin, dormir, pond, renaitre, voler)
				    	switch(action) {
							case "manger":
							    for(Phoenix PhoToEat : allPho) {PhoToEat.manger(PhoToEat.getNomEspece());};
								break;
							case "son":
							    for(Phoenix PhoToSon : allPho) {PhoToSon.son(PhoToSon.getNomEspece());};
								break;
							case "soin":
							    for(Phoenix PhoToHealth : allPho) {PhoToHealth.soin(PhoToHealth.getNomEspece());};
								break;
							case "dormir":
							    for(Phoenix PhoToSleep : allPho) {PhoToSleep.dormir(PhoToSleep.getNomEspece());};
								break;
							case "renaitre":
							    for(Phoenix PhoToRespawn : allPho) {PhoToRespawn.dormir(PhoToRespawn.getNomEspece());};
								break;
							case "voler":
							    for(Phoenix PhoToFly : allPho) {PhoToFly.dormir(PhoToFly.getNomEspece());};
								break;
							case "pond":
							    System.out.println("Voici la liste des Phoenix : ");
								for(Phoenix PhoToFuck : allPho) {System.out.println(PhoToFuck.getNomEspece()+ "  "+ PhoToFuck.getSexe());}
								System.out.println("Choisissez une, femelle : ");
								Scanner inpB = new Scanner(System.in);
		               		     String femelle = inpB.nextLine();
								System.out.println("Choisissez un male dominant : ");
								Scanner inpF = new Scanner(System.in);
		                    	String male = inpF.nextLine();
								System.out.println("Bien... Phoenix compatible à se reproduire.");
								try {
			    					TimeUnit.SECONDS.sleep(5);
									System.out.println(femelle + " " + male + " se reproduisent...");
									try {
			    						TimeUnit.SECONDS.sleep(5);
										System.out.println("Wow... l'enfant a éclos ! Choisissez un nom : ");
										Scanner t = new Scanner(System.in);
		                    	        String enfant = t.nextLine();
										allPho.add(new Phoenix(enfant, "male", 15, 150, 0));
										System.out.println("Voici la liste de Phoenix : ");
										for(Phoenix Pho : allPho) {System.out.println(Pho.getNomEspece());}
	 					    		} catch (InterruptedException e) {
										System.err.format("IOException: %s%n", e);
									}
	 					    	} catch (InterruptedException e) {
									System.err.format("IOException: %s%n", e);
								}
								break;
							
						}
						break;

				case "Sirene": //(manger, son, soin, dormir, nager, accoucher)
				    switch(action) {
						case "manger":
						    for(Sirene SirToEat : allSi) {SirToEat.manger(SirToEat.getNomEspece());};
							break;
						case "son":
						    for(Sirene SirToSon : allSi) {SirToSon.son(SirToSon.getNomEspece());};
							break;
						case "soin":
						    for(Sirene SirToHealth : allSi) {SirToHealth.soin(SirToHealth.getNomEspece());};
							break;
						case "dormir":
						    for(Sirene SirToSleep : allSi) {SirToSleep.dormir(SirToSleep.getNomEspece());};
							break;
						case "nager":
						    for(Sirene SirToSwim : allSi) {SirToSwim.nager(SirToSwim.getNomEspece());};
							break;
						case "accoucher":
						    System.out.println("Voici la liste des Sirenes : ");
							for(Sirene SirToFuck : allSi) {System.out.println(SirToFuck.getNomEspece()+ "  "+ SirToFuck.getSexe());}
							System.out.println("Choisissez une, femelle : ");
							Scanner inpB = new Scanner(System.in);
		                    String femelle = inpB.nextLine();
							System.out.println("Choisissez un male dominant : ");
							Scanner inpF = new Scanner(System.in);
		                    String male = inpF.nextLine();
							System.out.println("Bien... Sirene compatible à se reproduire.");
							try {
			    				TimeUnit.SECONDS.sleep(5);
								System.out.println(femelle + " " + male + " se reproduisent...");
								try {
			    					TimeUnit.SECONDS.sleep(5);
									System.out.println("Wow... l'enfant a éclos ! Choisissez un nom : ");
									Scanner t = new Scanner(System.in);
		                            String enfant = t.nextLine();
									allSi.add(new Sirene(enfant, "male", 15, 150, 0));
									System.out.println("Voici la liste de Sirene : ");
									for(Sirene Sir : allSi) {System.out.println(Sir.getNomEspece());}
	 					    	} catch (InterruptedException e) {
									System.err.format("IOException: %s%n", e);
								}
	 					    } catch (InterruptedException e) {
								System.err.format("IOException: %s%n", e);
							}
							break;
							
					}
					break;
					case "Lycanthrope":
					switch(action) {
						case "manger":
						    for(Lycanthrope lycanToEat : allLycan) {lycanToEat.manger(lycanToEat.getNomEspece());}
							break;
						case "son":
						    for(Lycanthrope lycanToSound : allLycan) {lycanToSound.son(lycanToSound.getNomEspece());}
							break;
						case "soin":
						    for(Lycanthrope lycanToHealth : allLycan) {lycanToHealth.soin(lycanToHealth.getNomEspece());}
							break;
						case "dormir" :
						    for(Lycanthrope lycanToSleep : allLycan) {lycanToSleep.dormir(lycanToSleep.getNomEspece());}
							break;
						case "courrir":
						    for(Lycanthrope lycanToRun : allLycan) {lycanToRun.courrir(lycanToRun.getNomEspece());}
							break;
						case "accoucher":
						 	System.out.println("Voici la liste des Sirenes : ");
							for(Lycanthrope lycanToFuck : allLycan) {System.out.println(lycanToFuck.getNomEspece()+ "  "+ lycanToFuck.getSexe());}
							System.out.println("Choisissez une, femelle : ");
							Scanner inpB = new Scanner(System.in);
		                    String femelle = inpB.nextLine();
							System.out.println("Choisissez un male dominant : ");
							Scanner inpF = new Scanner(System.in);
		                    String male = inpF.nextLine();
							System.out.println("Bien... Lycanthrope compatible à se reproduire.");
							try {
			    				TimeUnit.SECONDS.sleep(5);
								System.out.println(femelle + " " + male + " se reproduisent...");
								try {
			    					TimeUnit.SECONDS.sleep(5);
									System.out.println("Wow... l'enfant a éclos ! Choisissez un nom : ");
									Scanner t = new Scanner(System.in);
		                            String enfant = t.nextLine();
									allLycan.add(new Lycanthrope(enfant, "male", 15, 150, 0, zeta, zetaPower));
									System.out.println("Voici la liste de Lycanthrope : ");
									for(Lycanthrope ly : allLycan) {System.out.println(ly.getNomEspece());}
	 					    	} catch (InterruptedException e) {
									System.err.format("IOException: %s%n", e);
								}
	 					    } catch (InterruptedException e) {
								System.err.format("IOException: %s%n", e);
							}
							break;
						case "dominer":
						    int attaquantRang = (int)(Math.random() * allLycan.size()-1);
							int defenseurRang = (int)(Math.random() * allLycan.size()-1);
							Lycanthrope lycanAttaquant = allLycan.get(attaquantRang);
							Lycanthrope lycanDefenseur = allLycan.get(defenseurRang);
							lycanAttaquant.accomplirDomination(lycanDefenseur);
							break;
						case "infoLoup":
						    for(Lycanthrope ly : allLycan) {ly.infoLoup();}
							break;
							
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
				for(Lycanthrope lyc : allLycan) {lyc.vieillir(lyc.getNomEspece());}
				for(Megalodon meg : allMega) {meg.vieillir(meg.getNomEspece());}
				for(Nymphe nym : allNym) {nym.vieillir(nym.getNomEspece());}
				for(Phoenix p : allPho) {p.vieillir(p.getNomEspece());}
				for(Sirene si : allSi) {si.vieillir(si.getNomEspece());}
				dragEnclos.degradation();
			}
			for(Dragon testDragSleep : allDrag) {
				if(testDragSleep.getSante() < 5) {
					System.out.println(testDragSleep.getNomEspece() + " s'est mit a dormir pour récupérer de la vie");
					System.out.println(" ");
					testDragSleep.dormir(testDragSleep.getNomEspece());
					timeOut(testDragSleep.getNomEspece(), "a fini de dormir et a récupéré sa vie", 5);
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
							break;
						case "Kraken":
						    krakEnclos.getDonneeEnclos();
							break;
						case "Licorne":
						    LicEnclos.getDonneeEnclos();
							break;
						case "Lycanthrope":
						    LycanEnclos.getDonneeEnclos();
							break;
						case "Megalodon":
						    MegEnclos.getDonneeEnclos();
							break;
						case "Nymphe":
						    NymEnclos.getDonneeEnclos();
							break;
						case "Phoenix":
						    PhoenixEnclos.getDonneeEnclos();
							break;
						case "Sirene":
						    SireneEnclos.getDonneeEnclos();
							break;
					}
					break;
				case "nettoyer enclos":
				    System.out.println("-------------------------");
				    dragEnclos.nettoyerEnclos();
					System.out.println("-------------------------");
					break;

			}
		}
		
	}
}
