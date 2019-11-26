package tk.yubing.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import tk.yubing.springcloud.entities.Dept;
import tk.yubing.springcloud.server.DeptClientServer;

import java.util.List;

/**
 * @author YuBing
 * @version V1.0
 * @description //
 * @package tk.yubing.springcloud.controller
 * @className DeptController_Consumer
 * @create 2019-11-21 17:32
 * @blame
 */

@RestController
public class DeptController_Consumer {

    @Autowired
    private DeptClientServer deptClientServer;

    @PostMapping(value = "/consumer/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return this.deptClientServer.add(dept);
    }

    @GetMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable Long id) {
        return this.deptClientServer.get(id);
    }

    @GetMapping(value = "/consumer/dept/list")
    public List<Dept> list() {
        return deptClientServer.list();
    }

}
