package Application.entity;

import javax.persistence.*;

@Entity
@Table(name = "employees", schema = "employees")
public class Employee {

    /** Id акта */
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name = "fio")
    private String fio;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "position")
    private String position;

    public Employee() {
    }

    public Employee(Integer id, String fio, String phoneNumber, String position) {
        this.id = id;
        this.fio = fio;
        this.phoneNumber = phoneNumber;
        this.position = position;
    }

    public Employee(String fio, String position, String phoneNumber) {
        this.fio = fio;
        this.phoneNumber = phoneNumber;
        this.position = position;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
