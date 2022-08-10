import java.util.Scanner;

public class Vending {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t****************************************");
        System.out.println("\t\tVENDING MACHINE");
        System.out.println("\t****************************************");
        Items[][] item = new Items[][] {
            {new Items("Pepsi",20,3),new Items("Coca",20,2)},
            {new Items("Fanta",10,2),new Items("Mirinda",10,3)}
        };
        Machine machine = new Machine(item);
        boolean flag = true;
        while(flag){
            System.out.println(machine);
            System.out.println("Pick a row: ");
            int row = scanner.nextInt();
            System.out.println("Pick a Column");
            int col = scanner.nextInt();
            boolean res = machine.dispense(row, col);
            System.out.println(machine);
            if(res){
                System.out.println("Enjoy the Drink!");
                System.out.println("Do You need Another Drink? (1 for Yes/0 for No)");
                int choice = scanner.nextInt();
                if(choice==1)
                    flag=true;
                else
                    flag=false;
            }
            
        }
        scanner.close();
    }
}
