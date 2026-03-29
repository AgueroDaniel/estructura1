public class HeaterMain {

    public static void main(String[] args) {
        Heater termostato = new Heater(5.0,25.0);
        System.out.printf("\nOriginal: %.2f%n",termostato.temperature);
        termostato.coler();
        termostato.coler();
        System.out.printf("\nbajo x2: %.2f%n",termostato.temperature);
        termostato.setIncrement(10);
        termostato.warmer();
        System.out.printf("\nVer2: %.2f%n",termostato.temperature);
        termostato.warmer();
        termostato.warmer();
        System.out.printf("\nVer2: %.2f%n",termostato.temperature);
    }
}