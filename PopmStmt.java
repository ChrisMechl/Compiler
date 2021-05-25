public class PopmStmt extends Stmt {
    private Parser parser;
    private String[] args;

    public PopmStmt() {
        this.parser = new IParser();

    }
    public void genCode(String[] args) {
        Stmt stmt = new PushiStmt();

        stmt.genCode(args);

        mem.add(POPM);
        pc++;
    }
}