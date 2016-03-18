package baixuejianmsl;

public class paqiuligo {
public String checkiftri(int a,int b,int c){
	if(a == b && b == c)
	    return "等边" ;
	else if (a == b || b == c || a == c)
        return "等腰" ;
	else
		return "啥也不是" ;
}
}
