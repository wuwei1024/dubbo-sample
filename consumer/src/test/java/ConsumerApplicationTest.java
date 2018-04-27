import com.alibaba.dubbo.config.annotation.Reference;
import com.test.service.ProviderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: wuwei
 * @date: 2018/4/27 10:49
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ConsumerApplicationTest.class)
public class ConsumerApplicationTest {


    @Reference(group = "test", version = "1.0.0")
    private ProviderService providerService;

    @Test
    public void hello() {
        System.out.println(providerService.hello());
    }
}
