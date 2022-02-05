public class Cat {
    private String name;
    public Cat (String name){
        this.name= name;
    }
    public void setName(String n){
        name= n;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return "Cat: "+ name;
    }
}
