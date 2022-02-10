//member class
class MemberCLass {
    String name, profession;
    int age;

    public MemberCLass(String name, int age, String profession) {
        System.out.println("I am a member");
        this.name = name;
        this.age = age;
        this.profession = profession;
    }
}

class VIPmember extends MemberCLass {
    public VIPmember(String name, int age, String profession) {
        super(name, age, profession);
        System.out.println("I am a VIP member");
    }
}

class RegularMember extends MemberCLass {
    public RegularMember(String name, int age, String profession) {
        super(name, age, profession);
        System.out.println("I am a Regular member");
    }
}


public class MembershipAssignment {
    public static void main(String[] args)
    {
        VIPmember vip = new VIPmember("Sam Roxton", 35, "Lawyer");
        RegularMember regular = new RegularMember("Poppy Wyatt", 36, "Artist");
    }
}
