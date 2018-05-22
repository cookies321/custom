package com.holyrobot;

import com.holyrobot.bean.User;
import com.holyrobot.common.utils.JedisUtils;
import com.holyrobot.dao.UserRepository;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomApplicationTests {

	@Autowired
	private JedisUtils jedisUtils;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ElasticsearchTemplate elasticsearchTemplate;

	@Test
	public void contextLoads() {

		//jedisUtils.set("sss","ssss");
		User user = new User(1,"张三",18);
		userRepository.save(user);
	}

	@Test
	public void deleteRepository(){
		User user = new User(1,"张三",18);
		userRepository.deleteById(user.getId());
	}
	@Test
	public void getRepository(){
		Iterable<User> all = userRepository.findAll();
		for (User user : all) {
			System.out.println(user);
		}
	}
	@Test
	public void getList(){
		QueryStringQueryBuilder query = new QueryStringQueryBuilder("张");
		Iterable<User> search = userRepository.search(query);
		for (User user : search) {
			System.out.println(user);
		}
	}

	@Test
	public void templateLoads() {
		List<IndexQuery> listQuery=new ArrayList<IndexQuery>();
		User user = new User(2,"李四",20);
		IndexQuery build = new IndexQueryBuilder().withId(user.getId() + "").withObject(user).build();
		listQuery.add(build);
		elasticsearchTemplate.bulkIndex(listQuery);
	}

}
