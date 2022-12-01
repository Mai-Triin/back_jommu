package ee.valiit.back_jommu.domain.exercisetemplate;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
@Table(name = "exercise_template")
public class ExerciseTemplate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @NotNull
    @Column(name = "description", nullable = false)
    @Type(type = "org.hibernate.type.TextType")
    private String description;

    @NotNull
    @Column(name = "img_data", nullable = false)
    private byte[] imgData;

}