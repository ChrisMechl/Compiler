public class PrintiStmt extends Stmt {
    private Parser parser;
    private String[] args;

    public PrintiStmt() {
        this.parser = new IParser();
    }
    
    public void genCode(String[] args) {
        Stmt stmt = new PushiStmt();

        stmt.genCode(args);
        mem.add(Stmt.PRINTI);
        pc++;
        

    }
}