public abstract class produitFactory {

    public produitA getproduitA() {
        return createproduitA();
    }

    protected abstract produitA createproduitA();
}

public class produitFactory1 extends produitFactory {

    protected produitA createproduitA(){
        return new produitA1();
    }
}

public class produitFactory2 extends produitFactory {

    protected produitA createproduitA(){
        return new produitA2();
    }
}

public class produitFactory3 extends produitFactory {

    protected produitA createproduitA(){
        return new produitA3();
    }
}