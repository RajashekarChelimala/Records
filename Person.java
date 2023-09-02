public record Person(int id, String name, String address,String phone){

    public Person(String name, String address){
        this(1,name,address,null);
    }

    public void displayName(){
        System.out.println("hello I'm "+name);
    }

    public void justTest(){
        System.out.println("This is testing static method..");
    }
}