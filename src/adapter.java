public class adapter implements  targetFactory{
    private adaptee a;
    public adapter(adaptee a){
        this.a=a;
    }
    @Override
    public void request() {
        this.a.specificRequest();
    }
}
