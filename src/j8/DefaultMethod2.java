package j8;

public interface DefaultMethod2 {
	default String zp (String para){
		System.out.println("DefaultMethod2");
		return para;
	}
}
