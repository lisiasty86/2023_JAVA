package Podstawy.Listy;

import java.io.IOException;
import java.security.KeyStore;
import java.util.*;

public class ZadDodatkowe {
    /**Napisz program TODO, zalozenia:
     * 1. Program mam menu:
     *      1. Dodaj notatke
     *      2. Skasuj notatke (po wyborze trzeba podac nazwe)
     *      3. Lista notatek
     *      4. Skasuj wszystkie notatki (powinno sie wyswietlic zapytanie czy napewno  T/N)
     *      0. Zamyka program (powinno sie wyswietlic zapytanie czy napewno  T/N)
     *      Przy probie wpisania litery program informuje o zlym wyborze numeru  menu i wyswietla menu ponownie
     * 2. Program nie pozwoli dodac dwoch notatek o tej samej nazwie (albo Map z if albo Set)
     * 3. Program wyswietla aktualna ilosc notatek pod menu glownym
     * 4. Program wyswietla losowa notatke po wcisnieciu przycisku 5
     * 5. Program zlicza wszystkie slowa uzyte we wszystkich notatkach - przycisk 6
     *
     * Rozszerzenie:
     * 1. Program zapisuje notatki do pliku po wcisnieciu przycisku 7
     * 2. Podczas startu, program wczytuje do pamieci wszystkie notatki z pliku
     *
     * Wskazowki:
     * Pomocne moze byc uzycie petli do while, Map<String, String>, iteracji po mapach
     * Pisz program w metodach w klasie Main i implementuj je do metody main()
     * Typ Scanner mozesz uzywac w metodach, nie tylko s statycznej main()*/


    public static void main(String[] args) throws InterruptedException {
        smartThings();
    }

    public static HashMap<String, String> smartThings () throws InterruptedException {
        Map<String, String> smartThings = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int selectedOption;
        String noteName;
        String note;

        //smartThings.

        printMenu();
        System.out.println("Number of notes: " + smartThings.size());
        for (; ; ) {

            try {
                selectedOption = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Please enter correct number");
                continue;
            }
//            printMenu();
//            System.out.println("Number of notes: " + smartThings.size());

            if (selectedOption == 0) {
                String decission;
                System.out.println("Are you sure? Y/N");
                decission = scanner.next().toLowerCase();
                if (decission.equals("y")) {
                    closeProgram();
                } else {
                    break;
                }
            } else if (selectedOption == 1) {
                System.out.println("Please type note name");
                noteName = scanner.next();
                if (smartThings.containsKey(noteName)) {
                    System.out.println("This note name already exists!");
                } else {
                    System.out.println("Please type note");
                    note = scanner.next();
                    smartThings.put(noteName, note);
                }
                printMenu();
                System.out.println("Number of notes: " + smartThings.size());
            } else if (selectedOption == 2) {
                String noteToDelete;
                System.out.println("Type notes name to delete");
                noteToDelete = scanner.next();
                String deleteNoteDecision;
                System.out.println("Are you sure? Y/N");
                deleteNoteDecision = scanner.next().toLowerCase();
                if (deleteNoteDecision.equals("y")) {
                    smartThings.remove(noteToDelete);
                    printMenu();
                    System.out.println("Number of notes: " + smartThings.size());
                } else {
                    continue;
                }
            } else if (selectedOption == 3) {
                System.out.println("***********************");
                smartThings.entrySet().forEach(entry -> {
                    System.out.println(entry.getKey() + " : " + entry.getValue());
                    });
                System.out.println("Press enter to continue");
                try {
                    System.in.read();
                } catch (IOException e) {
                    e.printStackTrace();
                    continue;
                }
                printMenu();
                System.out.println("Number of notes: " + smartThings.size());
            } else if (selectedOption == 4) {
                String clearMapDecision;
                System.out.println("Are you sure? Y/N");
                clearMapDecision = scanner.next().toLowerCase();
                if (clearMapDecision.equals("y")) {
                    smartThings.clear();
                } else {
                    continue;
                }
            } else if (selectedOption == 5) {
                /**Object[] crunchifyKeys = smartThings.keySet().toArray();
                Object key = crunchifyKeys[new Random().nextInt(crunchifyKeys.length)];
                System.out.println("************ Random Value ************ \n" + key + " :: " + smartThings.get(key));
                System.out.println("Press enter to continue");
                try {
                    System.in.read();
                } catch (IOException e) {
                    e.printStackTrace();
                    continue;
                }
                printMenu();
                System.out.println("Number of notes: " + smartThings.size());*/
                if (smartThings.size()>0) {
                    List<String> helperKeys = new ArrayList<>();
                    helperKeys.addAll(smartThings.keySet());
                    Random random = new Random();
                    String helper = helperKeys.get(random.nextInt(smartThings.size()));
                    for (Map.Entry<String, String> entry : smartThings.entrySet()) {
                        if (entry.getKey().equals(helper)) {
                            System.out.println(entry.getKey() + " : " + entry.getValue());
                        }
                    }
                    System.out.println("Press enter to continue");
                    try {
                        System.in.read();
                    } catch (IOException e) {
                        e.printStackTrace();
                        continue;
                    }
                    printMenu();
                    System.out.println("Number of notes: " + smartThings.size());
                } else {
                    System.out.println("There is no note");
                    //printMenu();
                    //System.out.println("Number of notes: " + smartThings.size());
                }
            }

        }return smartThings();
    }

    public static void printMenu() {
        System.out.println("************** Menu ************** \n"
                + "1. Dodaj notatke \n"
                + "2. Skasuj notatke\n"
                + "3. Lista notatek\n"
                + "4. Skasuj wszystkie notatki\n"
                + "5. Wyswietl losowa notatke\n"
                + "6. Zlicz slowa we wszystkich notatkach\n"
                + "7. Zapisz notatki do pliku\n"
                + "0. Zamknij program" );
    }



    public static void closeProgram() {
        System.out.println("Good bye :)");
        System.exit(0);
    }

//    public static void addNote(String noteName, String note) {
//        //Map<String, String> notes = new HashMap<>();
//        if (!.containsKey(noteName)) {
//            notes.put(noteName, note);
//        } else {
//            System.out.println("This notes name already exists!");
//        }
//
//    }
//
//    public static void displayNotes() {
//        System.out.println(notes);
//    }

}
