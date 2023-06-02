package abstraction;

import java.io.Serializable;
import java.util.List;

public interface UserService extends CommonService,Serializable,List<String>{

	 // int MAX = 700;
	//20 times // 5 
	void addUser();
	void deleteUser(); 
	
	default void update(Integer a) {
		//self implementation in impl. class
	}
	
	static void getUsers() {
		
		//common impl. for all impl. classes
	}
	
}
