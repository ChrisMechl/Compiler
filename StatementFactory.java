import java.util.HashMap;
import java.util.Map;

public class StatementFactory {
    private static String[] stmts = {"ret", "lab","subr", "decl", "printi", "jmp", "jmpc", "cmpe", "cmplt", "cmpgt", "pushi", "pushv", "popm", "popv", "peek", "poke", "swp", "add", "sub", "printv", "mul", "div"};
        
    private static Map<String,Stmt> statements = new HashMap<String,Stmt>( ); 
    
    public static void createStmts() {
        for (int i = 0; i < stmts.length; i++) {
            Stmt stmt;
            switch(stmts[i]) {
                case("cmpe"): 
                    stmt = new CmpeStmt();
                    statements.put(stmts[i], stmt);
                    break;
                case("cmplt"): 
                    stmt = new CmpltStmt();
                    statements.put(stmts[i], stmt);
                    break;
                case("cmpgt"): 
                    stmt = new CmpgtStmt();
                    statements.put(stmts[i], stmt);
                    break;
                case("printv"):
                    stmt = new PrintviStmt();
                    statements.put(stmts[i], stmt);
                    break;
                case("swp"): 
                    stmt = new SwpStmt();
                    statements.put(stmts[i], stmt); 
                    break;
                case("add"): 
                    stmt = new AddStmt();
                    statements.put(stmts[i], stmt); 
                    break;
                case("sub"):
                    stmt = new SubStmt();
                    statements.put(stmts[i], stmt);  
                    break;
                case("mul"): 
                    stmt = new MulStmt();
                    statements.put(stmts[i], stmt); 
                    break;
                case("div"):
                    stmt = new DivStmt();
                    statements.put(stmts[i], stmt);  
                    break;
                case("lab"):
                    stmt = new LabStmt();
                    statements.put(stmts[i], stmt);   
                    break;
                case("printi"):
                    stmt = new PrintiStmt();
                    statements.put(stmts[i], stmt);  
                    break;
                case("jmp"):
                    stmt = new JmpStmt();
                    statements.put(stmts[i], stmt);    
                    break;
                case("jmpc"):
                    stmt = new JmpcStmt();
                    statements.put(stmts[i], stmt);   
                    break;
                case("pushi"):
                    stmt = new PushiStmt();
                    statements.put(stmts[i], stmt);       
                    break;
                case("pushv"):
                    stmt = new PushviStmt();
                    statements.put(stmts[i], stmt);  
                    break;
                case("popm"):
                    stmt = new PopmStmt();
                    statements.put(stmts[i], stmt);   
                    break;
                case("popv"):
                    stmt = new PopvStmt();
                    statements.put(stmts[i], stmt);   
                    break;
                case("decl"):
                    stmt = new DeclStmt();
                    statements.put(stmts[i], stmt);  
                    break;
                case("subr"):
                    stmt = new SubrStmt();
                    statements.put(stmts[i], stmt);  
                    break;
                case("peek"):
                    stmt = new PeekStmt();
                    statements.put(stmts[i], stmt);  
                    break;
                case("poke"):
                    stmt = new PokeStmt();
                    statements.put(stmts[i], stmt);  
                    break;
                case("ret"):
                    stmt = new RetStmt();
                    statements.put(stmts[i], stmt);
                    break;
                }
            }   
    }

    public static Stmt getStatement(String stmt) {
        Stmt obj = statements.get(stmt);
        if (obj == null) {
            System.out.println("Error getting state for class " + stmt);
        }
        return obj;
    }
    
    
}