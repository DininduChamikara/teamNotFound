import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class Test1 {
Scanner sc=new Scanner(System.in);
Contact cont1=new Contact();
int user;

  public static void main(String[] args) {
  print();
  input_user()
//question 3
while (user!=7)
    {
      if (user==1)
      {
       displayContact();
      }
      if (user==2)
      {
        System.out.println("Please enter name");//question 7
        c1.setName(sc.nextString());
        System.out.println("Please enter phone number");
        c1.setPhoneNo(sc.nextString());
        addContact(c1.getName() ,c1.getPhoneNo());
      }
      if (user==3)
      {//question 9
        System.out.println("Please enter name of the contact that you want to delete");
        c1.setName(sc.nextString());
        System.out.println("Please enter phone number");
        c1.setPhoneNo(sc.nextString());
        deleteContact(c1.getName() ,c1.getPhoneNo());
      }
      if (user==4)
      {//question 8
        System.out.println("Please enter name of the contact that you want to change");
        c1.setName(sc.nextString());
        System.out.println("Please enter phone number");
        c1.setPhoneNo(sc.nextString());
        editContact(c1.getName() ,c1.getPhoneNo());
      }
      if (user==5)
      {
        loadContact();//question 11
      }
      if (user==6)
      {
        saveContact();
      }
    input_user()
    print();
    }
}
 
  }

//question 1
static void print()
{
System.out.println("Enter 1 to display all contacts");
System.out.println("Enter 2 to add contact");
System.out.println("Enter 3 to remove contact");
System.out.println("Enter 4 to edit a contact");
System.out.println("E nter 5 to load contacts from a text file");
System.out.println("Enter 6 to save contacts to the text file");

}

//question 2
static void input_user()
{
System.out.println("Enter number to select option");
user=sc.nextInt();
}

//question 4
class Contact{
private Stirng name;
private String phoneNo;

public void setName(name)
{
  this.name=name
}
public void setPhoneNo(phoneNo)
{
  this.phoneNo=phoneNo;
}
public void getName()
{
  return name;
}
public void getPhoneNo()
{
  return phoneNo;
}
}

//question 5
 class ContactList {
  
    ArrayList<String> arryname = new ArrayList<String>();
    ArrayList<String> arryphone = new ArrayList<String>();

    Contact cont2=new Contact();
    Scanner sc =new Scanner(System.in);
    File myObj = new File("filename.txt");

//question 6
public void addContact(String name ,String phone){
//question 7
arryname.add(name);
arryphone.add(phone);
}

public void deleteContact(String name ,String phone){
 arryname.remove(name) ;
 arryphone.remove(phone);
}

public void editContact(String name ,String phone){
    int no=arryname.indexOf("b"));//find element number
    arryphone.set(no,phone);
}

public void displayContact(){// question 10
   for (int i = 0; i < arryname.size(); i++) {
      System.out.println(arryname.get(i)+"   "+arryphone.get(i));
    }

}

public void saveContact(){//question 12
 try {
            File myObj = new File("codelist.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
             } 
            else {
            System.out.println("File already exists.");
            }
        } 
        catch (IOException e) {
            System.out.println("An error occurred.");
        e.printStackTrace();
        }

    
        try {
            FileWriter myWriter = new FileWriter("codelist.txt");
            myWriter.write(displayContact());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } 
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

      }

}

public void loadContact(){//question 11
try {
      File myObj = new File("codelist.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    
}
 
