package dealim.cs.siren.DAO;

import java.util.List;
import dealim.cs.siren.bean.TestBean;

public interface TestDAO {
	public List<TestBean> user_db() throws Exception;
	public void user_insert(TestBean vo) throws Exception;
}

//TestDAO �������̽����� DB���� ������� �޼ҵ���� �Է����ݴϴ�.
//��ȯ �Ǵ� DB���� ���� row�̱� ������ List<E>�� ���ϰ����� �������ݴϴ�.
//<E>�� ��ü�� ������� Bean�� import�ؼ� �־��ݴϴ�.