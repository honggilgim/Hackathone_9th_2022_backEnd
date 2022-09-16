package cbnu.capstone.tripwithme.service.payload.request;

import javax.validation.constraints.*;

public class SignUpRequest {
    @NotBlank
    @Size(min = 4, max = 40)
    private String name;

    @NotBlank
    @Size(min = 3, max = 15)
    private String userid;

    @NotBlank
    @Size(min = 6, max = 20)
    private String password;

    @NotBlank
    @Size(min = 3, max = 15)
    private String phone_number;

    @NotBlank
    @Size(max = 15)
    private int birth;

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