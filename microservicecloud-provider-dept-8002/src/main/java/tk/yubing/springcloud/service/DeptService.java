package tk.yubing.springcloud.service;

import tk.yubing.springcloud.entities.Dept;

import java.util.List;

/**
 * @author YuBing
 * @version V1.0
 * @description //
 * @package tk.yubing.springcloud.service
 * @className DeptService
 * @create 2019-11-21 16:19
 **/
public interface DeptService {
    /**
     * @description 添加部门
     * @auther YuBing
     * @date 2019-11-21 16:21
     * @param dept :
     * @return : boolean
     **/
    boolean add(Dept dept);

    /**
     * @description 根据Id查询
     * @auther YuBing
     * @date 2019-11-21 16:21
     * @param deptNo :
     * @return : tk.yubing.soringcloud.entities.Dept
     **/
    Dept get(Long deptNo);

    /**
     * @description 查询所有
     * @auther YuBing
     * @date 2019-11-21 16:21
     * @return : java.util.List<tk.yubing.soringcloud.entities.Dept>
     **/
    List<Dept> list();
}
