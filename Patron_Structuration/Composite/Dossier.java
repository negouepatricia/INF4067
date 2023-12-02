

import java.util.*;

public class Dossier extends Element {

 
 
 
    private ArrayList<Element> fils = new ArrayList<>();

    public Dossier(String nom, String type) {
        super(nom, type);
    }

    public void ajouter(Element e) {
        this.fils.add(e);
    }

    public void supprimer(Element e) {
        if (this.fils.contains(e)) {
            this.fils.remove(e);
        } else {
            System.out.println("L'élément n'est pas dans le dossier");
        }
    }

    public Element obtenir() {
        if (this.fils.size() > 0) {
            return fils.get(fils.size() - 1);
        } else {
            System.out.println("Le dossier est vide");
        }
    }

    public void decrire() {
        super.decrire();
        if (this.fils.size() > 0) {
            for (int i = 0; i < this.fils.size(); i++) {
                this.fils.get(i).decrire();
            }
        } else {
            System.out.println("Le dossier est vide");
        }
    }

}
