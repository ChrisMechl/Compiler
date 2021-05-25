public class AddStmt extends Stmt {
    private Parser parser;
    private String[] args;

    public AddStmt() {
        this.parser = new NullParser();
    }
    public void genCode(String[] args) {
        mem.add(Stmt.ADD);
        pc++;
    }
}