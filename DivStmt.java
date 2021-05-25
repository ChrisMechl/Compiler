public class DivStmt extends Stmt {
    private Parser parser;
    private String[] args;

    public DivStmt() {
        this.parser = new NullParser();

    }
    public void genCode(String[] args) {
        mem.add(DIV);
        pc++;
    }
}