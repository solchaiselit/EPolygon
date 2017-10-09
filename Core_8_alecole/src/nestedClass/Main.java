package nestedClass;

import nestedClass.Judge.Punishment.Prison;
import nestedClass.OuterClass.MemberClass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Judge.Punishment punishment = new Judge.Punishment();
		
		Prison prison = new Prison();
		
		punishment.inStaticClassMethod();
		
		System.out.println();
		
		OuterClass outerClass = new OuterClass();
		MemberClass memberClass = outerClass.createMemberClass();
		
		memberClass.memberClassMethod();
		
			
		outerClass.createMemberClassMethod()
		
	}

}
