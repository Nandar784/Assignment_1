package A2;

public class SecondsToHMSConverter {
	int s,m,h,h1,m1;
	
	public void convert(int sec) {
		s=sec;
		h=sec/3600;
		h1=sec%3600;
		m=h1/60;
		m1=h1%60;
		s=m1%60;
	   System.out.println(sec +" seconds equals "+ h+":"+m+":"+s);
		
		
		
	}

}
