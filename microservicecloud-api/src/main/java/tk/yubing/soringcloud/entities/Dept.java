package tk.yubing.soringcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.io.Serializable;

/**
 * @author YuBing
 * @version V1.0
 * @description //
 * @package tk.yubing.soringcloud.entities
 * @className Dept
 * @create 2019-11-21 14:38
 * @blame yubing
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {
    /**
     * 部门编码 主键
     */
    private Long deptNo;
    /**
     * 部门名称
     */
    private String deptName;
    /**
     * 数据库名称
     */
    private String dbSource;
}
