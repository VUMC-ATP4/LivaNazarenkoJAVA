package homework.oop_homework;

public class Customer {

    private String name;
    private boolean member= false;
    private String memberType;

    public Customer(String name) //boolean member, String memberType)
    {
        this.name = name;
//        this.member = member;
//        this.memberType = memberType;
    }
    public String getName() {
        return name;
    }
    public boolean isMember() {
        return member;
    }
    public String getMemberType() {
        return memberType;
    }
    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", member=" + member +
                ", memberType='" + memberType + '\'' +
                '}';
    }
}