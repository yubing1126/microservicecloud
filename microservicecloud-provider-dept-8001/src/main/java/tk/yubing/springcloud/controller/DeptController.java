package tk.yubing.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
    DeptService deptService;

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


}
