package at.fhj.iit;

public class IAmGreet implements Greeter{
    private String name = null;

    public IAmGreet (String name){
        this.name = name;

    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    public void sayHello() {

    }

    @Override
    public void sayGoodbye() {

    }

    public String getName() {

        return name;
    }

    public String SayHello() {
        return "Hello, " + name;
    }

    public String SayGoodbye() {
        return "Good Bye, " + name;
    }

}


