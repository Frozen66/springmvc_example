package edu.ncst.entity;



import javax.persistence.*;

/**
 * Created by dell on 2018/10/30.
 */
@Entity
@Table(name="user")
/*orm
o是object在这表示的entity;r即表示关系数据库relation;
表对应数据库的一个表*/
public class User {
    @Id
    /*@Id 标注用于声明一个实体类的属性映射为数据库的主键列。*/
    @GeneratedValue(strategy = GenerationType.AUTO)
    /*@GeneratedValue 用于标注主键的生成策略，通过strategy 属性指定。默认情况下，JPA 自动选择一个最适合底层数据库的主键生成策略：
    SqlServer对应identity，MySQL 对应 auto increment。*/
    private Integer id;
    private String name;
    /*字段名称可以不一样，比如userName
    *@Column(nam=”userName” length=20)
    * */
    private String password;
    private Integer sex;
    private String hobby;
    private String major;
    private  String introduce;

    public Integer getSex() {return sex;}

    public void setSex(Integer sex) {  this.sex = sex; }

    public String getHobby() {  return hobby;  }

    public void setHobby(String hobby) {this.hobby = hobby;}

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) { this.introduce = introduce; }

    public Integer getId() {return id; }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
