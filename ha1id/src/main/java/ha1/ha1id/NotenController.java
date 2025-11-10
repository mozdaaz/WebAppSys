package ha1.ha1id;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.springframework.stereotype.Controller;

@Controller
public class NotenController {

    public void noteneingabe () {

    Scanner sc = new Scanner(System.in);
        System.out.println("Wie viele Noten willst du eingeben?");
        int anz = sc.nextInt();
        
        List<Double> notenListe = new ArrayList<>();

        System.out.println("Gebe deine Noten ein: ");

        for (int i = 0; i < anz; i++) {
            
            double noten = sc.nextDouble();
            System.out.println("Note " + (i+1) + ": " + noten);
            notenListe.add(noten);        
        }

         // Kontrollausgabe
    System.out.println("Deine eingegebenen Noten: " + notenListe);

    } }