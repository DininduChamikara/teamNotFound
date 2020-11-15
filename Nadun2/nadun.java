import java.util.*;

public class Contact{
    private String name;
    private String PhoneNo; 

    public Contact(name , PhoneNo){
        this.name = name;
        this.PhoneNo = PhoneNo;
    }

    public String getName(){
        return name;
    }

    public String getPhoneNo(){
        return PhoneNo;
    }


    
}

public class ContactList{
    int sequence = 0;
    public static void main(String[] args) {
        ArrayList<Contact> contactlist = new ArrayList<Contact>();
        contactlist.add("Volvo");
        Scanner sc = new Scanner(System.in);

        while(1){
                System.out.print(
                "• Enter 1 to display all contacts\n
                 • Enter 2 to add contact\n
                 • Enter 3 to remove contact\n
                 • Enter 4 to edit a contact\n
                 • Enter 5 to load contacts from a text file.\n
                 • Enter 6 to save contacts to the text file.\n
                 • Enter 7 to exit from the program"\n
                )
            
            int input = sc.nextInt();
            
            //displayContacts
            if(input == 1){
            System.out.println(contactlist);
            }

            //addContact
            if(input == 2){
                addContact();   
            }

            //deleteContact
            if(input == 3){
                deleteContact(contactlist.name);
            }

            //editContact
            if(input == 4){
                
            }

            //loadContacts
            if(input == 5){
                
            }

            //saveContacts
            if(input == 6){

            }

            //end
            if(input == 7){
                break;
            }

            //input val
            else{
            System.out.println("Invalid Input!");
            }
        }
    
    public void addContact(){
        Scanner in = new Scanner(System.in);
        System.out.print( “Please enter name :” );

        String addInputname = in.nextLine();
        
        System.out.print(“Please add phone number :”);
        String addInputNo = in.nextLine();
        
        Contact entry = new Contact( addInputName , addInputNo);
        contactlist.add(entry);
        sequence++;
    }

    public void deleteContact(contactlist.entry.name){
        cars.remove(0);
    }
}