package baixuejianmsl;

public class paqiuligo {
public String checkiftri(int a,int b,int c){
	if(a == b && b == c)
	    return "�ȱ�" ;
	else if (a == b || b == c || a == c)
        return "����" ;
	else
		return "ɶҲ����" ;
}
}
