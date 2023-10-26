

public class ProduitFactory{

    public static final int TYPE_PRODUITA1= 1;
     public static final int TYPE_PRODUITA2= 2;
      public static final int TYPE_PRODUITA3= 3;


public ProduitA getproduitA(int typeProduit){

    ProduitA ProduitA = null;

    switch (typeProduit){
           
           case TYPE_PRODUITA1:
            ProduitA = new ProduitA1();
            break;

            case TYPE_PRODUITA2:
            ProduitA = new ProduitA2();
            break;
            
            case TYPE_PRODUITA3:
            ProduitA = new ProduitA3();
            break;
            default:
                throw new IllegalArgumentException("type de produit inconnu");


    }

    return ProduitA;
}
}