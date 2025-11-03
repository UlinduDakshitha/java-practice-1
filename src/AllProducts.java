import java.util.Scanner;
public class AllProducts {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Products[] products=new Products[10];

        for(int i=0; i<10;i++){

            System.out.print("Enter Your name:");
            String name= sc.next();

            System.out.print("Enter Your brand:");
            String brand= sc.next();

            System.out.print("Enter your price:");
            double price= sc.nextDouble();

            System.out.print("Enter your type");
            String type= sc.next();

switch (type){

    case"Clothes":
        Clothes clothes=new Clothes();
        clothes.setSize("xl");
        clothes.setName(name);
        clothes.setBrand(brand);
        clothes.setPrice(price);
        clothes.showFinalPrice();
        System.out.print("Full price"+(price - clothes.showFinalPrice()*0.1));
break;

    case"Eloctnics":
        Eloctnics eloctnics=new Eloctnics();
        eloctnics.setName(name);
        eloctnics.setSize("l");
        eloctnics.setBrand(brand);
        eloctnics.setPrice(price);
        eloctnics.showFinalPrice();
        System.out.print("Full price"+(price- eloctnics.showFinalPrice()*0.15));
break;


case"Goceries":
    Goceries goceries=new Goceries();

}
        }
    }

}
