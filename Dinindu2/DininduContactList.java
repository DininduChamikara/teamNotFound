// incomplete

class DininduContactList extends DininduContact {

    DininduContact DC1 = new DininduContact();
    
    // Question 06
    public void addContact(String name, String phoneNo){
        DC1.name.add(name);
        DC1.phoneNo.add(phoneNo);
    }

    public void deleteContact(int position){
        DC1.name.remove(position);
        DC1.phoneNo.remove(position);
    }

    

}