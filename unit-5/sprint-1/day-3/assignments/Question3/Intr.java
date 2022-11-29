package Question3;

import java.util.Map;

@FunctionalInterface
public interface Intr {
	public Map<String, Student> sortMapUsingStudentName(Map<String, Student> originalMap);

}
