package tk.yubing.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import tk.yubing.springcloud.entities.Dept;

import java.util.List;

/**
 * @author YuBing
 * @version V1.0
 * @description //
 * @package tk.yubing.springcloud.dao
 * @className DeotDao
 * @create 2019-11-21 16:05
 **/

@Mapper
public interface DeptDao {
    /**
     * @description 添加部门
     * @auther YuBing
     * @date 2019-11-21 16:07
     * @param dept :
     * @return : boolean
     **/
    public boolean addDept(Dept dept);

    /**
     * @description 根据Id获取部门
     * @auther YuBing
     * @date 2019-11-21 16:08
     * @param id :
     * @return : tk.yubing.soringcloud.entities.Dept
     **/
    public Dept findById(Long id);

    /**
     * @description 查询所有部门
     * @auther YuBing
     * @date 2019-11-21 16:09
     * @return : java.util.List<tk.yubing.soringcloud.entities.Dept>
     **/
    public List<Dept> findAll();
}
