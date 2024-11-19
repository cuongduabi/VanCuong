package bai1;
import java.util.*;
public class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //khoi tao cac bien
        String name,  dob,  pob,  email,  phone;
        char gender;
        boolean check = false;
        Person x = new Person();
        //input
        while(!check){
            try{
                check = true;
                System.out.println("Nhap thong tin cho mot nguoi: ");
                System.out.println("Name: ");
                name = sc.nextLine();
                System.out.println("Date of birth: ");
                dob = sc.nextLine();
                System.out.println("Place of birth: ");
                pob = sc.nextLine();
                System.out.println("Email: ");
                email = sc.nextLine();
                System.out.println("Phone number: ");
                phone = sc.nextLine();
                System.out.println("Gender: ");
                gender = sc.nextLine().charAt(0);
                System.out.println(name + " " + dob + " " + pob + " " + email+ " " + phone + " " + gender);
                x = new Person(name, dob, pob, email, phone, gender);
            }catch(Exception e){
                check = false;
                System.out.println("Nhap thong tin bi loi can nhap lai!");
            }
        }
        //output
        System.out.println(x);
        
    }

    
}
