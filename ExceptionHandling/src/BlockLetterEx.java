public class BlockLetterEx extends Exception {
    BlockLetterEx(String s){
        super(s);
    }
}

class BlockLetter{
    public static void main(String[] args){
        try{
            ch('b');
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static void ch(char a) throws BlockLetterEx{
        if(a>='A' && a<='Z'){
            throw new BlockLetterEx("Capital Letter");
        }
        else
            System.out.println("Small Letter");
    }
}