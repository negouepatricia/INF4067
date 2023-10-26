public abstract class ProduitFactory {

    public ProduitA getProduitA() {
        return createProduitA();
    }

    protected abstract ProduitA createProduitA();

    public ProduitA getProduit() {
        return null;
    }
}

public class ProduitFactory1 extends ProduitFactory {

    protected ProduitA createProduitA(){
        return new ProduitA1();
    }
}

public class ProduitFactory2 extends ProduitFactory {

    protected ProduitA createProduitA(){
        return new ProduitA2();
    }
}