
enum laptop {
    Lenovo(300), XPS(400), MackBook(1200), thinkpad;

    private int price;

    private laptop(){

    }
    private laptop(int price) {
        System.out.println(price);
        this.price = price;
    }
    public int getPrice(){
        return price;
     }
     public void setPrice(int price){
          this.price=price;
      }
   
}

enum solution {
    Running, pending, faild, success;
}

public class enums {
    public static void main(String[] args) {

        // solution s = solution.success;

        // switch (s) {
        //     case Running:
        //         System.out.println("Running..");
        //         break;
        //     case faild:
        //         System.out.println("faild!");
        //         break;
        //     case pending:
        //         System.out.println("pending..");
        //         break;
        //     case success:
        //         System.out.println("Done✅");
        //         break;
        //     default:
        //         throw new AssertionError();
        // }
        // solution[] ss = solution.values();
        // for (solution st : ss) {
        //     System.out.println(st);
        // }


        //for laptop class
        laptop []lap=laptop.values();
        for(laptop l:lap){
           System.out.println(l+ " :" +l.getPrice());
        }
        

    }
}