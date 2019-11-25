package tk.yubing.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import tk.yubing.springcloud.entities.Dept;
import tk.yubing.springcloud.service.DeptService;

import java.util.List;

/**
 * @author YuBing
 * @version V1.0
 * @description Dept Controller层
 * @package tk.yubing.springcloud.controller
 * @className DeptController
 * @create 2019-11-21 16:25
 **/

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;
    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/dept/add")
    boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    @GetMapping(value = "/dept/get/{id}")
    Dept get(@PathVariable Long id) {
        return deptService.get(id);
    }

    @GetMapping(value = "/dept/list")
    List<Dept> list() {
        return deptService.list();
    }

    @GetMapping(value = "/dept/discovery")
    public Object discovery() {
        List<String> list = discoveryClient.getServices();
        System.out.println("**********" + list);
        List<ServiceInstance> srvList = discoveryClient.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t"
                    + element.getHost() + "\t"
                    + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.discoveryClient;
    }

}
