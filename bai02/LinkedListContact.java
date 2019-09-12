package bai02;

import java.util.LinkedList;

public class LinkedListContact {
   private LinkedList<Contact> listPhone = new LinkedList<Contact>();

    public void disPlay() {
        for (Contact phone:listPhone) {
            System.out.println(phone);
        }
    }
    public void addContact(Contact contact){
        listPhone.add(contact);
    }
    public void EditContact(int index,Contact contact) {
        listPhone.set(index,contact);
    }
    public void deleteContact(String phoneNumber) {
        for (int i = 0; i < listPhone.size(); i++) {
            if(listPhone.get(i).getPhoneNumber() == phoneNumber) {
                listPhone.remove(i);
            }
        }
    }
    public void searchByFirstName(String firstName) {
        boolean check = false;
        for (int i = 0; i < listPhone.size();i++) {
            if (listPhone.get(i).getFirstName() == firstName) {
                check = true;
            }else {
                check = false;
            }
        }
        if (check) {
            System.out.println(firstName + " have at list phone");
        }
        else {
            System.out.println(firstName + " have not in list");
        }
    }

    public void searchByLastName(String lastName) {
        boolean check = false;
        for (int i = 0; i < listPhone.size();i++) {
            if (listPhone.get(i).getLastName() == lastName) {
                check = true;
            }else {
                check = false;
            }
        }
        if (check) {
            System.out.println(lastName + " have at list phone");
        }else {
            System.out.println(lastName + " have not in list");
        }
    }
    public void searchByNumber(String phoneNumber) {
        boolean check = false;
        for (int i = 0; i < listPhone.size() ; i++) {
            if (listPhone.get(i).getPhoneNumber() == phoneNumber) {
                check = true;
            }else {
                check = false;
            }
        }
        if (check) {
            System.out.println(phoneNumber  + "has at list");
        }
        else {
            System.out.println(phoneNumber + " hava not in list");
        }
    }




    public static void main(String[] args) {
        Contact phone1 = new Contact("Nguyen","A","0123456");
        Contact phone2 = new Contact("Nguyen","B","123456");
        Contact phone3= new Contact("Nguyen","c","223456");
        Contact phne4 = new Contact();

        LinkedListContact listPhone = new LinkedListContact();
        listPhone.addContact(phone1);
        listPhone.addContact(phone2);
        listPhone.addContact(phone3);
//        listPhone.disPlay();
        listPhone.EditContact(2,phne4);


//        listPhone.disPlay();
        listPhone.deleteContact("0123456");
        System.out.println();
        listPhone.disPlay();
        listPhone.searchByLastName("B");
        listPhone.searchByNumber("123456");

}
}
