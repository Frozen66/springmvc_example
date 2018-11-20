package edu.ncst.dao;

import edu.ncst.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by dell on 2018/10/30.
 */
@Repository
/*@Repository用于标注数据访问组件*/
public interface UserDao extends JpaRepository<User,Integer>{
    /*接口里边只有方法的声明,没有实现,接口不能实例化
    * 各个类之间的调用 如果直接调，需要知道包,,
    *接口是一个规范，类用来实现接口，jpa不需要实现！
    * 尖括号泛型<>Integer代表主键字段成员的类型（如果一个表没有主键则不能这样使用。）
    * */
}
