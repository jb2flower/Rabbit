<<<<<<< HEAD
package dealim.cs.siren.sevice;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import dealim.cs.siren.DAO.TestDAO;
import dealim.cs.siren.bean.TestBean;



@Service

public class TestServiceImpl implements TestService {

	@Inject
	private TestDAO dao;
	
	@Override
	public List<TestBean> user_db() throws Exception {
		// TODO Auto-generated method stub
		return dao.user_db();

	}

	@Override
	public void user_insert(TestBean vo) throws Exception{
		// TODO Auto-generated method stub
		dao.user_insert(vo);
	}
}
=======
package dealim.cs.siren.sevice;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import dealim.cs.siren.DAO.TestDAO;
import dealim.cs.siren.bean.TestBean;



@Service

public class TestServiceImpl implements TestService {

	@Inject
	private TestDAO dao;
	
	@Override
	public List<TestBean> user_db() throws Exception {
		// TODO Auto-generated method stub
		return dao.user_db();

	}

	@Override
	public void user_insert(TestBean vo) throws Exception{
		// TODO Auto-generated method stub
		dao.user_insert(vo);
	}
}
>>>>>>> 3d7f0d00237b3cbfd5e754bbf7676b2b0da9e90c
