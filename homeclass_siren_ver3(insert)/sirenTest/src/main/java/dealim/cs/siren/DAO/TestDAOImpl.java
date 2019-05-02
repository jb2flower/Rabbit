package dealim.cs.siren.DAO;

import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import dealim.cs.siren.bean.TestBean;

@Repository//DAO�� �������� �ν� ��Ŵ //DAO��� ��� (DAO�� ���������� �νĽ�����)
public class TestDAOImpl implements TestDAO{//����� *Mapper.xml�� namespace��
	private static final String namespace="dealim.cs.siren.mappers.testMapper";
	
	@Inject//DBĿ�ؼǰ� Ŭ��� �ڵ����� ���ִ� SqlSession // �������踦 �ڵ����� ����(JAVA���� ����) ==@autowired (Spring���� ����)
	private SqlSession sqlSession;
	
	@Override
	public List<TestBean> user_db() throws Exception {//*Mapper.xml �������� id
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+".user_db");
		//row�� 1�� �̻��� select���� ������Ű�� �޼ҵ�
	}
    //memberMapper.xml�� namespace��
	@Override
	public void user_insert(TestBean vo) throws Exception{
		// TODO Auto-generated method stub
		 sqlSession.insert(namespace+".user_insert", vo);
	}
	
}
