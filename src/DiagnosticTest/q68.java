package DiagnosticTest;

public class q68 {
    public static void main(String [ ] args) {
        char [ ] chars = {'1','Z','0','-','8','1'};
        StringBuilder sb = new StringBuilder();
        sb.append(chars,0,chars.length-1);
        sb.append("08");
        sb.setLength(4);
        sb.insert(10, "10"); //str adds value/char in front of length
        //if offset value exceeds the length then outOfBound Exception
        System.out.print(sb);

    }
}
