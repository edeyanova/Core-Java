
public class Pair {
	private Object first_member;
	private Object second_member;
	
	public Pair(Object first_member, Object second_member) {
        this.first_member = first_member;
        this.second_member = second_member;
    }

	public Object getfirst_member(){
		return this.first_member;
	}
	public Object getsecond_member(){
		return this.second_member;
	}
	public void setfirst_member(Object first_member){
		 this.first_member=first_member;
	}
	public void setsecond_member(Object second_member){
		this.second_member=second_member;
	}
	public Pair(Pair other) {
        this(other.first_member, other.second_member);
    }

	public String toString(){
		return String.format("member (%d)", first_member.toString(),second_member.toString());
	}
	public Object equals(Pair pair){
		return this.first_member.equals(pair.first_member)&&this.second_member.equals(pair.second_member);	
	}
	
}
