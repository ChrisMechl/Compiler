public class SubrStmt extends Stmt {
    private Parser parser;
    private String[] args;

    public SubrStmt() {
        this.parser = new SIParser();
    }
    public void genCode(String[] args) {
        String[] first = {"pushi", "16"};
        String[] second = {"pushi", "17"}; 
        String[] third = {"pushi", "1"};

        Stmt pushi = new PushiStmt();
        pushi.genCode(first);
        pushi.genCode(second);
        pushi.genCode(third);

        mem.add(Stmt.CALL);
        mem.add(Stmt.HALT);
        pc += 2;
    }
}