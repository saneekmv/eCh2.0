import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "ech_mst_area_circles")
public class AreaCircle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 255)
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "district_code")
    private Integer districtCode;

    @NotBlank
    @Size(max = 2)
    @Column(name = "state_code", nullable = false)
    private String stateCode;

    @Column(name = "type")
    private Integer type;

    @NotBlank
    @Size(max = 255)
    @Column(name = "address", nullable = false)
    private String address;

    @NotBlank
    @Size(max = 255)
    @Column(name = "office_type", nullable = false)
    private String officeType;

    @Column(name = "is_active")
    private Integer isActive = 1;

    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;

    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;

    // Getters and setters omitted for brevity

    @PrePersist
    public void prePersist() {
        Instant now = Instant.now();
        this.createdAt = now;
        this.updatedAt = now;
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = Instant.now();
    }
}
