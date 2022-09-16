package cbnu.capstone.tripwithme.security;
// User의 상속. 스프링 시큐리티는 이 객체에 저장 된 정보를 사용하여, 인증 및 권한부여를 수행.
import com.fasterxml.jackson.annotation.JsonIgnore;
import cbnu.capstone.tripwithme.entity.User.User;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class UserPrincipal implements UserDetails {
    private Long id;

    private String name;

    private String userid;

    private String phone_number;

    private int birth;

    @JsonIgnore
    private String password;

    private Collection<? extends GrantedAuthority> authorities;

    public UserPrincipal(Long id, String name, String userid, String phone_number, String password,
                         Collection<? extends GrantedAuthority> authorities , int birth) {
        this.id = id;
        this.name = name;
        this.userid = userid;
        this.phone_number = phone_number;
        this.password = password;
        this.authorities = authorities;
        this.birth = birth;
    }

    public static UserPrincipal create(User user) {
        List<GrantedAuthority> authorities = user.getRoles().stream()
                .map(role -> new SimpleGrantedAuthority(role.getName().name())).collect(Collectors.toList());

        return new UserPrincipal(user.getId(), user.getName(), user.getUserid(), user.getPhone_number(), user.getPassword(),
                authorities, user.getbirth());
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public int getbirth() {
        return birth;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override // userid get
    public String getUsername() {
        return userid;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        UserPrincipal that = (UserPrincipal) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }
}