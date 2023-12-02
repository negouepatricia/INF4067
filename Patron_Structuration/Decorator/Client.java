public class Client {
    public static void main(String[] args) {
        Fenetre f = new FenetreSimple();

        f.dessiner("un rectangle avec les bordures");

        f.decrire();

        // decorateur horizontal
        Fenetre dH = new DecorateurCurseurHorizontal(f);
        //decrit
        dH.decrire();
        // decorateur Vertical
        Fenetre dV = new DecorateurCurseurVertical(dH);
        // decrit
        dV.decrire();

    }
}
