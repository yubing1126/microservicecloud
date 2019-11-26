package tk.yubing.springcloud.fallback;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import tk.yubing.springcloud.entities.Dept;
import tk.yubing.springcloud.server.DeptClientServer;

import java.util.List;

/**
 * @author YuBing
 * @version V1.0
 * @description //
 * @package tk.yubing.springcloud.fallback
 * @className DeptClientServiceFallackFactory
 * @create 2019-11-26 18:32
 **/
@Component
public class DeptClientServiceFallackFactory implements FallbackFactory<DeptClientServer> {
    @Override
    public DeptClientServer create(Throwable throwable) {
        return new DeptClientServer() {
            @Override
            public Dept get(Long id)
            {
                return new Dept().setDeptNo(id).setDeptName("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
                        .setDbSource("no this database in MySQL");
            }

            @Override
            public List<Dept> list()
            {
                return null;
            }

            @Override
            public boolean add(Dept dept)
            {
                return false;
            }
        };
    }
}
