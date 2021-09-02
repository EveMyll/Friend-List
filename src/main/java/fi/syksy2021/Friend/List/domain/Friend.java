package fi.syksy2021.Friend.List.domain;

public class Friend {
private String firstName, lastName;

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

@Override
public String toString() {
	return "Friend [firstName=" + firstName + ", lastName=" + lastName + "]";
}

}
