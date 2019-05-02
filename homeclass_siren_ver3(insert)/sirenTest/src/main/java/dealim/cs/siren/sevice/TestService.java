package dealim.cs.siren.sevice;

import java.util.List;
import dealim.cs.siren.bean.TestBean;


public interface TestService {
	public List<TestBean> user_db() throws Exception;
	public void user_insert(TestBean vo) throws Exception;
}
