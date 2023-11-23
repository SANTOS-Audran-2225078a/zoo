package lasauce;
import java.util.Scanner;


public class game {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Bienvenue dans le Zoo La Sauce\n\n---------------------------\n");
		boolean isPlaying = false;
		String animal = "";
		Dragon myDragon = new Dragon("Drogon le Dragon","femelle", 1700, 700, 4);
		Kraken myKraken = new Kraken("Schlingue le Kraken", "femelle", 60, 165, 21);
		Licorne myLicorne = new Licorne("Ygritte la Licorne", "femelle", 80, 185, 20);
		Lycanthrope myLycan = new Lycanthrope("Ned Stark le Lycanthrope", "male", 90, 175, 49);
		Megalodon myMegalo = new Megalodon("Cersei Lanister le Mégalodon", "femelle", 70, 180, 30);
		Nymphe myNymphe = new Nymphe("Sansa Stark la Nymphe", "femelle", 65, 170, 16);
		Phoenix myPhoenix = new Phoenix("John Snow le Phoenix", "male", 90, 180, 23);
		Sirene mySirene = new Sirene("Melisandre la Sirene", "femelle", 50, 106, 250);

		String[] enclosOrdre = {"Dragon", "Kraken", "Licorne", "Lycanthrope", "Megalodon", "Nymphe", "Phoenix", "Sirene"};

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez choisir un animal entre : \n 'Dragon','Kraken','Licorne', 'Lycanthrope', 'Megalodon','Nymphe', 'Phoenix', 'Sirene'\n\n");
		String firstAnimal = sc.nextLine();
		animal = firstAnimal;
		isPlaying = true;
		String toDo;



		while(isPlaying == true) {
			System.out.println("Vous êtes dans l'enclos du " + animal);
			switch(animal) {
			case "Dragon":
				System.out.println("Veuillez faire une action entre : (mettre les actions )");
				break;
			case "Kraken":
				System.out.println("Veuillez faire une action entre : (mettre les actions )");
				break;
			case "Licorne":
				System.out.println("Veuillez faire une action entre : (mettre les actions )");
				break;
			case "Lycanthrope":
				System.out.println("Veuillez faire une action entre : (mettre les actions )");
				break;
			case "Megalodon":
				System.out.println("Veuillez faire une action entre : (mettre les actions )");
				break;
			case "Nymphe":
				System.out.println("Veuillez faire une action entre : (mettre les actions )");
				break;
			case "Phoenix":
				System.out.println("Veuillez faire une action entre : (mettre les actions )");
				break;
			case "Sirene":
				System.out.println("Veuillez faire une action entre : (mettre les actions )");
				break;
			}
			String action = sc.nextLine();
			toDo = action;
		}

	}
}
