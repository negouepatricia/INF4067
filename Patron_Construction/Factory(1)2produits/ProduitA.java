public abstract class ProduitA {

    public abstract void methodeA();
}

public class ProduitA1 extends ProduitA{

    public void methodeA(){

        System.out.println("je suis un produit de type A1");
        System.out.println("ProduitA1.methodeA()");
    }
}

public class produitA2 extends ProduitA{

    public void methodeA(){

        System.out.println("je suis un produit de type A2");
        System.out.println("ProduitA2.methodeA()");
    }
}


