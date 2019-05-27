<<<<<<< HEAD
package dealim.cs.siren.DAO;

import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import dealim.cs.siren.bean.TestBean;

@Repository//DAO를 스프링에 인식 시킴 //DAO라고 명시 (DAO를 스프링에서 인식시켜줌)
public class TestDAOImpl implements TestDAO{//사용할 *Mapper.xml의 namespace명
	private static final String namespace="dealim.cs.siren.mappers.testMapper";
	
	@Inject//DB커넥션과 클로즈를 자동으로 해주는 SqlSession // 의존관계를 자동으로 연결(JAVA에서 제공) ==@autowired (Spring에서 제공)
	private SqlSession sqlSession;
	
	@Override
	public List<TestBean> user_db() throws Exception {//*Mapper.xml 쿼리문의 id
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+".user_db");
		//row가 1개 이상인 select문을 구동시키는 메소드
	}
    //memberMapper.xml의 namespace값
	@Override
	public void user_insert(TestBean vo) throws Exception{
		// TODO Auto-generated method stub
		 sqlSession.insert(namespace+".user_insert", vo);
	}
	
}
=======
package dealim.cs.siren.DAO;

import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import dealim.cs.siren.bean.TestBean;

@Repository//DAO를 스프링에 인식 시킴 //DAO라고 명시 (DAO를 스프링에서 인식시켜줌)
public class TestDAOImpl implements TestDAO{//사용할 *Mapper.xml의 namespace명
	private static final String namespace="dealim.cs.siren.mappers.testMapper";
	
	@Inject//DB커넥션과 클로즈를 자동으로 해주는 SqlSession // 의존관계를 자동으로 연결(JAVA에서 제공) ==@autowired (Spring에서 제공)
	private SqlSession sqlSession;
	
	@Override
	public List<TestBean> user_db() throws Exception {//*Mapper.xml 쿼리문의 id
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+".user_db");
		//row가 1개 이상인 select문을 구동시키는 메소드
	}
    //memberMapper.xml의 namespace값
	@Override
	public void user_insert(TestBean vo) throws Exception{
		// TODO Auto-generated method stub
		 sqlSession.insert(namespace+".user_insert", vo);
	}
	
}
>>>>>>> 3d7f0d00237b3cbfd5e754bbf7676b2b0da9e90c
