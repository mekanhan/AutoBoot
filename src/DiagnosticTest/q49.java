package DiagnosticTest;

 class q49 {
     int x = 013;
     public static void main(String [ ] args) {
         q49 pr = new q49();
         pr.go(22);
     }
     void go(final int i) {
         System.out.print(i/x);
     }
}
