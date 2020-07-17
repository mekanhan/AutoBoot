package DiagnosticTest;

public class q67 {
    public static void main(String [ ] args) {
        char[ ] chars = {'1','Z','0','-','8','1'};
        StringBuilder sb = new StringBuilder();
        sb.append(chars,0,chars.length-1); // offset removes beginning and len removes ending
        sb.append('0');
        sb.append("8");
        System.out.print(sb);
    }
}
