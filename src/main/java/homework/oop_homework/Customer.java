package homework.oop_homework;

public class Customer {

    String name;
    boolean isMember;
    String memberType;

    public Customer(String name, boolean isMember, String memberType) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberType() {
        return memberType;
    }

    public String isMember(){
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", isMember=" + isMember +
                ", memberType='" + memberType + '\'' +
                '}';
    }
}
