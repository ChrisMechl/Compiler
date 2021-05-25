public class RetStmt extends Stmt {
    private Parser parser;
    private String[] args;

    public RetStmt() {
        this.parser = new NullParser();
    }
    public void genCode(String[] args) {
        Stmt stmt = new PushiStmt();
        String[] s = {"pushi", "0"};

        stmt.genCode(s);

        mem.add(POPA);
        mem.add(RET);
        pc += 2;
    }
}