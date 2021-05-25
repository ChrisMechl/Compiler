import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main{
    public static void main(String[] args){
        String[] stmtClasses = {"RetStmt", "CallStmt", "DeclStmt", "SubrStmt", "PrintiStmt", "CmpeStmt", "CmpltStmt", "CmpgtStmt", "SwpStmt", "AddStmt", "SubStmt", "MulStmt", "DivStmt", "LabStmt", "JmpStmt", "JmpcStmt", "PushiStmt", "PushviStmt", "PopmStmt", "PopvStmt", "PeekStmt", "PokeStmt", "PrintviStmt"};
        String[] stmts = {"ret", "call", "lab","subr", "printi", "decl", "printv", "jmp", "jmpc", "cmpe", "cmplt", "cmpgt", "pushi", "pushv", "popm", "popv", "peek", "poke", "swp", "add", "sub", "mul", "div"};
        ArrayList<String> source = new ArrayList<String>();
        String statement;
        BufferedReader reader;

        String filename = args[0];
        String writePath = filename.substring(0, filename.length() -3 ) + "smp";

        try{
            reader = new BufferedReader(new FileReader(filename));
            String line;
            StatementFactory.createStmts(); 
            while((line = reader.readLine()) != null) {
                if(line.length() > 0){ //ignores newlines
                    char first = line.charAt(0);
                    if(first != '/'){ //ignores comments
                        source.add(line); //adds each full line to source array
                        String[] tokens = token(line); //parsed tokens
                        String token1 = tokens[0];
                        if(token1 != null){
                            if(Arrays.asList(stmts).contains(token1)){
                                Stmt stmt = StatementFactory.getStatement(token1);
                                stmt.genCode(tokens); 
                            }
                            else{
                                System.out.println("Unknown stmt: " + token1);
                            }
                        }
                    }
                }
            }
            reader.close();
            byte[] b = memToByte(Stmt.mem);
            writeToFile(b, writePath);
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        Iterator i = source.iterator();
        while(i.hasNext()){
            i.next();
        }
    }

    public static String[] token(String line){
        String[] tokens = line.split("\\s"); //splits on spaces
        return tokens;
    }

    public static byte[] memToByte(ArrayList<Integer> mem){
        byte[] b = new byte[mem.size()];
        for(int i = 0; i < mem.size(); i++){
            int val = mem.get(i);
            if(mem.get(i) >= 256){ 
                b[i++] = (byte) val;
                b[i++] = (byte) (val >>> 8);
                b[i++] = (byte) (val >>> 16);
                b[i] = (byte) (val >>> 24);                 
            }
            else {
                System.out.println(val);
                b[i] = (byte) val;
            }
        }
        return b;
    }

    public static void writeToFile(byte[] toWrite, String output){
        try{
            OutputStream os = new FileOutputStream(output);
            os.write(toWrite);
            os.close();
    
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}