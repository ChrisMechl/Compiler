public class SubStmt extends Stmt {
    private Parser parser;
    private String[] args;

    public SubStmt() {
        this.parser = new NullParser();
    }
    public void genCode(String[] args) {
        mem.add(SUB);
        pc++;
    }
}