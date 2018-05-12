package at.fhj.iit;

public class IAmGreet {
   private String name = null;

   public IAmGreet (String name){
       this.name = name;

   }

    public void setName(String name) {

       this.name = name;
    }

    public String getName() {

       return name;
    }

    public String SayHello(String name) {
        return "Hello, " + name;
    }

    public String SayGoodbye(String name) {
        return "Good Bye, " + name;
    }

}


