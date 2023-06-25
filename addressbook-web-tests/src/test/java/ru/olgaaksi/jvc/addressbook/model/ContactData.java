package ru.olgaaksi.jvc.addressbook.model;

public class ContactData {
  private final String contactName;
  private final String middleName;
  private final String surname;
  private final String nickname;
  private final String title;
  private final String company;
  private final String address;
  private final String homePhone;
  private final String mobilePhone;
  private final String email;
  private final String birthDay;
  private final String birthMonth;
  private final String birthYear;

  public ContactData(String contactName, String middleName, String surname, String nickname, String title, String company, String address, String homePhone, String mobilePhone, String email, String birthDay, String birthMonth, String birthYear) {
    this.contactName = contactName;
    this.middleName = middleName;
    this.surname = surname;
    this.nickname = nickname;
    this.title = title;
    this.company = company;
    this.address = address;
    this.homePhone = homePhone;
    this.mobilePhone = mobilePhone;
    this.email = email;
    this.birthDay = birthDay;
    this.birthMonth = birthMonth;
    this.birthYear = birthYear;
  }

  public String getContactName() {
    return contactName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public String getSurname() {
    return surname;
  }

  public String getNickname() {
    return nickname;
  }

  public String getTitle() {
    return title;
  }

  public String getCompany() {
    return company;
  }

  public String getAddress() {
    return address;
  }

  public String getHomePhone() {
    return homePhone;
  }

  public String getMobilePhone() {
    return mobilePhone;
  }

  public String getEmail() {
    return email;
  }
}
