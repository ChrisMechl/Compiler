public class MulStmt extends Stmt {
    private Parser parser;
    private String[] args;

    public MulStmt() {
        this.parser = new NullParser();
    }
    public void genCode(String[] args) {
        mem.add(MUL);
        pc++;
    }
}