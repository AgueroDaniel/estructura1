
/**
 * Main class for Lab-classes project
 */
public class LabClassMain {

    public static void main(String[] args) {
      Student ricador = new Student("Ricardo Cardoso","12");
      Student chino = new Student("chinoso","13");
      LabClass EStruCturaAAAa = new LabClass(3);
      EStruCturaAAAa.enrollStudent(chino);
      EStruCturaAAAa.enrollStudent(ricador);
      System.out.print(EStruCturaAAAa.toString());
    }
}
