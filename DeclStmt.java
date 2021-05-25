public class DeclStmt extends Stmt {
    Parser parser;
    String[] args;

    public DeclStmt() {
        this.parser = new SIParser();
    }
    public void genCode(String[] args) {
        String var = args[1];
        String var_name = "main" + "_" + var;

        symbol_table.put(var_name, ++fo);
        String[] s = {"pushi", "0"};
        Stmt stmt = new PushiStmt();
        stmt.genCode(s);
    }
}