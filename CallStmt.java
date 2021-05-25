public class CallStmt extends Stmt {
    private Parser parser;
    private String[] args;

    public CallStmt() {
        this.parser = new NullParser();
    }

    public void genCode(String[] args) {
        
    }
}