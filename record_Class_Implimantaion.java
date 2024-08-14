// class kamal{
//     private final int id=1;
//     private final String name="kamal";

//     public kamal(){
            
//     }
//      public int getValue(){
//         return this.id;
//      }

//     @Override
//     public String toString() {
//         return "kamal { id:" +id +" , Name:"+name+"}";
//     }
// }



//Predefine keyword (record) that use that class called the carrier class
record Alian (int id,String name){ 
   
    Alian
    {
        if(id==0)
        throw  new IllegalArgumentException("Can't enter this value");
    }
}

public class record_Class_Implimantaion {
    
    public static void main(String[] args) {
        //     kamal k=new kamal();
        //     System.out.println(k);

        Alian a1=new Alian(20, "Kamal");
        Alian a2=new Alian(22, "goldy");
        // Alian a3=new Alian(0, "goldy");
        System.out.println(a2);

    }
}
