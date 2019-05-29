package day51_inheritance05;

public class AtTheGym {
	public static void main(String[] args) {
		
		Exercise e = new Exercise();
		Running r = new Running();
		Swimming s = new Swimming();
		Yoga y = new Yoga();
		JuiJitsu j = new JuiJitsu();
		
		Sprinting sp = new Sprinting();
		
		System.out.println(e.perform(30));
		System.out.println(r.perform(30));
		System.out.println(s.perform(30));
		System.out.println(y.perform(30));
		System.out.println(j.perform(30));
		
		System.out.println(sp.perform(30)); //this was called by Running class > Running
																			   //300
		System.out.println();
		
		Exercise e2 = new Running();  //this calls from Running class
		System.out.println(e2.perform(30));
		
		System.out.println("--------------------");
		Snowboarding sn = new Snowboarding();
		System.out.println(sn.perform(30));
				
//		Performing general exercise   > super.perform(10) calls this from Exercise()
//		Snowboarding for 30 minutes  > this from Snowboard() class... 7x30= 210
//		210
		
		
		
		
	}

}
