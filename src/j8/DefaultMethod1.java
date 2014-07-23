package j8;

public interface DefaultMethod1 {
	String hi();
	default void wangxi (String para){
		System.out.println("DefaultMethod1");
	}
}
