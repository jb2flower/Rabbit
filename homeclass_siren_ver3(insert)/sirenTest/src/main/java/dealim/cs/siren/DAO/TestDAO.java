<<<<<<< HEAD
package dealim.cs.siren.DAO;

import java.util.List;
import dealim.cs.siren.bean.TestBean;

public interface TestDAO {
	public List<TestBean> user_db() throws Exception;
	public void user_insert(TestBean vo) throws Exception;
}

//TestDAO �������̽����� DB���� ������� �޼ҵ���� �Է����ݴϴ�.
//��ȯ �Ǵ� DB���� ���� row�̱� ������ List<E>�� ���ϰ����� �������ݴϴ�.
=======
package dealim.cs.siren.DAO;

import java.util.List;
import dealim.cs.siren.bean.TestBean;

public interface TestDAO {
	public List<TestBean> user_db() throws Exception;
	public void user_insert(TestBean vo) throws Exception;
}

//TestDAO �������̽����� DB���� ������� �޼ҵ���� �Է����ݴϴ�.
//��ȯ �Ǵ� DB���� ���� row�̱� ������ List<E>�� ���ϰ����� �������ݴϴ�.
>>>>>>> 3d7f0d00237b3cbfd5e754bbf7676b2b0da9e90c
//<E>�� ��ü�� ������� Bean�� import�ؼ� �־��ݴϴ�.