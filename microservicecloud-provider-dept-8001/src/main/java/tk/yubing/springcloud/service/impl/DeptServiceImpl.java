package tk.yubing.springcloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.yubing.springcloud.entities.Dept;
import tk.yubing.springcloud.dao.DeptDao;
import tk.yubing.springcloud.service.DeptService;

import java.util.List;

/**
 * @author YuBing
 * @version V1.0
 * @description 业务逻辑实现
 * @package tk.yubing.springcloud.service.impl
 * @className DeptServiceImpl
 * @create 2019-11-21 16:22
 **/
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;
    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
