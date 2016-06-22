import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.capsui.bean.Temp;
import com.capsui.service.TempFlowService;

/**
 * Created by tancw on 2016/6/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-all.xml"})
public class SprintTest {

    @Autowired
    private TempFlowService tempFlowService;

    @Test
    public void test(){
        System.out.println("begin");
        List<Temp> result = tempFlowService.list();
    }
}
