public class PokeStmt extends Stmt {
    private Parser parser;
    private String[] args;

    public PokeStmt() {
        this.parser = new SIParser();

    }
    public void genCode(String[] args) {
        Stmt stmt = new PushiStmt();

        String[] s = {"pushi", Integer.toString(symbol_table.get("main_" + args[2]))};
        stmt.genCode(s);

        s[1] = args[1];
        stmt.genCode(s);

        mem.add(POKEI);
        pc++;
    }
}