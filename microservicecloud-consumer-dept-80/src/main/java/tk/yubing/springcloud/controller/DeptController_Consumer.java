package tk.yubing.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import tk.yubing.springcloud.entities.Dept;

import java.util.List;

/**
 * @author YuBing
 * @version V1.0
 * @description //
 * @package tk.yubing.springcloud.controller
 * @className DeptController_Consumer
 * @create 2019-11-21 17:32
 **/

@RestController
public class DeptController_Consumer {

    @Autowired
    private RestTemplate restTemplate;

    @Value(value = "${provider.url}")
    private String providerUrl;

    @GetMapping(value = "/consumer/1")
    public Integer get() {
        return 1;
    }
    @PostMapping(value = "/consumer/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return restTemplate.postForObject(providerUrl, dept, Boolean.class);
    }

    @GetMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable Long id) {
        System.out.println(providerUrl + "/dept/get/" + id);
        return restTemplate.getForObject(providerUrl + "/dept/get/" + id, Dept.class);
    }


    @GetMapping(value = "/consumer/dept/list")
    public List<Dept> list() {
        return restTemplate.getForObject(providerUrl + "/dept/list/", List.class);
    }
}
