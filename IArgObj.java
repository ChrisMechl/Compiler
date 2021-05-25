public class IArgObj extends ArgObj {
    private int i;

    public IArgObj(String s) {
        this.i = Integer.parseInt(s);
    }
    
    public int getInt() {
        return i;
    }

}