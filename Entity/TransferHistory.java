import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;

@Entity
@Table(name = "ech_transfer_history",
        indexes = @Index(name = "idx_name_ech_transfer_history", columnList = "name, district_code_from, district_code_to, tranfer_id_from"))
public class TransferHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    private Integer districtCodeFrom;

    private Integer districtCodeTo;

    private Integer transferIdFrom;

    private Integer transferIdTo;

    private Integer transferredBy;

    private Integer type;

    @NotBlank
    private String userTypeFrom;

    @NotBlank
    private String userTypeTo;

    @NotNull
    private ZonedDateTime createdAt;

    @NotNull
    private ZonedDateTime updatedAt;

    public TransferHistory() {
        // default constructor
    }

    // getters and setters omitted for brevity

}
