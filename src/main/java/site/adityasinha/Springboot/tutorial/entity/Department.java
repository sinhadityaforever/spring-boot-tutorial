package site.adityasinha.Springboot.tutorial.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Entity
//Data comes from lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long departmentId;
    @NotBlank(message="Please add Department name")
//    @Length(max=5, min=2)
//    @Size(max=10, min=1)
//    @Email
//    @Positive
//    @PositiveOrZero
//    @FutureOrPresent
//    @PastOrPresent
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;


}
