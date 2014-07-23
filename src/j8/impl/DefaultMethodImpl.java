package j8.impl;

import j8.DefaultMethod1;
import j8.DefaultMethod2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DefaultMethodImpl implements DefaultMethod1, DefaultMethod2 {

	@Override
	public String hi() {
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
		Collections.sort(names, (a, b) -> b.compareTo(a));
		return null;
	}

}
