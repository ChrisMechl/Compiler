import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Stmt {
    private Parser parser;
    private String[] args;

    public static final int HALT = 0;
    public static final int JMP = 36;
    public static final int JMPC = 40;
    public static final int PUSHI = 70;
    public static final int PUSHVI = 74;
    public static final int POPM = 76;
    public static final int POPA = 77;
    public static final int POPV = 80;
    public static final int PEEKI = 86;
    public static final int POKEI = 90;
    public static final int SWP = 94;
    public static final int ADD = 100;
    public static final int SUB = 104;
    public static final int MUL = 108;
    public static final int DIV = 112;
    public static final int CMPE = 132;
    public static final int CMPLT = 136;
    public static final int CMPGT = 140;
    public static final int PRINTI = 146;
    public static final int CALL = 44;
    public static final int RET = 48;

    public static final int LABEL = -1;
    public static final int SHORT = 0;
    public static final int INT = 1;
    public static final int FLOAT = 2;

    public static ArrayList<Integer> mem = new ArrayList<Integer>();
    
    public static int sc = 0;
    public static int pc = -1;
    public static int fo = -1;

    public static Map<String, Integer> symbol_table = new HashMap<String, Integer>();
    public static Map<String, ArrayList<Integer>> unknown_label = new HashMap<String, ArrayList<Integer>>();
    
    public void genCode(final String[] args) {}
}