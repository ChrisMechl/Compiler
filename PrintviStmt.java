public class PrintviStmt extends Stmt {
    private Parser parser;
    private String[] args;

    public PrintviStmt() {
        this.parser = new IParser();

    }
    public void genCode(String[] args) {
        Stmt stmt = new PushviStmt();
        
        stmt.genCode(args);

        mem.add(PRINTI);
        pc++;
    }
} 