

class NPMember {
		String firstname
		String lastname
		String role
		String emailid
		Date joined
    static constraints = {
		firstname()
		lastname()
		role(inList: ["Board", "Member", "Volunteer"])
		emailid(email: true)
		joined()
	}
}

