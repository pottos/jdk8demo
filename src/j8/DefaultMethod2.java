package j8;

public interface DefaultMethod2 {
	default String wangxi1 (String para){
		System.out.println("DefaultMethod2");
		return para;
	}
}
