package Question2;

import java.util.function.Function;

public class MyFunction implements Function<String, Integer>{

	@Override
	public Integer apply(String t) {
		// TODO Auto-generated method stub
		if(t=="subham") {
			return 100;
		}else {
			return 0;
		}
	}
	
	
}
