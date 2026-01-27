package ourbusinessproject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 * Classe Enterprise
 */
@Entity
public class Enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotBlank
    private String name;
    @Size(min = 10, max = 50)
    private String description;
    @NotBlank
    private String contactName;
    @NotBlank
    @Email
    private String contactEmail;

    /**
     * Set the name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set the Description
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Set the contact name
     * @param contactName
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     * Set the contact email
     * @param contactEmail
     */
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
}
