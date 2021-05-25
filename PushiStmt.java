import java.util.ArrayList;

public class PushiStmt extends Stmt {
    private Parser parser;
    private String[] args;

    public PushiStmt() {
        this.parser = new IParser();    
    }
    
    public void genCode(String[] args) {
        ArgObj argObj = parser.parse(args);
        mem.add(Stmt.PUSHI);
        mem.add(argObj.getInt());
        mem.add(0);
        mem.add(0);
        mem.add(0);
        pc += 5;
    }
}