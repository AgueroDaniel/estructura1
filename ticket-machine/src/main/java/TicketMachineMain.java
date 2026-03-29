import java.util.Arrays;

public class TicketMachineMain {

    public static void main(String[] args) {
        TicketMachine maquina1 = new TicketMachine(32);
        TicketMachine maquina2 = new TicketMachine();
        maquina2.empty();
        maquina1.showPrice();
        maquina2.showPrice();    
        /*
        System.out.println("Arguments: " + Arrays.toString(args));
        TicketMachine machine = new TicketMachine(10);
        machine.insertMoney(10);
        boolean res = machine.printTicket();
        System.out.println("Result: " + res);
        System.out.println("Remaining money: " + machine.getBalance());
        */
    }

}
