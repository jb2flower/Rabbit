<<<<<<< HEAD
package dealim.cs.siren.DAO;

import java.util.List;
import dealim.cs.siren.bean.TestBean;

public interface TestDAO {
	public List<TestBean> user_db() throws Exception;
	public void user_insert(TestBean vo) throws Exception;
}

//TestDAO 인터페이스에서 DB값을 출력해줄 메소드명을 입력해줍니다.
//반환 되는 DB값이 여러 row이기 때문에 List<E>를 리턴값으로 지정해줍니다.
=======
package dealim.cs.siren.DAO;

import java.util.List;
import dealim.cs.siren.bean.TestBean;

public interface TestDAO {
	public List<TestBean> user_db() throws Exception;
	public void user_insert(TestBean vo) throws Exception;
}

//TestDAO 인터페이스에서 DB값을 출력해줄 메소드명을 입력해줍니다.
//반환 되는 DB값이 여러 row이기 때문에 List<E>를 리턴값으로 지정해줍니다.
>>>>>>> 3d7f0d00237b3cbfd5e754bbf7676b2b0da9e90c
//<E>의 객체는 출력해줄 Bean을 import해서 넣어줍니다.