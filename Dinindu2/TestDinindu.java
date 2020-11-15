import java.util.Scanner;
class TestDinindu{
    public static void main(String [] args){
        int choice = 0;
        String name, phoneNo;

        // create an object
        Dinindu D1 = new Dinindu();
        DininducontactList DCL = new DininducontactList();
        Scanner sc = new Scanner(System.in);

        while (choice != 7){
            D1.printList();
            System.out.println();
            System.out.print("Enter the number : ");
            choice = sc.nextInt();
        }

        if (choice==1){

        }
        else if (choice==2){
            DCL.addContact(name, phoneNo);
        }
    }

}

