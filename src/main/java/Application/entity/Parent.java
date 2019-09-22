package Application.entity;

import javax.persistence.*;

@Entity
@Table(name = "parents", schema = "parents")
public class Parent {

    /** Id родителя */
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "parent_Id")
    private Integer parent_Id;

    /** Фамилия */
    @Column(name = "surname")
    private String surname;

    /** Имя */
    @Column(name = "name")
    private String name;

    /** Отчество */
    @Column(name = "middleName")
    private String middleName;

    /** Номер телефона */
    @Column(name = "phoneNumber")
    private String phoneNumber;

    /** Номер телефона для связи */
    @Column(name = "contactPhoneNumber")
    private String contactPhoneNumber;


    // ПАСПОРТ

    /** Серия паспорта */
    @Column(name = "passportSeries")
    private String passportSeries;

    /** Номер паспорта */
    @Column(name = "passportID")
    private String passportID;

    /** Кем выдан паспорт */
    @Column(name = "passportIssuedBy")
    private String passportIssuedBy;

    /** Дата выдачи паспорта */
    @Column(name = "passportIssueDate")
    private String passportIssueDate;

    /** Код подразделения выдачи паспорта */
    @Column(name = "unitCode")
    private String unitCode;


    // ДОГОВОР

    /** Дата заключения договора */
    @Column(name = "dateContract")
    private String dateContract;

    /** Номер договора */
    @Column(name = "contractNumber")
    private String contractNumber;

    // ДЕТИ

    /** ID детей */
    @Column(name = "childrenId")
    private String childrenId;

    public Parent() {
    }

    public Parent(Integer parent_Id, String surname,
                  String name, String middleName,
                  String phoneNumber, String contactPhoneNumber,
                  String passportSeries, String passportID,
                  String passportIssuedBy, String passportIssueDate,
                  String unitCode, String dateContract,
                  String contractNumber, String childrenId) {

        this.parent_Id = parent_Id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.phoneNumber = phoneNumber;
        this.contactPhoneNumber = contactPhoneNumber;
        this.passportSeries = passportSeries;
        this.passportID = passportID;
        this.passportIssuedBy = passportIssuedBy;
        this.passportIssueDate = passportIssueDate;
        this.unitCode = unitCode;
        this.dateContract = dateContract;
        this.contractNumber = contractNumber;
        this.childrenId = childrenId;
    }

    public Integer getId() {
        return parent_Id;
    }

    public void setId(Integer parent_Id) {
        this.parent_Id = parent_Id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public String getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
    }

    public String getPassportID() {
        return passportID;
    }

    public void setPassportID(String passportID) {
        this.passportID = passportID;
    }

    public String getPassportIssuedBy() {
        return passportIssuedBy;
    }

    public void setPassportIssuedBy(String passportIssuedBy) {
        this.passportIssuedBy = passportIssuedBy;
    }

    public String getPassportIssueDate() {
        return passportIssueDate;
    }

    public void setPassportIssueDate(String passportIssueDate) {
        this.passportIssueDate = passportIssueDate;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getDateContract() {
        return dateContract;
    }

    public void setDateContract(String dateContract) {
        this.dateContract = dateContract;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getChildrenId() {
        return childrenId;
    }

    public void setChildrenId(String childrenId) {
        this.childrenId = childrenId;
    }
}
