package fi.syksy2021.Friend.List.domain;

public class Friend {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Friend [name=" + name + "]";
}


}

