class Main {

  public static void main (String[] args) {
    zahlenfilter();
  } 
  public static void zahlenfilter() {
    System.out.println("Hello Elena!");
    for (int i=0; i<=200; i++) {

      if ((i%5)==0) {
        System.out.println("ZAHL ist durch 5 teilbar!");
      }

      if ((i%10)==9 && (i!=0)) {
        System.out.println("ZAHL endet auf 9!");
      }

      if (((i + (i-1))%3)==0) {
        System.out.println("ZAHL und VORGÄNGER addiert ergeben ERGEBNIS und ERGEBNIS ist durch 3 teilbar!");
      }
    }
}
}
