package ourbusinessproject;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    @Size(min=1, max=1000)
    private String title;

    private String description;
    @NotNull @ManyToOne
    private Enterprise enterprise;

    public Project() {}

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    /**
     * Set the enterprise attached to the project
     * @param enterprise the enterprise
     */
    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    /**
     *
     * @return the enterprise of the project
     */
    public Enterprise getEnterprise() {
        return enterprise;
    }
}
