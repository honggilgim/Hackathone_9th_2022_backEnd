package cbnu.capstone.tripwithme.entity.User;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users", uniqueConstraints = { @UniqueConstraint(columnNames = { "userid" }) })
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // id 번호

    @NotBlank // 이름
    @Size(max = 40)
    private String name;

    @NaturalId // id
    @NotBlank
    @Size(max = 40)
    @Email
    private String userid;

    @NotBlank
    @Size(max = 100)
    private String password;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    @NotBlank // 핸드폰번호
    @Size(max = 30)
    private String phone_number;

    @NotBlank // 생년월일
    @Size(max = 15)
    private int birth;

    public User() {

    }

    public User(String name, String userid, String password, String phone_number, int birth) {
        this.name = name;
        this.userid = userid;
        this.password = password;
        this.phone_number = phone_number;
        this.birth = birth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getbirth() {
        return birth;
    }

    public void setbirth(int birth) {
        this.birth = birth;
    }
}