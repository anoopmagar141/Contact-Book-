import java.util.ArrayList;
import java.util.Scanner;

class ContactBookManager {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public void start() {
        System.out.println("Contact Book Manager Initialized.");
    }
}

public class ContactBook {
    public static void main(String[] args) {
        System.out.println("Welcome to Contact Book!");
    }
}
class Contact {
    private String name, phone, email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name + " | Phone: " + phone + " | Email: " + email;
    }
}
