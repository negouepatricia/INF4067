package construction.abstractFactory;

   public abstract class ProduitA {
 
             public abstract void methodeA();

   }

   public class ProduitA1 extends ProduitA {

        public void methodeA(){
            System.out.println("ProduitA1.methodeA()");
        }
   }

   public class ProduitA2 extends ProduitA {

        public void methodeA(){
            System.out.println("ProduitA2.methodeA()");
        }
   }


    public abstract class ProduitB {
 
             public abstract void methodeB();

   }

   public class ProduitB1 extends ProduitB {

        public void methodeB(){
            System.out.println("ProduitB1.methodeB()");
        }
   }

   public class ProduitB2 extends ProduitB {

        public void methodeB(){
            System.out.println("ProduitB2.methodeB()");
        }
   }

    