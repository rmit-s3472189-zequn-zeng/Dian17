package com.model;

import java.util.List;

public class GroupDaoImplemenet implements GroupDao {

	@Override
	public boolean CreateGroupByName(Person person) {
		return false;
	}

	@Override
	public boolean AddGroupMember(Person person) {
		return false;
	}

	@Override
	public boolean deleteGroupMember(Person person) {
		return false;
	}

	@Override
	public List<Person> listAllGroupMember() {
		return null;
	}

	@Override
	public boolean isGroupAdmin(Person person) {
		return false;
	}

	@Override
	public boolean setAdminByGroupMember(Person person) {
		return false;
	}

	@Override
	public boolean isExistedGroupName(Group group) {
		return false;
	}

}
