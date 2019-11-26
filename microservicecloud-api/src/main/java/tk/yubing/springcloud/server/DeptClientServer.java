package tk.yubing.springcloud.server;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;
import tk.yubing.springcloud.entities.Dept;
import tk.yubing.springcloud.fallback.DeptClientServiceFallackFactory;

import java.util.List;

/**
 * @author YuBing
 * @version V1.0
 * @description //
 * @package tk.yubing.springcloud.server
 * @className DeptClientServer
 * @create 2019-11-26 10:42
 **/
@FeignClient(value = "MICROSERVICESPRINGCLOUD-DEPT", fallbackFactory = DeptClientServiceFallackFactory.class)
public interface DeptClientServer {

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept);

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id);


    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list();


}
