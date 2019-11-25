package tk.yubing.ribbon;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.yubing.ribbon.rule.MyRibbonRule;

/**
 * @author YuBing
 * @version V1.0
 * @description //
 * @package tk.yubing.ribbon
 * @className MyRoundRule
 * @create 2019-11-25 22:05
 **/
@Configuration
public class MyRoundRule {
    @Bean
    public IRule getMyRule () {
        //return new RandomRule();
        return new MyRibbonRule();
    }
}
