public class Main {

  public Main(String[] args) {
    System.out.println("Constructor");
  }

  public void run() {
    System.out.println("Hello workd!");
  }

  public static void main(String[] args) {
    System.out.println("This is the Carmine Zagaria Main!");

    System.out.println("This is by raffmont");

    Main main=new Main(args);
    main.run();
  }

}
