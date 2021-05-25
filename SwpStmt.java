public class SwpStmt extends Stmt {
    private Parser parser;
    private String[] args;

    public SwpStmt() {
        this.parser = new NullParser();
    }
    public void genCode(String[] args) {
        mem.add(SWP);
        pc++;
    }
}