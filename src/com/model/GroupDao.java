package com.model;

import java.util.List;

public interface GroupDao {
	public boolean CreateGroupByName(Person person);
	public boolean AddGroupMember(Person person);
	public boolean deleteGroupMember(Person person);
	public List<Person> listAllGroupMember();
	public boolean isGroupAdmin(Person person);
	public boolean setAdminByGroupMember(Person person);
	public boolean isExistedGroupName(Group group);
}
