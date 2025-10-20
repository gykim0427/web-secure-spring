package com.geun.wss;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.geun.wss.user.entity.UserEntity;
import com.geun.wss.user.repository.UserRepository;

@SpringBootTest
class WebSecureSpringApplicationTests {
	
	@Autowired
	private UserRepository userRepository;
	
    private static final Logger logger = LoggerFactory.getLogger(WebSecureSpringApplicationTests.class);
    
	@Test
	void contextLoads() {
	}

	@Test
    void simpleAdditionTest() {
        // test simple logic
        int a = 2;
        int b = 3;
        int result = a + b;
        
        System.out.println("junit Test :: Sysout :: Result : " + result);
        logger.info("junit Test :: logger :: Result : ", result);	// logging level requires resetting
        
        assertEquals(5, result, "2 + 3 = 5 >>> true");
    }
	
	@Test
	void testFindAllUser() {
		List<UserEntity> allUser = userRepository.findAll();
		allUser.forEach(u -> System.out.println("User: " + u.getUserId() + ", " + u.getUserNm()));
	}
}
