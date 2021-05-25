public class CmpgtStmt extends Stmt {
    private Parser parser;
    private String[] args;

    public CmpgtStmt() {
        this.parser = new NullParser();
    }
    public void genCode(String[] args) {
        mem.add(CMPGT);
        pc++;
    }
}