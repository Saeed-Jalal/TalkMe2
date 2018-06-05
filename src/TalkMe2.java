public class TalkMe2 {
    //instance variable or fields
    String appName;
    int appAge;

    //Constructor
    TalkMe2(String name, int age){
        this.appName = name;
        this.appAge = age;

    }
    public static void main(String args[]){
        //creating objects
        TalkMe2 obj1 = new TalkMe2("TalkMe",1);
        TalkMe2 obj2 = new TalkMe2("Whatsapp",10);

        //Accessing object data through reference
        System.out.println(obj1.appName+" "+obj1.appAge);
        System.out.println(obj2.appName+" "+obj2.appAge);
    }
}
