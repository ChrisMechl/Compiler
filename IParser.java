public class IParser extends Parser{
    ArgObj parse(String[] s) {
        ArgObj argObj = new IArgObj(s[1]);
        return argObj;
    }
}