import java.util.*;

interface BillBook {
    public void purchased(String st, int a);
    public void sold(String st, int a);
};

 class productlist {
  String items[] = new String[200];
     int i=0;
    public void addProucts(String item) {
     items[i++] = item;

    }
    public void showProducts(){
        for(int j=0; j<i;j++)
        {
           System.out.println(items[java]);
        }
     }
    
}

class productsold extends productlist implements BillBook {
    int sp, cp;
    public void purchased(String bb, int b) {
        cp = b;
        System.out.println(bb + " buyed at rupees " + cp);
    }
    public void sold(String s, int a) {
        sp = a;
        System.out.println(s + " sold in " + sp);
        if (sp > cp) {
            System.out.println(" Profit is " + (sp - cp));
        } else {
            System.out.println("loss on item is " + (cp - sp));
        }
    }
}


class GroceryMangement extends productsold {
    public static void main(String args[]) {
        GroceryMangement sc = new GroceryMangement();
        sc.purchased("floor", 30);
        sc.sold("floor", 40);
        sc.addProucts("cream");
        sc.showProducts();
    }
}