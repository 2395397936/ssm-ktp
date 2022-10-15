import com.pys.dao.CourseMapper;
import com.pys.dao.UserMapper;
import com.pys.service.CourseService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration("src/main/resources")
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class Test {
    @Autowired
    UserMapper userMapper;
    @Autowired
    CourseService courseService;
    @Autowired
    CourseMapper courseMapper;
    @org.junit.Test
    public void test1(){
//        System.out.println(courseMapper.queryAllUserByCourse(Arrays.asList(new String[] {"12023020111"})));
        System.out.println(courseService.queryAllUserByCourse("999"));
    }

    @org.junit.Test
    public void test2(){
        courseService.joinCourse("11111111111","f","2",2);
    }
}
