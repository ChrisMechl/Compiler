public class CmpltStmt extends Stmt {
    private Parser parser;
    private String[] args;

    public CmpltStmt() {
        this.parser = new NullParser();

    }
    public void genCode(String[] args) {
        mem.add(CMPLT);
        pc++;

    }
}