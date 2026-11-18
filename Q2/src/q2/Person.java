package q2;
public class Person {
    private String name,address,phoneNumber,emailAddress;
    public Person(){
    }
    public Person(String n,String a,String p,String e){
        name=n;
        address=a;
        phoneNumber=p;
        emailAddress=e;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String a){
        address=a;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String p){
        phoneNumber=p;
    }
    public String getEmailAddress(){
        return emailAddress;
    }
    public void setEmailAddress(String e){
        emailAddress=e;
    }
    public String toString(){
        return "Person: "+name;
    }
}
