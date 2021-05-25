import java.util.ArrayList;

public class LabStmt extends Stmt {
    private Parser parser;
    private String[] args;

    public LabStmt() {
        this.parser = new SParser();

    }
    public void genCode(String[] args) {
        if (unknown_label.containsKey(args[1])) {
            ArrayList<Integer> values = unknown_label.get(args[1]);

            for (Integer val : values) {
                mem.set(val, pc + 1);        
            }
        }
        symbol_table.put("main_" + args[1], pc + 1);
    }
}