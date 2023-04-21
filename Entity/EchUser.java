import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "ech_users")
public class EchUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Size(max = 100)
    private String username;

    @NotNull
    @Size(max = 100)
    private String password;

    @NotNull
    @Size(max = 255)
    private String name;

    @NotNull
    @Size(max = 200)
    @Column(name = "employee_id")
    private String employeeId;

    @NotNull
    @Size(max = 100)
    @Column(name = "email_id")
    private String emailId;

    @NotNull
    @Column(name = "mobile_no")
    private int mobileNo;

    @Column(name = "designation_id")
    private int designationId;

    @NotNull
    @Column(name = "role_id")
    private int roleId;

    @Size(max = 70)
    @Column(name = "user_type")
    private String userType;

    @Size(max = 20)
    @Column(name = "branch_type")
    private String branchType;

    @NotNull
    @Column(name = "is_active")
    private int isActive;

    @NotNull
    @Column(name = "is_suspended")
    private int isSuspended;

    @Size(max = 2)
    @Column(name = "state_code")
    private String stateCode;

    @Column(name = "district_code")
    private int districtCode;

    @Column(name = "circle_id")
    private int circleId;

    @NotNull
    @Column(name = "court_id")
    private int courtId;

    @NotNull
    @Column(name = "dept_code")
    private int deptCode;

    @NotNull
    @Column(name = "office_code")
    private int officeCode;

    @NotNull
    @Column(name = "device_id")
    private int deviceId;

    @NotNull
    @Size(max = 255)
    @Column(name = "device_token")
    private String deviceToken;

    @Size(max = 50)
    private String imei;

    @NotNull
    @Size(max = 255)
    @Column(name = "device_name")
    private String deviceName;

    @NotNull
    @Column(name = "is_cctv")
    private int isCctv;

    @NotNull
    @Column(name = "is_mparivahan")
    private int isMparivahan;

    @NotNull
    @Column(name = "is_ngo")
    private int isNgo;

    @NotNull
    @Column(name = "notify_me")
    private int notifyMe;

    @Size(max = 20)
    private String latitude;

    @Size(max = 20)
    private String longitude;

   
