class Data {
    private String name;

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name= name;
    }
}
public class accessModi {
    public static void main(String[] main){
        Data d = new Data();
        d.setName("This is Private access");
        System.out.println(d.getName());
    }
}
