public class PushviStmt extends Stmt {
    private Parser parser;
    private String[] args;

    public PushviStmt() {
        this.parser = new IParser();
    }
    public void genCode(String[] args) {
        Stmt stmt = new PushiStmt();
        String[] s = {"pushi", Integer.toString(symbol_table.get("main" + "_" + args[1]))};
        stmt.genCode(s);

        mem.add(PUSHVI);
        pc++;

    }
}