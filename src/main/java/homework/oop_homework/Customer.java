package homework.oop_homework;

public class Customer {

    String name;
    boolean isMember;
    String memberType;

    public Customer(String name, boolean isMember, String memberType) {
        this.name = name;
        this.isMember = isMember;
        this.memberType = memberType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMember() {
        return isMember;
    }

    public void setMember(boolean member) {
        isMember = member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }
}
