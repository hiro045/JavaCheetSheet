package jp.hirokanecheet.sheet.dto;

import jp.hirokanecheet.sheet.constants.Status;
import lombok.Data;

@Data
public class Person {
    private Status status;
    private String firstName;
    private String lastName;
    private String firstNameKana;
    private String lastNameKane;
    private String tel;
    private String address;
    private String mailAddress;
}
