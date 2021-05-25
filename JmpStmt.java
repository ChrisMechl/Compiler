import java.util.ArrayList;

public class JmpStmt extends Stmt {
    private Parser parser;
    private String[] args;

    public JmpStmt() {
        this.parser = new SParser();

    }
    public void genCode(String[] args) {
        if (!symbol_table.containsKey("main_" + args[1])) {
            if(!unknown_label.containsKey(args[1])){
                ArrayList<Integer> pcs = new ArrayList<Integer>();
                pcs.add(pc + 2);
                unknown_label.put(args[1], pcs);
            }
            else{
                ArrayList<Integer> temp = unknown_label.get(args[1]);
                temp.add(pc + 2);
            }
            
            Stmt stmt = new PushiStmt();

            String[] s = {"pushi", "0"};
            stmt.genCode(s);
            mem.add(JMP);
            pc++;
        }
        else {
            Stmt stmt = new PushiStmt();

            String[] s = {"pushi", Integer.toString(symbol_table.get("main" + "_" + args[1]))};
            stmt.genCode(s);
            mem.add(JMP);
            pc++;
        }
    }
}