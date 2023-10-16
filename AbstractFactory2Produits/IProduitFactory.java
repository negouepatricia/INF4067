package AbstractFactory2Produits;

public interface IProduitFactory{
public ProduitA getProduitA();
public ProduitB getProduitB();

}

public class ProduitFactory1 implements IProduitFactory {
    public ProduitA getProduitA(){
        return new ProduitA1();
    }

    public ProduitB getProduitB()
    {
        return new ProduitB1();
    }


}

public class ProduitFactory2 implements IProduitFactory {
    public ProduitA getProduitA(){
        return new ProduitA2();
    }

    public ProduitB getProduitB(){
        return new ProduitB2();
    }

}