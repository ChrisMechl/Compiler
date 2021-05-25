public class CmpeStmt extends Stmt {
    private Parser parser;
    private String[] args;

    public CmpeStmt() {
        this.parser = new NullParser();
    }
    public void genCode(String[] args) {
        mem.add(Stmt.CMPE);
        pc++;
    }
}